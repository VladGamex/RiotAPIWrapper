package api.lolchallenges.dto;

import java.util.List;

public record PlayerClientPreferencesDto(String bannerAccent, String title, List<String> challengeIds, String crestBorder, int prestigeCrestBorderLevel) {
}
