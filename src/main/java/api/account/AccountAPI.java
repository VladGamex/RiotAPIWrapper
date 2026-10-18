package api.account;

import api.account.dto.AccountDto;
import api.account.dto.AccountRegionDto;
import api.data.Region;

public interface AccountAPI {
    AccountDto getAccountByRiotID(Region region, String gameName, String tagLine);
    AccountDto getAccountByPuuid(Region region, String puuid);
    AccountRegionDto getActiveRegion(Region region, String game, String puuid);
}
