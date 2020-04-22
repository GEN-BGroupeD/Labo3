import Game.MGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {
    @Test
    public void GameDontHaveLessThan2PlayersOrMoreThan8(){
        IllegalArgumentException exception1 = assertThrows(
                IllegalArgumentException.class, () -> new MGame(1)
        );
        assertEquals(exception1.getMessage(), "Incorrect number of players");

        IllegalArgumentException exception2 = assertThrows(
                IllegalArgumentException.class, () -> new MGame(9)
        );
        assertEquals(exception2.getMessage(), "Incorrect number of players");

    }
    @Test
    public void AllComponentOfMonopolyShouldExist()
    {
        int nbPlayers = 2;
        MGame game = new MGame(nbPlayers);
        assertNotNull(game.getPlayers().size());
        assertNotNull(game.getBoard());
        assertNotNull(game.getCup());
    }

    @Test
    public void APartyHave20Round(){
        MGame game1 = new MGame(4);
        game1.playGame();

        assertEquals(20,game1.getRoundCount());
    }
}