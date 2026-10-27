package internal;

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
import java.util.HashMap;
import java.util.Map;

public class RiotHttp {

    private final HttpClient httpClient;
    private final String apiKey;
    private final ObjectMapper mapper;

    public RiotHttp(@NotNull String apiKey) {
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
                // KEINE Reflection-Abfrage (.isRecord()) mehr!
                // Nur ein extrem schnelles System.out, das kaum Performance kostet.
                System.out.println("Riot API liefert ungenutztes Feld: [" + propertyName
                        + "] in DTO: " + beanOrClass.getClass().getSimpleName());

                p.skipChildren(); // Zwingt den Parser, das unbekannte Objekt/Feld sofort zu überspringen
                return true;
            }
        });
    }

    public <T> T get(String host, String path, Class<T> type){
        return parse(send(host, path, Map.of()), mapper.constructType(type));
    }
    public <T> T get(String host, String path, Class<T> type, HashMap<String, String> headers){
        return parse(send(host, path, headers), mapper.constructType(type));
    }

    public <T> T get(String host, String path, TypeReference<T> type) {
        return parse(send(host, path, Map.of()), mapper.constructType(type));
    }


    private <T> T parse(String response, JavaType type) {
        try {
            return mapper.readValue(response, type);
        } catch(JsonProcessingException e) {
            throw new RuntimeException(e); //TODO: ExceptionType
        }
    }

    private String send(String host, String path, Map<String, String> headers) {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .uri(URI.create("https://" + host + path))
                .header("X-Riot-Token", apiKey)
                .timeout(Duration.ofSeconds(15))
                .GET();
        for(Map.Entry<String, String> header : headers.entrySet()){
            requestBuilder.header(header.getKey(), header.getValue());
        }
        HttpRequest request = requestBuilder.build();
        try {

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) throw toException(response);

            return response.body();

        } catch (RiotAPIException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static RiotAPIException toException(HttpResponse<String> response) {

        return new RiotAPIException();
    }
}
