package api.match.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record ParticipantFramesDto(@JsonProperty("1-9") Map<Integer, ParticipantFrameDto> participantMapping) {
}
