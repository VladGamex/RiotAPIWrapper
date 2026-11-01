package internal;

public class RiotAPIException extends RuntimeException {
    private final int statusCode;
    private final String uri;
    private final String responseBody;
    public RiotAPIException(int statusCode, String uri, String responseBody) {
        super("[RIOT-API-WRAPPER] " + uri + " with " + statusCode + " returned:" + responseBody);
        this.statusCode = statusCode;
        this.uri = uri;
        this.responseBody = responseBody;
    }

    public RiotAPIException(String uri, String message, Throwable cause) {
        super("[RIOT-API-WRAPPER] " + uri + ": " + message, cause);
        this.statusCode = -1;   // kein HTTP-Status
        this.uri = uri;
        this.responseBody = null;
    }

    public RiotAPIException(String message, Throwable cause) {
        super("[RIOT-API-WRAPPER]" + message, cause);
        this.statusCode = -1;   // kein HTTP-Status
        this.uri = null;
        this.responseBody = null;
    }

    public int getStatusCode() {
        return statusCode;
    }
    public String getUri() {
        return uri;
    }
    public String getMessage() {
        return responseBody;
    }
}
