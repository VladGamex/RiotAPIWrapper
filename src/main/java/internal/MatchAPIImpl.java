package internal;

import api.data.Region;
import api.match.MatchAPI;
import api.match.ParamBuilder;
import api.match.dto.MatchDto;
import api.match.dto.ReplayDTO;
import api.match.dto.TimelineDto;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

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
                new TypeReference<>() {},
                null
        );
    }

    @Override
    public List<String> getMatchHistory(Region region, String puuid, ParamBuilder builder) {
        return riotHttp.get(
                region.getHost(),
                prefix + "/by-puuid/" + puuid + "/ids" + builder.build(),
                new TypeReference<>() {},
                null
        );
    }

    @Override
    public ReplayDTO getPlayerReplays(Region region, String puuid) {
        return riotHttp.get(
                region.getHost(),
                prefix + "by-puuid/" + puuid + "/replays",
                ReplayDTO.class,
                null
        );
    }

    @Override
    public MatchDto getMatch(Region region, String matchId) {
        return riotHttp.get(
                region.getHost(),
                prefix + "/" + matchId,
                MatchDto.class,
                null
        );
    }

    @Override
    public TimelineDto getMatchTimeline(Region region, String matchId) {
        return riotHttp.get(
                region.getHost(),
                prefix + "/" + matchId + "/timeline",
                TimelineDto.class,
                null
        );
    }
}
