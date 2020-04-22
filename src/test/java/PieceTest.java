import Player.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {
    @Test
    void pieceHaveNames(){
        Piece piece = new Piece();
        assertNotEquals(null,piece.getPieceName());
    }



}