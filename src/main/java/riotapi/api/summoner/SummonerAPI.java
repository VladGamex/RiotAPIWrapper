package riotapi.api.summoner;

import riotapi.api.data.Platform;
import riotapi.api.summoner.dto.SummonerDTO;

public interface SummonerAPI {

    SummonerDTO getSummoner(Platform platform, String puuid);
    SummonerDTO getSummonerByBearerToken(Platform platform, String bearerToken);
}
