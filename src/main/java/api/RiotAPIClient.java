package api;

import api.account.AccountAPI;
import api.champion.ChampionAPI;
import api.championmastery.ChampionMasteryAPI;
import api.clash.ClashAPI;
import api.league.LeagueAPI;
import api.lolchallenges.LeagueChallengesAPI;
import api.lolstatus.LeagueStatusAPI;
import api.match.MatchAPI;
import api.spectator.SpectatorAPI;
import api.summoner.SummonerAPI;
import internal.*;

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
