import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void playerHavePieceAndStartAtGo() {
        Board board = new Board();
        Player player = new Player("Tintin", board);
        assertNotNull(player.getPiece());
        assertEquals("Go", player.getPiece().getLocation().toString());
    }
}