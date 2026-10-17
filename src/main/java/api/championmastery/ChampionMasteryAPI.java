package api.championmastery;

import api.championmastery.dto.ChampionMasteryDto;
import api.data.PlatformRouting;

import java.util.List;

public interface ChampionMasteryAPI {
    List<ChampionMasteryDto> getMasteryPointsByPuuid(PlatformRouting region, String encryptedPUUID);
    ChampionMasteryDto getMasteryPointsOnChampion(PlatformRouting region, String encryptedPUUID, int championId);
    List<ChampionMasteryDto> getTopMasteryEntries(PlatformRouting region, String encryptedPUUID);
    List<ChampionMasteryDto> getTopMasteryEntries(PlatformRouting region, String encryptedPUUID, int count);
    int getSumOfMasteryPoints(PlatformRouting region, String encryptedPUUID);
}
