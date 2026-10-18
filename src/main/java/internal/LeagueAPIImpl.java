package internal;

import api.data.Platform;
import api.league.LeagueAPI;
import api.league.dto.LeagueListDTO;
import api.leagueexp.dto.LeagueEntryDTO;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Set;

public class LeagueAPIImpl implements LeagueAPI {
    private final RiotHttp riotHttp;
    private final String prefix = "/lol/league/v4/";

    public LeagueAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public LeagueListDTO getChallengerLeague(Platform platform, String queue) {
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
    public Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, String division, String tier, String queue) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "entries/" + queue + "/" + tier + "/" + division,
                new TypeReference<Set<LeagueEntryDTO>>() {}
        );
    }

    @Override
    public Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, String division, String tier, String queue, int page) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "entries/" + queue + "/" + tier + "/" + division + "?page=" + page,
                new TypeReference<Set<LeagueEntryDTO>>() {}
        );
    }

    @Override
    public LeagueListDTO getGrandMasterLeague(Platform platform, String queue) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "grandmasterleagues/by-queue/" + queue,
                LeagueListDTO.class
        );
    }

    @Override
    public LeagueListDTO getMasterLeague(Platform platform, String queue) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "masterleagues/by-queue/" + queue,
                LeagueListDTO.class
        );
    }
}
