package api.lolchallenges.dto;

public record ChallengeInfoDto(double percentile, int playersInLevel, long achievedTime, double value, long challengeId, String level, int position) {
}
