package api.match.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ChallengesDto(@JsonProperty("12AssistStreakCount") int assistStreakCount12, int baronBuffGoldAdvantageOverThreshold,
                            float controlWardTimeCoverageInRiverOrEnemyHalf, int earliestBaron, int earliestDragonTakedown, int earliestElderDragon,
                            int earyLaningPhaseGoldExpAdvantage, int fasterSupportQuestCompletion, int fastestLegendary, int hadAfkTeammate, int highestChampionDmage,
                            int highestCrowdControlScore, int highestWardKills, int junglerKillsEarlyJungle, int killsOnLnaersEarlyJungleAsJungler,
                            int laningPhaseGoldExpAdvantage, int legendaryCount, float macCsAdvantageOnLaneOpponent, int maxLevelLeadLaneOpponent,
                            int mostWardsDestroyedOneSweeper, int mythicItemUsed, int playedChampSelectPosition, int soloTurretsLategame, int takedownsFirst25Minutes,
                            int teleportTakedowns, int thirdInhibitorDestroyedTime, int threeWardsOneSweeperCount, float visionScoreAdvantageLaneOpponent,
                            int infernalScalePickup, int fistBumpParticipation, int voidMonsterKill, int abilityUses, int acesBefore15Minutes, float alliedJungleMosnterKills,
                            int baronTakedowns, int blastConeOppositeOpponentCount, int bountyGold, int buffsStolen, int completeSupportQuestInTime, int controlWardsPlaced,
                            float damagePerMinute, float damageTakenOnTeamPercentage, int dancedWithRiftHerald, int deathsByEnemyChamps, int dodgeSkillShotsSmallWindows,
                            int doubleAces, int dragonTakedowns, List<Integer> legendaryItemUsed, float effectiveHealAndShielding, int elderDragonKillsWithOpposingSoul,
                            int elderDragonMultikills, int enemyChampionImmobilizations, float enemyJungleMonsterKills, int epicMonsterKillsNearEnemyJungler,
                            int epicMonsterKillsWithin30SecondsOfSpawn, int epicMonsterSteals, int epicMonsterStolenWithoutSmite, int firstTurretKilled,
                            float firstTurretKilledTime, int flawlessAces, int fullTeamTakedown, float gameLength, int getTakedownsInAllLanesEarlyJungleAsLane,
                            float goldPerMinute, int hadOpenNexus, int immobilizeAndKillWithAlly, int initialBuffCount, int initialCrabCount, float jungleCsBefore10Minutes,
                            int junglerTakedownsNearDamagedEpicMonster, float kda, int killAfterhiddenWithAlly, int killedChampTookFullTeamDamageSurvived, int killingSprees,
                            float killParticipation, int killsNearEnemyTurret, int killsOnOtherLanesEarlyJungleAsLaner, int killsOnRecentlyHealedByAramPack,
                            int killsWithHelpFromEpicMonster, int knockEnemyIntoTeamAndKill, int kTurretsDestroyedBeforePlatesFall, int landSkillShotsEarlyGame,
                            int laneMinionsFirst10Minutes, int lostAnInhibitor, int maxKillDeficit, int mejaisFullStackIOnTime, float moreEnemyJungleThanOpponent,
                            int multiKillOneSpell, int multiKills, int multikillsAfterAggressiveFlash, int multiTurretRiftHealdCount, int outerTurretExecutesBefore10Minutes,
                            int outnumberedKills, int outnumberedNexusKill, int perfectDragonSoulsTaken, int perfectGame, int pickKillWithAlly, int poroExplosions,
                            int quickCleanse, int quickFirstTurret, int quickSoloKills, int riftHeraldTakedowns, int saveAllyFromDeath, int scuttleCrabKills,
                            float shortestTimeToAceFromFirstTakedown, int skillshotsDodged, int skillshotsHit, int snowballsHit, int soloBaronKills, int soloKills,
                            int stealthWardsPlaced, int survivedSingleDigitHpCount, int survivedThreeImmobilizesInFight, int takedownOnFirstTurret, int takedowns,
                            int takedownsAfterGainingLevelAdvantage, int takedownsBeforeJungleMinionSpawn, int takedownsFirstXMinutes, int takedownsInAlcove,
                            int takedownsInEnemyFountain, int teamBaronKills, float teamDamagePercentage, int teamElderDragonKills, int teamRiftHeraldKills,
                            int tookLargeDamageSurvived, int turretPlatesTaken, int turretsTakenWithRiftHerald, int turretTakedowns, int twentyMinionsIn3SecondsCount,
                            int twoWardsOneSweeperCount, int unseenRecalls, float visionScorePerMinute, int wardsGuarded, int wardTakedowns, int wardTakedownsBefore20M) {
}
