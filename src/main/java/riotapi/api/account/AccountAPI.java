package riotapi.api.account;

import riotapi.api.account.dto.AccountDto;
import riotapi.api.account.dto.AccountRegionDto;
import riotapi.api.data.Region;

public interface AccountAPI {
    AccountDto getAccountByRiotID(Region region, String gameName, String tagLine);
    AccountDto getAccountByPuuid(Region region, String puuid);
    AccountRegionDto getActiveRegion(Region region, String game, String puuid);
}
