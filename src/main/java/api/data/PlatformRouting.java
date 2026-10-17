package api.data;

public enum PlatformRouting {

    BR1("br1.api.riotgames.com", RegionalRouting.AMERICAS),
    EUN1("eun1.api.riotgames.com", RegionalRouting.EUROPE),
    EUW1("euw1.api.riotgames.com", RegionalRouting.EUROPE),
    JP1("jp1.api.riotgames.com", RegionalRouting.ASIA),
    KR("kr.api.riotgames.com", RegionalRouting.ASIA),
    LA1("la1.api.riotgames.com", RegionalRouting.AMERICAS),
    LA2("la2.api.riotgames.com", RegionalRouting.AMERICAS),
    NA1("na1.api.riotgames.com", RegionalRouting.AMERICAS),
    OC1("oc1.api.riotgames.com", RegionalRouting.SEA),
    TR1("tr1.api.riotgames.com", RegionalRouting.EUROPE),
    RU("ru.api.riotgames.com", RegionalRouting.EUROPE),
    PH2("ph2.api.riotgames.com", RegionalRouting.SEA),
    SG2("sg2.api.riotgames.com", RegionalRouting.SEA),
    TH2("th2.api.riotgames.com", RegionalRouting.SEA),
    TW2("tw2.api.riotgames.com", RegionalRouting.SEA),
    VN2("vn2.api.riotgames.com", RegionalRouting.SEA),;

    private final String platform;
    private final RegionalRouting region;

    PlatformRouting(String platform, RegionalRouting region ) {
        this.platform = platform;
        this.region = region;
    }
    public String getPlatform() { return platform; }
    public RegionalRouting getRegion() { return region; }
}
