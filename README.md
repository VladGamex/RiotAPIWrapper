# Riot-API-Wrapper

A lightweight Java wrapper for the Riot Games API (currently League of Legends). Typed DTOs, one interface per API section, no manual HTTP
or JSON handling.

> Riot-API-Wrapper isn't endorsed by Riot Games and doesn't reflect the views or opinions of Riot Games
> or anyone officially involved in producing or managing Riot Games properties. Riot Games and all 
> associated properties are trademarks or registered trademarks of Riot Games, Inc.

## Requirements
- Java 17+
- [Riot API Key](https://developer.riotgames.com/)


## Quick start

```java
import api.RiotAPIClient;
import api.account.dto.AccountDto;
import api.data.Platform;
import api.data.Region;

RiotAPI api = new RiotAPIClient(System.getenv("RIOT_API_KEY"));

AccountDto account = api.account().getAccountByRiotID(Region.EUROPE, "Name", "TagLine");
System.out.println(account.puuid());
```
Never hardcode your API key. Use an environment variable or a config file that is not committed.

## ToDo-List

See for reference: [Riot Games API](https://developer.riotgames.com/)

| Section             | Status  |
|---------------------|---------|
| ACCOUNT-V1          | done    |
| CHAMPION-MASTERY-V4 | done    |
| CHAMPION-V3         | planned |
| CLASH-V1            | planned |
| LEAGUE-EXP-V4       | planned |
| LEAGUE-V4           | planned |
| LOL-CHALLENGES-V1   | planned |
| LOL-STATUS-V4       | planned |
| MATCH-V5            | planned |
| SPECTATOR-V5        | planned |
| SUMMONER-V4         | planned |
| TOURNAMENT-V5       | open    |
| VALORANT-ENDPOINTS  | open    |
| TFT-ENDPOINTS       | open    |
| LOR-ENDPOINTS       | open    |

- planned = next up
- open = not started/decided
## License
MIT, see [LICENSE](LICENSE)