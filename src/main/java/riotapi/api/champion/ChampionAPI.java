package riotapi.api.champion;

import riotapi.api.champion.dto.ChampionInfo;
import riotapi.api.data.Platform;

public interface ChampionAPI {
    ChampionInfo getChampionRotation(Platform platform);
}
