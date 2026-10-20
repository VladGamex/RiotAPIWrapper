package api.lolchallenges;

import api.data.Platform;
import api.data.Tier;
import api.lolchallenges.dto.ApexPlayerInfoDto;
import api.lolchallenges.dto.ChallengeConfigInfoDto;
import api.lolchallenges.dto.PlayerInfoDto;

import java.util.List;
import java.util.Map;

public interface LeagueChallengesAPI {
    List<ChallengeConfigInfoDto> getConfigInformation(Platform platform);
    Map<Long, Map<Integer, Map<String, Double>>> getPercentiles(Platform platform);
    ChallengeConfigInfoDto getChallengeConfigInfo(Platform platform, long challengeId);
    List<ApexPlayerInfoDto> getTopPlayers(Platform platform, long challengeId, String level);
    List<ApexPlayerInfoDto> getTopPlayers(Platform platform, long challengeId, String level, int limit);
    Map<Tier, Double> getPercentileOfChallenge(Platform platform, long challengeId);
    PlayerInfoDto getPlayerProgression(Platform platform, String puuid);

}
