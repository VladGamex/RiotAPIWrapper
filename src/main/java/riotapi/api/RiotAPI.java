package riotapi.api;

import riotapi.api.account.AccountAPI;
import riotapi.api.champion.ChampionAPI;
import riotapi.api.championmastery.ChampionMasteryAPI;
import riotapi.api.clash.ClashAPI;
import riotapi.api.league.LeagueAPI;
import riotapi.api.lolchallenges.LeagueChallengesAPI;
import riotapi.api.lolstatus.LeagueStatusAPI;
import riotapi.api.match.MatchAPI;
import riotapi.api.spectator.SpectatorAPI;
import riotapi.api.summoner.SummonerAPI;

public interface RiotAPI {
    AccountAPI account();
    ChampionMasteryAPI championMastery();
    ChampionAPI champion();
    ClashAPI clash();
    LeagueAPI league();
    LeagueChallengesAPI leagueChallenges();
    LeagueStatusAPI leagueStatus();
    MatchAPI match();
    SpectatorAPI spectator();
    SummonerAPI summoner();
}
