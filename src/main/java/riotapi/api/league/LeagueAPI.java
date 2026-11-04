package riotapi.api.league;

import riotapi.api.data.Division;
import riotapi.api.data.Platform;
import riotapi.api.data.Queue;
import riotapi.api.data.Tier;
import riotapi.api.league.dto.LeagueListDTO;
import riotapi.api.league.dto.LeagueEntryDTO;

import java.util.Set;

public interface LeagueAPI {
    LeagueListDTO getChallengerLeague(Platform platform, Queue queue);
    Set<LeagueEntryDTO> getLeagueEntryFromPuuid(Platform platform, String puuid);
    Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, Queue queue, Tier tier, Division division);
    Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, Queue queue, Tier tier, Division division, int page);
    LeagueListDTO getGrandMasterLeague(Platform platform, Queue queue);
    LeagueListDTO getMasterLeague(Platform platform, Queue queue);

}
