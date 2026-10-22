package api.summoner;

import api.data.Platform;
import api.summoner.dto.SummonerDTO;

public interface SummonerAPI {

    SummonerDTO getSummoner(Platform platform, String puuid);
    SummonerDTO getSummonerByBearerToken(Platform platform, String bearerToken);
}
