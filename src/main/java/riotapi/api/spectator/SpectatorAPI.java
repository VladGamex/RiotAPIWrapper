package riotapi.api.spectator;

import riotapi.api.data.Platform;
import riotapi.api.spectator.dto.CurrentGameInfo;

public interface SpectatorAPI {
    CurrentGameInfo getGameInformation(Platform platform, String puuid);
}
