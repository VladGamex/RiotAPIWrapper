package api.lolchallenges.dto;

import java.util.Map;

public record ChallengeConfigInfoDto(long id, Map<String, Map<String,String>> localizedNames, State state, Tracking tracking, long startTimestamp,
                                     long endTimestamp, boolean leaderboard, Map<String, Double> thresholds) {
}
