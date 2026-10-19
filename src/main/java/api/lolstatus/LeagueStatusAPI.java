package api.lolstatus;

import api.data.Platform;
import api.lolstatus.dto.PlatformDataDto;

public interface LeagueStatusAPI {
    PlatformDataDto getLeagueStatus(Platform platform);
}
