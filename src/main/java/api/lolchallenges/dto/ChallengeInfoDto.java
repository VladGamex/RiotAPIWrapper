package api.lolchallenges.dto;

import api.lolchallenges.Level;

public record ChallengeInfoDto(long challengeId , double percentile,int position,int playersInLevel, Level level, double value, long achievedTime) {
}
