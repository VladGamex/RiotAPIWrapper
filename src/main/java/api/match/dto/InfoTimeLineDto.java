package api.match.dto;

import java.util.List;

public record InfoTimeLineDto(String endOfGameResult, long frameInterval, long gameId, List<ParticipantTimeLineDto> participants, List<FramesTimeLineDto> frames) {
}
