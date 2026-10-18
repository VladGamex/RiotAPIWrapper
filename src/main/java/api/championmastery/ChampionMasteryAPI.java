package api.championmastery;

import api.championmastery.dto.ChampionMasteryDto;
import api.data.Platform;

import java.util.List;

public interface ChampionMasteryAPI {
    List<ChampionMasteryDto> getMasteryPointsByPuuid(Platform region, String encryptedPUUID);
    ChampionMasteryDto getMasteryPointsOnChampion(Platform region, String encryptedPUUID, int championId);
    List<ChampionMasteryDto> getTopMasteryEntries(Platform region, String encryptedPUUID);
    List<ChampionMasteryDto> getTopMasteryEntries(Platform region, String encryptedPUUID, int count);
    int getSumOfMasteryPoints(Platform region, String encryptedPUUID);
}
