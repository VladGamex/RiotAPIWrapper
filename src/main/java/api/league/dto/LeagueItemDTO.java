package api.league.dto;

import api.leagueexp.dto.MiniSeriesDTO;

public record LeagueItemDTO(boolean freshBlood, int wins, MiniSeriesDTO miniSeries, boolean inactive, boolean veteran, boolean hotStreak, String rank,
                            int leaguePoints, int losses, String puuid) {
}
