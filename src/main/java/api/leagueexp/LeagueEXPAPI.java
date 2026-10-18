package api.leagueexp;

import api.data.Platform;
import api.leagueexp.dto.LeagueEntryDTO;

import java.util.Set;

public interface LeagueEXPAPI {
    Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, String queue, String tier, String division);
    Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, String queue, String tier, String division, int page);
}
