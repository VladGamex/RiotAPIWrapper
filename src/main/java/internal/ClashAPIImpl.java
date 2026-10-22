package internal;

import api.clash.ClashAPI;
import api.clash.dto.PlayerDto;
import api.clash.dto.TeamDto;
import api.clash.dto.TournamentDto;
import api.data.Platform;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class ClashAPIImpl implements ClashAPI {

    private final String prefix = "/lol/clash/v1/";
    private final String tournamentPrefix = "tournaments/";
    private final RiotHttp riotHttp;

    public ClashAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public List<PlayerDto> getPlayersByPuuid(Platform platform, String puuid) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "players/by-puuid/" + puuid,
                new TypeReference<>() {},
                null);
    }

    @Override
    public TeamDto getTeamById(Platform platform, String teamId) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "teams/" + teamId,
                TeamDto.class,
                null);
    }

    @Override
    public List<TournamentDto> getTournaments(Platform platform) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + tournamentPrefix,
                new TypeReference<>() {},
                null);
    }

    @Override
    public TournamentDto getTournamentByTeamId(Platform platform, String teamId) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + tournamentPrefix + "by-team/" + teamId,
                TournamentDto.class,
                null);
    }

    @Override
    public TournamentDto getTournamentById(Platform platform, String tournamentId) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + tournamentPrefix + tournamentId,
                TournamentDto.class,
                null);
    }
}
