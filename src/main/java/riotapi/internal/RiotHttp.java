package riotapi.internal;

import riotapi.api.RiotAPIException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;
import java.util.logging.Logger;

public class RiotHttp {

    private final HttpClient httpClient;
    private final String apiKey;
    private final ObjectMapper mapper;

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public RiotHttp(@NotNull String apiKey) {
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalArgumentException(
                    "API key must not be null or blank"
            );
        }
        httpClient = HttpClient.newHttpClient();
        this.apiKey = apiKey;

        mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

        mapper.addHandler(new DeserializationProblemHandler() {
            @Override
            public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser p,
                                                 JsonDeserializer<?> deserializer,
                                                 Object beanOrClass, String propertyName) throws IOException {
                String dto = beanOrClass instanceof Class<?> c
                        ? c.getSimpleName()
                        : beanOrClass.getClass().getSimpleName();
                JsonNode value = p.readValueAsTree();
                logger.warning(() -> "Unmapped field [" + propertyName + "] in " + dto + " = " + value);
                return true;
            }
        });
    }

    public <T> T get(String host, String path, Class<T> type){
        return parse(send(host, path, Map.of()), mapper.constructType(type));
    }
    public <T> T get(String host, String path, Class<T> type, Map<String, String> headers){
        return parse(send(host, path, headers), mapper.constructType(type));
    }

    public <T> T get(String host, String path, TypeReference<T> type) {
        return parse(send(host, path, Map.of()), mapper.constructType(type));
    }


    private <T> T parse(String response, JavaType type) {
        try {
            return mapper.readValue(response, type);
        } catch(JsonProcessingException e) {
            throw new RiotAPIException("JSON Mapping failed",e);
        }
    }

    private String send(String host, String path, Map<String, String> headers) {
        String uri = "https://" + host + path;
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("X-Riot-Token", apiKey)
                .timeout(Duration.ofSeconds(15))
                .GET();
        for(Map.Entry<String, String> header : headers.entrySet()){
            requestBuilder.header(header.getKey(), header.getValue());
        }
        HttpRequest request = requestBuilder.build();
        HttpResponse<String> response;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException e) {
            throw new RiotAPIException(uri, "Request failed", e);
        } catch(InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RiotAPIException(uri, "Request interrupted", e);
        }
        if (response.statusCode() != 200) throw new RiotAPIException(response.statusCode(), uri, response.body());
        return response.body();
    }
}