package internal;

import api.data.Division;
import api.data.Platform;
import api.data.Queue;
import api.data.Tier;
import api.league.LeagueAPI;
import api.league.dto.LeagueListDTO;
import api.league.dto.LeagueEntryDTO;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Set;

public class LeagueAPIImpl implements LeagueAPI {
    private final RiotHttp riotHttp;
    private final String prefix = "/lol/league/v4/";

    public LeagueAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public LeagueListDTO getChallengerLeague(Platform platform, Queue queue) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "challengerleagues/by-queue/" + queue,
                LeagueListDTO.class
        );
    }

    @Override
    public Set<LeagueEntryDTO> getLeagueEntryFromPuuid(Platform platform, String puuid) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "entries/by-puuid/" + puuid,
                new TypeReference<Set<LeagueEntryDTO>>() {}
        );
    }

    @Override
    public Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, Queue queue, Tier tier, Division division) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "entries/" + queue + "/" + tier + "/" + division,
                new TypeReference<Set<LeagueEntryDTO>>() {}
        );
    }

    @Override
    public Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, Queue queue, Tier tier, Division division, int page) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "entries/" + queue + "/" + tier + "/" + division + "?page=" + page,
                new TypeReference<Set<LeagueEntryDTO>>() {}
        );
    }

    @Override
    public LeagueListDTO getGrandMasterLeague(Platform platform, Queue queue) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "grandmasterleagues/by-queue/" + queue,
                LeagueListDTO.class
        );
    }

    @Override
    public LeagueListDTO getMasterLeague(Platform platform, Queue queue) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "masterleagues/by-queue/" + queue,
                LeagueListDTO.class
        );
    }
}
