package api.match.dto;

import api.match.dto.TeamDto;
import java.util.List;

public record InfoDto(String endOfGameResult, long gameCreation, long gameDuration, long gameEndTimestamp, long gameId, String gameMode, String gameName,
                      long gameStartTimestamp, String gameType, String gameVersion, int mapId, List<ParticipantDto> participants, String platformId, int queueId,
                      List<TeamDto> teams, String tournamentCode) {
}
