package api.match.dto;

import java.util.List;

public record PerksDto(PerkStatsDto statPerks, List<PerkStyleDto> styles) {
}
