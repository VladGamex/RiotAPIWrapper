package api.account;

import api.account.dto.AccountDto;
import api.account.dto.AccountRegionDto;
import api.data.RegionalRouting;

public interface AccountAPI {
    AccountDto getAccountByRiotID(RegionalRouting region, String gameName, String tagLine);
    AccountDto getAccountByPuuid(RegionalRouting region, String puuid);
    AccountRegionDto getActiveRegion(RegionalRouting  region, String game, String puuid);
}
