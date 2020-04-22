import Square.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
   @Test
    void CaseHaveTheRightName(){
        String testName = "Test";
        Square square = new RegularSquare(testName);
        assertEquals(testName,square.toString());

        testName ="Go";
        square = new GoSquare();
        assertEquals(testName, square.toString());

       testName ="Income tax";
       square = new IncomeTaxSquare();
       assertEquals(testName, square.toString());

       testName ="Go to jail";
       square = new GoToJailSquare();
       assertEquals(testName, square.toString());

    }

}