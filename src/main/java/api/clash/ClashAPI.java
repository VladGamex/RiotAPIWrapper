package api.clash;

import api.clash.dto.PlayerDto;
import api.clash.dto.TeamDto;
import api.clash.dto.TournamentDto;
import api.data.Platform;

import java.util.List;

public interface ClashAPI {
    List<PlayerDto> getPlayersByPuuid(Platform platform, String puuid);
    TeamDto getTeamById(Platform platform, String teamId);
    List<TournamentDto> getTournaments(Platform platform);
    TournamentDto getTournamentByTeamId(Platform platform, String teamId);
    TournamentDto getTournamentById(Platform platform, String tournamentId);
}
