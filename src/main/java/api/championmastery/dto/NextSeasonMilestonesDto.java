package api.championmastery.dto;

import java.util.Map;

public record NextSeasonMilestonesDto(Map<String, Integer> requireGradeCounts, int rewardMarks, boolean bonus, RewardConfigDto rewardConfig){}
