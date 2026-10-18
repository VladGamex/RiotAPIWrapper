package api.clash.dto;

public record TournamentDto(int id, int themeId, String nameKey, String nameKeySecondary, List<TournamentPhaseDto> schedule) {
}
