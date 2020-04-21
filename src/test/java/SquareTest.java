import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void CaseHaveTheRightName(){
        Square square = new Square();
        assertEquals("Go",square.toString());
        for(int i= 1; i<40; i++){
            square = new Square();
            assertEquals("Square "+i, square.toString());
        }

    }

}