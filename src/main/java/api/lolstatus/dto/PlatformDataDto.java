package api.lolstatus.dto;

import java.util.List;

public record PlatformDataDto(String id, String name, List<String> locales, List<StatusDto> maintenances, List<StatusDto> incidents) {
}
