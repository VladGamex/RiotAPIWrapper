package api.champion;

import api.champion.dto.ChampionInfo;
import api.data.Platform;

public interface ChampionAPI {
    ChampionInfo getChampionRotation(Platform platform);
}
