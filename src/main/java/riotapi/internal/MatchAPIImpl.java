package riotapi.internal;

import riotapi.api.data.Region;
import riotapi.api.match.MatchAPI;
import riotapi.api.match.ParamBuilder;
import riotapi.api.match.dto.MatchDto;
import riotapi.api.match.dto.ReplayDTO;
import riotapi.api.match.dto.TimelineDto;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;
import java.util.Map;

public class MatchAPIImpl implements MatchAPI {

    private final RiotHttp riotHttp;
    private final String prefix = "/lol/match/v5/matches";

    public MatchAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public List<String> getMatchHistory(Region region, String puuid) {
        return riotHttp.get(
                region.getHost(),
                prefix + "/by-puuid/" + puuid + "/ids",
                new TypeReference<>() {}
        );
    }

    @Override
    public List<String> getMatchHistory(Region region, String puuid, ParamBuilder builder) {
        return riotHttp.get(
                region.getHost(),
                prefix + "/by-puuid/" + puuid + "/ids" + builder.build(),
                new TypeReference<>() {}
        );
    }

    @Deprecated
    @Override
    public ReplayDTO getPlayerReplays(Region region, String bearerToken) {

        return riotHttp.get(
                region.getHost(),
                prefix + "/replays",
                ReplayDTO.class,
                Map.of("Authorization", bearerToken)
        );
    }

    @Override
    public MatchDto getMatch(Region region, String matchId) {
        return riotHttp.get(
                region.getHost(),
                prefix + "/" + matchId,
                MatchDto.class
        );
    }

    @Override
    public TimelineDto getMatchTimeline(Region region, String matchId) {
        return riotHttp.get(
                region.getHost(),
                prefix + "/" + matchId + "/timeline",
                TimelineDto.class
        );
    }
}
