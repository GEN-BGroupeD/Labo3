import Game.Cup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CupTest {
    @Test
    void aCupMustReturnAValueBetweenTwoAndTwelve()
    {
        Cup cup = new Cup(2);
        for (int i = 0; i < 10000; i++) {
            cup.roll();
            assertFalse(cup.getRolled() < 2 && cup.getRolled() > 12);
        }
    }
}
