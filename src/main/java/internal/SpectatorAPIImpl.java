package internal;

import api.data.Platform;
import api.spectator.SpectatorAPI;
import api.spectator.dto.CurrentGameInfo;

public class SpectatorAPIImpl implements SpectatorAPI {

    private final RiotHttp riotHttp;
    public SpectatorAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public CurrentGameInfo getGameInformation(Platform platform, String puuid) {
        return riotHttp.get(
                platform.getPlatform(),
                "/lol/spectator/v5/active-games/by-summoner/" + puuid,
                CurrentGameInfo.class
        );
    }
}
