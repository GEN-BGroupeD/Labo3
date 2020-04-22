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
    void playerHavePieceAndStartAtGo() {
        Board board = new Board();
        Player player = new Player("Tintin", board);
        assertNotNull(player.getPiece());
        assertEquals("Go", player.getPiece().getLocation().toString());
    }

    @Test
    void playerCanTakeTurn(){
        Board board = new Board();
        Dice dice = new Dice();
        Player player = new Player("Tintin",board);
        String oldCase = player.getPiece().getLocation().toString();
        player.takeTurn(board,dice);
        String newCase = player.getPiece().getLocation().toString();
        assertNotEquals(oldCase,newCase);
    }
}