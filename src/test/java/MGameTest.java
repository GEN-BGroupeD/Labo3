import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    @Test
    public void AllComponentOfMonopolyShouldExist()
    {
        int nbPlayers = 2;
        MGame monopolyGame = new MGame(nbPlayers);
        assertNotNull(monopolyGame.getPlayers().size());
        assertNotNull(monopolyGame.getBoard());
        assertNotNull(monopolyGame.getDice());
    }
}