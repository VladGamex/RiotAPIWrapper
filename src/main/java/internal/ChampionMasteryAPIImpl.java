package internal;

import api.championmastery.dto.ChampionMasteryDto;
import api.championmastery.ChampionMasteryAPI;
import api.data.Platform;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class ChampionMasteryAPIImpl implements ChampionMasteryAPI {
    private final RiotHttp riotHttp;
    private final String prefix = "/lol/champion-mastery/v4/";

    public ChampionMasteryAPIImpl(RiotHttp riotHttp) {
        this.riotHttp = riotHttp;
    }

    @Override
    public List<ChampionMasteryDto> getMasteryPointsByPuuid(Platform region, String encryptedPUUID) {
        return riotHttp.get(region.getPlatform(),
                prefix + "champion-masteries/by-puuid/" + encryptedPUUID,
                new TypeReference<>() {
        });
    }

    @Override
    public ChampionMasteryDto getMasteryPointsOnChampion(Platform region, String encryptedPUUID, int championId) {
        return riotHttp.get(region.getPlatform(),
                prefix + "champion-masteries/by-puuid/" + encryptedPUUID + "/by-champion/" + championId,
                ChampionMasteryDto.class);
    }

    @Override
    public List<ChampionMasteryDto> getTopMasteryEntries(Platform region, String encryptedPUUID) {
        return riotHttp.get(region.getPlatform(),
                prefix + "champion-masteries/by-puuid/" + encryptedPUUID + "/top",
                new TypeReference<>() {
                });
    }

    @Override
    public List<ChampionMasteryDto> getTopMasteryEntries(Platform region, String encryptedPUUID, int count) {
        return riotHttp.get(region.getPlatform(),
                prefix + "champion-masteries/by-puuid/" + encryptedPUUID + "/top?count=" + count,
                new TypeReference<>() {
                });
    }

    @Override
    public int getSumOfMasteryPoints(Platform region, String encryptedPUUID) {
        return riotHttp.get(region.getPlatform(),
                prefix + "/scores/by-puuid/" + encryptedPUUID,
                Integer.class);
    }
}
