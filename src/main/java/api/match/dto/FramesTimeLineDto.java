package api.match.dto;

import java.util.List;

public record FramesTimeLineDto(List<EventsTimeLineDto> events, ParticipantFramesDto participantFrames, int timestamp) {
}
