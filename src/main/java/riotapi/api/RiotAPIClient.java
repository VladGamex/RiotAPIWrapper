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
import internal.*;
import riotapi.internal.*;

public class RiotAPIClient implements RiotAPI {
    private final AccountAPI accountAPI;
    private final ChampionMasteryAPI championMasteryAPI;
    private final ChampionAPI championAPI;
    private final ClashAPI clashAPI;
    private final LeagueAPI leagueAPI;
    private final LeagueStatusAPI leagueStatusAPI;
    private final LeagueChallengesAPI challengesAPI;
    private final MatchAPI matchAPI;
    private final SpectatorAPI spectatorAPI;
    private final SummonerAPI summonerAPI;

    public RiotAPIClient(String apiKey) {
        RiotHttp riotHttp = new RiotHttp(apiKey);
        accountAPI = new AccountAPIImpl(riotHttp);
        championMasteryAPI = new ChampionMasteryAPIImpl(riotHttp);
        championAPI = new ChampionRotationImpl(riotHttp);
        clashAPI = new ClashAPIImpl(riotHttp);
        leagueAPI = new LeagueAPIImpl(riotHttp);
        leagueStatusAPI = new LeagueStatusAPIImpl(riotHttp);
        challengesAPI = new ChallengesImpl(riotHttp);
        matchAPI = new MatchAPIImpl(riotHttp);
        spectatorAPI = new SpectatorAPIImpl(riotHttp);
        summonerAPI = new SummonerAPIImpl(riotHttp);
    }

    @Override
    public AccountAPI account() {
        return accountAPI;
    }

    @Override
    public ChampionMasteryAPI championMastery() {
        return championMasteryAPI;
    }

    @Override
    public ChampionAPI champion() {
        return championAPI;
    }

    @Override
    public ClashAPI clash() {
        return clashAPI;
    }

    @Override
    public LeagueAPI league() {
        return leagueAPI;
    }

    @Override
    public LeagueChallengesAPI leagueChallenges() {
        return challengesAPI;
    }

    @Override
    public LeagueStatusAPI leagueStatus() {
        return leagueStatusAPI;
    }

    @Override
    public MatchAPI match() {
        return matchAPI;
    }

    @Override
    public SpectatorAPI spectator() {
        return spectatorAPI;
    }

    @Override
    public SummonerAPI summoner() {
        return summonerAPI;
    }
}
