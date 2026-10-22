package api.match;

import api.data.Region;
import api.match.dto.MatchDto;
import api.match.dto.ReplayDTO;
import api.match.dto.TimelineDto;

import java.util.List;

public interface MatchAPI {
    List<String> getMatchHistory(Region region, String puuid);
    List<String> getMatchHistory(Region region, String puuid, ParamBuilder builder);
    ReplayDTO getPlayerReplays(Region region, String puuid);
    MatchDto getMatch(Region region, String matchId);
    TimelineDto getMatchTimeline(Region region, String matchId);

}
