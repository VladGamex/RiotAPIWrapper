package api.match.dto;

import api.match.dto.events.EventsTimeLineDto;

import java.util.List;
import java.util.Map;

public record FramesTimeLineDto(List<EventsTimeLineDto> events, Map<Integer, ParticipantFrameDto> participantFrames, int timestamp) {
}
