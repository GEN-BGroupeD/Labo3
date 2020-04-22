import Player.Piece;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {
    @RepeatedTest(10)
    void pieceHaveNames(){
        Piece piece = new Piece();
        assertNotEquals(null,piece.getPieceName());
    }
}