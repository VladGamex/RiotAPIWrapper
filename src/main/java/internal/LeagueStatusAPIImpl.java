package internal;

import api.data.Platform;
import api.lolstatus.LeagueStatusAPI;
import api.lolstatus.dto.PlatformDataDto;

public class LeagueStatusAPIImpl implements LeagueStatusAPI {

    private final RiotHttp riotHttp;

    public LeagueStatusAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public PlatformDataDto getLeagueStatus(Platform platform) {
        return riotHttp.get(platform.getPlatform(), "/lol/status/v4/platform-data", PlatformDataDto.class, null);
    }
}
