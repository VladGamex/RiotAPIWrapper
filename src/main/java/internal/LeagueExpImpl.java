package internal;

import api.data.Platform;
import api.leagueexp.LeagueEXPAPI;
import api.leagueexp.dto.LeagueEntryDTO;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Set;

public class LeagueExpImpl implements LeagueEXPAPI {
    private final RiotHttp riotHttp;

    public LeagueExpImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, String queue, String tier, String division) {
        return riotHttp.get(platform.getPlatform(), "/lol/league-exp/v4/entries/" + queue + "/" + tier + "/" + division,
                new TypeReference<Set<LeagueEntryDTO>>() {});
    }

    @Override
    public Set<LeagueEntryDTO> getAllLeagueEntries(Platform platform, String queue, String tier, String division, int page) {
        return riotHttp.get(platform.getPlatform(), "/lol/league-exp/v4/entries/" + queue + "/" + tier + "/" + division + "?page=" + page,
                new TypeReference<Set<LeagueEntryDTO>>() {});
    }
}
