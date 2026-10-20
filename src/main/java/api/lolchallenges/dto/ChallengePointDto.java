package api.lolchallenges.dto;

public record ChallengePointDto(String level, long current, long max, long percentile) {
}
