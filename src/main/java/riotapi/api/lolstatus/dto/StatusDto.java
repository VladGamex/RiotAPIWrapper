package riotapi.api.lolstatus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record StatusDto(int id,
                        @JsonProperty("maintenance_status") String maintenanceStatus,
                        String incident_severity,
                        List<ContentDto> titles,
                        List<UpdateDto> updates,
                        String created_at,
                        String archive_at,
                        String updated_at,
                        List<String> platforms) {
}
