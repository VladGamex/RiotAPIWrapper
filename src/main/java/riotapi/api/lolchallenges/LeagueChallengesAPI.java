package riotapi.api.lolchallenges;

import riotapi.api.data.Platform;
import riotapi.api.lolchallenges.dto.ApexPlayerInfoDto;
import riotapi.api.lolchallenges.dto.ChallengeConfigInfoDto;
import riotapi.api.lolchallenges.dto.PlayerInfoDto;

import java.util.List;
import java.util.Map;

public interface LeagueChallengesAPI {
    List<ChallengeConfigInfoDto> getConfigInformation(Platform platform);
    Map<String, Map<String, Float>> getPercentiles(Platform platform);
    ChallengeConfigInfoDto getChallengeConfigInfo(Platform platform, long challengeId);
    List<ApexPlayerInfoDto> getTopPlayers(Platform platform, long challengeId, Level level);
    List<ApexPlayerInfoDto> getTopPlayers(Platform platform, long challengeId, Level level, int limit);
    Map<Level, Double> getPercentileOfChallenge(Platform platform, long challengeId);
    PlayerInfoDto getPlayerProgression(Platform platform, String puuid);

}
