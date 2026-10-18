package api.data;

public enum Region {
    AMERICAS("americas.api.riotgames.com"),
    ASIA("asia.api.riotgames.com"),
    EUROPE("europe.api.riotgames.com"),
    SEA("sea.api.riotgames.com");

    private final String host;
    Region(String host) {
        this.host = host;
    }
    public String getHost() { return host; }
}
