package api.league;

import api.data.Platform;
import api.league.dto.LeagueListDTO;
import api.leagueexp.dto.LeagueEntryDTO;

import java.util.Set;

public interface LeagueAPI {
    LeagueListDTO getChallengerLeague(Platform platform, String queue);
    Set<LeagueEntryDTO> getLeagueEntryFromPuuid(Platform platform, String puuid);
    Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, String division, String tier, String queue);
    Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, String division, String tier, String queue, int page);
    LeagueListDTO getGrandMasterLeague(Platform platform, String queue);
    LeagueListDTO getMasterLeague(Platform platform, String queue);

}
