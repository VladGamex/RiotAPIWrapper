package internal;

import api.account.AccountAPI;
import api.account.dto.AccountDto;
import api.account.dto.AccountRegionDto;
import api.data.Region;

public class AccountAPIImpl implements AccountAPI {
    private final RiotHttp riotHttp;
    private final String prefix = "/riot/account/v1/";

    public AccountAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public AccountDto getAccountByRiotID(Region region, String gameName, String tagLine) {
        return riotHttp.get(region.getHost(), prefix + "accounts/by-riot-id/" + gameName + "/" + tagLine, AccountDto.class);
    }

    @Override
    public AccountDto getAccountByPuuid(Region region, String puuid) {
        return riotHttp.get(region.getHost(), prefix + "accounts/by-puuid/" + puuid, AccountDto.class);
    }

    @Override
    public AccountRegionDto getActiveRegion(Region region, String game, String puuid) {
        return riotHttp.get(region.getHost(), prefix + "region/by-game/" + game + "/by-puuid/" + puuid, AccountRegionDto.class);
    }
}
