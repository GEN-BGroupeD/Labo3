import Game.*;
import Player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Board board;
    Player player;

    @BeforeEach
    void createPlayer()
    {
        board = new Board();
        player = new Player("Tintin",board);
    }
    @Test
    void PlayerHaveCorrectName(){

        String testName = "Tintin";
        assertEquals(testName, player.getName());
    }

    @Test
    void playerCanTakeTurn(){
        Cup cup = new Cup(2);
        String oldCase = player.getPiece().getLocation().toString();
        player.takeTurn(board,cup);
        String newCase = player.getPiece().getLocation().toString();
        assertNotEquals(oldCase,newCase);
    }
   @Test
    void playerHavePieceAndStartAtGo() {
        assertNotNull(player.getPiece());
        assertEquals("Go", player.getPiece().getLocation().toString());
    }
    @Test
    void playerStartWithDollar(){
        int cash = 1500;
        assertEquals(cash,player.getNetWorth());
    }

}