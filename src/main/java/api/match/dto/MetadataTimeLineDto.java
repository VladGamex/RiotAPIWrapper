package api.match.dto;

import java.util.List;

public record MetadataTimeLineDto(String dataVersion, String matchId, List<String> participants) {
}
