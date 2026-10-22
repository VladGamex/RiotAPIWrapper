package api.match.dto;

import java.util.List;

public record TeamDto(List<BanDto> bans, ObjectivesDto objectives, int teamId, boolean win) {
}
