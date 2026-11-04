package riotapi.api.match;

import riotapi.api.data.Region;
import riotapi.api.match.dto.MatchDto;
import riotapi.api.match.dto.ReplayDTO;
import riotapi.api.match.dto.TimelineDto;

import java.util.List;

public interface MatchAPI {
    List<String> getMatchHistory(Region region, String puuid);
    List<String> getMatchHistory(Region region, String puuid, ParamBuilder builder);
    ReplayDTO getPlayerReplays(Region region, String bearerToken);
    MatchDto getMatch(Region region, String matchId);
    TimelineDto getMatchTimeline(Region region, String matchId);

}
