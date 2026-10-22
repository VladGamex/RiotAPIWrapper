package internal;

import api.data.Platform;
import api.data.Tier;
import api.lolchallenges.LeagueChallengesAPI;
import api.lolchallenges.dto.ApexPlayerInfoDto;
import api.lolchallenges.dto.ChallengeConfigInfoDto;
import api.lolchallenges.dto.PlayerInfoDto;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;
import java.util.Map;

public class ChallengesImpl implements LeagueChallengesAPI {
    private final RiotHttp riotHttp;

    private final String prefix = "/lol/challenges/v1/challenges";

    public ChallengesImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public List<ChallengeConfigInfoDto> getConfigInformation(Platform platform) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/config",
                new TypeReference<>() {},
                null
        );
    }

    @Override
    public Map<Long, Map<Integer, Map<String, Double>>> getPercentiles(Platform platform) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/percentiles",
                new TypeReference<>() {},
                null
        );
    }

    @Override
    public ChallengeConfigInfoDto getChallengeConfigInfo(Platform platform, long challengeId) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/" + challengeId + "/config",
                ChallengeConfigInfoDto.class,
                null
        );
    }

    @Override
    public List<ApexPlayerInfoDto> getTopPlayers(Platform platform, long challengeId, String level) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/" + challengeId + "/leaderboards/by-level/" + level,
                new TypeReference<>() {},
                null
        );
    }

    @Override
    public List<ApexPlayerInfoDto> getTopPlayers(Platform platform, long challengeId, String level, int limit) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/" + challengeId + "/leaderboards/by-level/" + level + "?limit=" + limit,
                new TypeReference<>() {},
                null
        );
    }

    @Override
    public Map<Tier, Double> getPercentileOfChallenge(Platform platform, long challengeId) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/" + challengeId + "/percentiles",
                new TypeReference<>() {},
                null
        );
    }

    @Override
    public PlayerInfoDto getPlayerProgression(Platform platform, String puuid) {
        return riotHttp.get(
                platform.getPlatform(),
                "/lol/challenges/v1/player-data/" + puuid,
                PlayerInfoDto.class,
                null
        );
    }
}
