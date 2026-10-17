package api;

import api.account.AccountAPI;
import api.champion.ChampionAPI;
import api.championmastery.ChampionMasteryAPI;
import api.clash.ClashAPI;
import api.league.LeagueAPI;
import api.leagueexp.LeagueEXPAPI;
import api.lolchallenges.LeagueChallengesAPI;
import api.lolstatus.LeagueStatusAPI;
import api.match.MatchAPI;
import api.spectator.SpectatorAPI;
import api.summoner.SummonerAPI;

public interface RiotAPI {
    AccountAPI account();
    ChampionMasteryAPI championMastery();
    ChampionAPI champion();
    ClashAPI clash();
    LeagueAPI league();
    LeagueEXPAPI leagueExp();
    LeagueChallengesAPI leagueChallenges();
    LeagueStatusAPI leagueStatus();
    MatchAPI match();
    SpectatorAPI spectator();
    SummonerAPI summoner();
}
