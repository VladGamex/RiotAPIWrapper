package api.lolstatus.dto;

import java.util.List;

public record UpdateDto(int id, String author, boolean publish, List<String> public_locations, List<ContentDto> translations, String created_at, String updated_at) {
}
