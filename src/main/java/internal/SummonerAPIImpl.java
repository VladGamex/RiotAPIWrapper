package internal;

import api.data.Platform;
import api.summoner.SummonerAPI;
import api.summoner.dto.SummonerDTO;

import java.util.HashMap;

public class SummonerAPIImpl implements SummonerAPI {
    private final RiotHttp riotHttp;
    private final String prefix = "/lol/summoner/v4/summoners";

    public SummonerAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public SummonerDTO getSummoner(Platform platform, String puuid) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/by-puuid/" + puuid,
                SummonerDTO.class
        );
    }

    @Override
    public SummonerDTO getSummonerByBearerToken(Platform platform, String bearerToken) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/me",
                SummonerDTO.class,
                new HashMap<>() {{put("Authorization", bearerToken);}}
        );
    }
}
