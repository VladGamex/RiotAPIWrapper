package api.lolstatus.dto;

import java.util.List;

public record StatusDto(int id, String maintenance_status, String incident_severity, List<ContentDto> titles, List<UpdateDto> updates, String created_at, String archive_at,
                        String updated_at, List<String> platforms) {
}
