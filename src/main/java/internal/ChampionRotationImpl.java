package internal;

import api.champion.ChampionAPI;
import api.champion.dto.ChampionInfo;
import api.data.Platform;

public class ChampionRotationImpl implements ChampionAPI {
    private final RiotHttp riotHttp;

    public ChampionRotationImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public ChampionInfo getChampionRotation(Platform platform) {
        return riotHttp.get(platform.getPlatform(), "/lol/platform/v3/champion-rotations", ChampionInfo.class);
    }
}
