import Game.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void BoardTest(){
        Board board = new Board();
        assertEquals("Go",board.getSquare(0).toString());
        for(int i= 1; i<40; i++){
            assertEquals("Square "+i, board.getSquare(i).toString());
        }

    }

}