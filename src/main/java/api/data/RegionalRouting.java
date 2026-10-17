package api.data;

public enum RegionalRouting {
    AMERICAS("americas.api.riotgames.com"),
    ASIA("asia.api.riotgames.com"),
    EUROPE("europe.api.riotgames.com"),
    SEA("sea.api.riotgames.com");

    private final String host;
    RegionalRouting(String host) {
        this.host = host;
    }
    public String getHost() { return host; }
}
