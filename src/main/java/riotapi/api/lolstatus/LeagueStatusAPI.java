package riotapi.api.lolstatus;

import riotapi.api.data.Platform;
import riotapi.api.lolstatus.dto.PlatformDataDto;

public interface LeagueStatusAPI {
    PlatformDataDto getLeagueStatus(Platform platform);
}
