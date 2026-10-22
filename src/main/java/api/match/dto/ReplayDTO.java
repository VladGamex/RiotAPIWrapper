package api.match.dto;

import java.util.List;

public record ReplayDTO(int total, List<String> matchFileURLs) {
}
