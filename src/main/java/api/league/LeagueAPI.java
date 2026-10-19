package api.league;

import api.data.Division;
import api.data.Platform;
import api.data.Queue;
import api.data.Tier;
import api.league.dto.LeagueListDTO;
import api.league.dto.LeagueEntryDTO;

import java.util.Set;

public interface LeagueAPI {
    LeagueListDTO getChallengerLeague(Platform platform, Queue queue);
    Set<LeagueEntryDTO> getLeagueEntryFromPuuid(Platform platform, String puuid);
    Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, Queue queue, Tier tier, Division division);
    Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, Queue queue, Tier tier, Division division, int page);
    LeagueListDTO getGrandMasterLeague(Platform platform, Queue queue);
    LeagueListDTO getMasterLeague(Platform platform, Queue queue);

}
