package api.league.dto;

import java.util.List;

public record LeagueListDTO(String leagueId, List<LeagueItemDTO> entries, String tier, String name, String queue) {
}
