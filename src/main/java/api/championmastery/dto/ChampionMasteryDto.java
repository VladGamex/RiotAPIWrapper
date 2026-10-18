package api.championmastery.dto;

import java.util.List;

public record ChampionMasteryDto(String puuid, long championPointsUntilNextLevel, boolean chestGranted, long championId, long lastPlayTime,
                                 int championLevel, int championPoints, long championPointsSinceLastLevel, int markRequiredForNextLevel,
                                 int championSeasonMilestone, NextSeasonMilestonesDto nextSeasonMilestone, int tokensEarned, List<String> milestoneGrades) {
}
