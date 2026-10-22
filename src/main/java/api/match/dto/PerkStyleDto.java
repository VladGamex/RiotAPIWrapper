package api.match.dto;

import java.util.List;

public record PerkStyleDto(String description, List<PerkStyleSelectionDto> selections, int style) {
}
