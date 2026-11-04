package riotapi.internal;

import riotapi.api.data.Platform;
import riotapi.api.lolstatus.LeagueStatusAPI;
import riotapi.api.lolstatus.dto.PlatformDataDto;

public class LeagueStatusAPIImpl implements LeagueStatusAPI {

    private final RiotHttp riotHttp;

    public LeagueStatusAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public PlatformDataDto getLeagueStatus(Platform platform) {
        return riotHttp.get(platform.getPlatform(), "/lol/status/v4/platform-data", PlatformDataDto.class);
    }
}
