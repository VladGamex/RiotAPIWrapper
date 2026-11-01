package internal;

import api.data.Platform;
import api.lolchallenges.LeagueChallengesAPI;
import api.lolchallenges.Level;
import api.lolchallenges.dto.ApexPlayerInfoDto;
import api.lolchallenges.dto.ChallengeConfigInfoDto;
import api.lolchallenges.dto.PlayerInfoDto;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChallengesImpl implements LeagueChallengesAPI {
    private final RiotHttp riotHttp;

    private final String prefix = "/lol/challenges/v1/challenges";
    private static final Set<Level> APEX = EnumSet.of(Level.MASTER, Level.GRANDMASTER, Level.CHALLENGER);


    public ChallengesImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public List<ChallengeConfigInfoDto> getConfigInformation(Platform platform) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/config",
                new TypeReference<>() {}
        );
    }

    @Override
    public Map<String, Map<String, Float>> getPercentiles(Platform platform) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/percentiles",
                new TypeReference<>() {}
        );
    }

    @Override
    public ChallengeConfigInfoDto getChallengeConfigInfo(Platform platform, long challengeId) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/" + challengeId + "/config",
                ChallengeConfigInfoDto.class
        );
    }

    @Override
    public List<ApexPlayerInfoDto> getTopPlayers(Platform platform, long challengeId, Level level) {
        if (!APEX.contains(level)) {
            throw new IllegalArgumentException("Invalid level: " + level + ", must be one of " + APEX);
        }

        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/" + challengeId + "/leaderboards/by-level/" + level,
                new TypeReference<>() {}
        );
    }

    @Override
    public List<ApexPlayerInfoDto> getTopPlayers(Platform platform, long challengeId, Level level, int limit) {
        if (!APEX.contains(level)) {
            throw new IllegalArgumentException("Invalid level: " + level + ", must be one of " + APEX);
        }

        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/" + challengeId + "/leaderboards/by-level/" + level + "?limit=" + limit,
                new TypeReference<>() {}
        );
    }

    @Override
    public Map<Level, Double> getPercentileOfChallenge(Platform platform, long challengeId) {
        return riotHttp.get(
                platform.getPlatform(),
                prefix + "/" + challengeId + "/percentiles",
                new TypeReference<>() {}
        );
    }

    @Override
    public PlayerInfoDto getPlayerProgression(Platform platform, String puuid) {
        return riotHttp.get(
                platform.getPlatform(),
                "/lol/challenges/v1/player-data/" + puuid,
                PlayerInfoDto.class
        );
    }
}
