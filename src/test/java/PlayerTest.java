import Game.*;
import Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void PlayerHaveCorrectName(){
        Board board = new Board();
        String testName = "Tintin";
        Player player = new Player(testName,board);
        assertEquals(testName, player.getName());
    }

    @Test
    void playerCanTakeTurn(){
        Board board = new Board();
        Cup cup = new Cup(2);
        Player player = new Player("Tintin",board);
        String oldCase = player.getPiece().getLocation().toString();
        player.takeTurn(board,cup);
        String newCase = player.getPiece().getLocation().toString();
        assertNotEquals(oldCase,newCase);
    }
   @Test
    void playerHavePieceAndStartAtGo() {
        MGame game = new MGame(2);
        Board board = new Board();
        Player player = new Player("Tintin", board);
        assertNotNull(player.getPiece());
        assertEquals("Go", player.getPiece().getLocation().toString());
    }
}