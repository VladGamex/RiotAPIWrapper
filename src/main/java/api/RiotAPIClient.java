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
import internal.AccountAPIImpl;
import internal.ChampionMasteryAPIImpl;
import internal.RiotHttp;

public class RiotAPIClient implements RiotAPI {
    private final RiotHttp riotHttp;
    private final AccountAPIImpl accountAPI;
    private final ChampionMasteryAPIImpl championMasteryAPI;

    public RiotAPIClient(String apiKey) {
        riotHttp = new RiotHttp(apiKey);
        accountAPI = new AccountAPIImpl(riotHttp);
        championMasteryAPI = new ChampionMasteryAPIImpl(riotHttp);
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
        return null;
    }

    @Override
    public ClashAPI clash() {
        return null;
    }

    @Override
    public LeagueAPI league() {
        return null;
    }

    @Override
    public LeagueEXPAPI leagueExp() {
        return null;
    }

    @Override
    public LeagueChallengesAPI leagueChallenges() {
        return null;
    }

    @Override
    public LeagueStatusAPI leagueStatus() {
        return null;
    }

    @Override
    public MatchAPI match() {
        return null;
    }

    @Override
    public SpectatorAPI spectator() {
        return null;
    }

    @Override
    public SummonerAPI summoner() {
        return null;
    }
}
