package api.spectator;

import api.data.Platform;
import api.spectator.dto.CurrentGameInfo;

public interface SpectatorAPI {
    CurrentGameInfo getGameInformation(Platform platform, String puuid);
}
