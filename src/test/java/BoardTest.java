import Game.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void BoardTest(){
        Board board = new Board();
        assertEquals("Go",board.getSquare(0).toString());
        assertEquals("Income tax",board.getSquare(4).toString());
        assertEquals("Go to jail",board.getSquare(30).toString());

        for(int i= 1; i<37; i++){
            if((i == 4)||(i==30)) {
                i++;
            }
            assertEquals("Square "+i, board.getSquare(i).toString());
        }

    }

}