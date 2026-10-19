package api.clash.dto;

import java.util.List;

public record TournamentDto(int id, int themeId, String nameKey, String nameKeySecondary, List<TournamentPhaseDto> schedule) {
}
