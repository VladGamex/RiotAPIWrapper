package api.data;

public enum Platform {

    BR1("br1.api.riotgames.com", Region.AMERICAS),
    EUN1("eun1.api.riotgames.com", Region.EUROPE),
    EUW1("euw1.api.riotgames.com", Region.EUROPE),
    JP1("jp1.api.riotgames.com", Region.ASIA),
    KR("kr.api.riotgames.com", Region.ASIA),
    LA1("la1.api.riotgames.com", Region.AMERICAS),
    LA2("la2.api.riotgames.com", Region.AMERICAS),
    NA1("na1.api.riotgames.com", Region.AMERICAS),
    OC1("oc1.api.riotgames.com", Region.SEA),
    TR1("tr1.api.riotgames.com", Region.EUROPE),
    RU("ru.api.riotgames.com", Region.EUROPE),
    PH2("ph2.api.riotgames.com", Region.SEA),
    SG2("sg2.api.riotgames.com", Region.SEA),
    TH2("th2.api.riotgames.com", Region.SEA),
    TW2("tw2.api.riotgames.com", Region.SEA),
    VN2("vn2.api.riotgames.com", Region.SEA),;

    private final String platform;
    private final Region region;

    Platform(String platform, Region region ) {
        this.platform = platform;
        this.region = region;
    }
    public String getPlatform() { return platform; }
    public Region getRegion() { return region; }
}
