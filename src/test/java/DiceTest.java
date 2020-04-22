import Game.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class DiceTest {
    @Test
    void resultBetween1and6(){
        Dice dice = new Dice();
        for(int i = 0; i <1000;i++){
            dice.roll();
            assertTrue(dice.getFaceValue()>=0 && dice.getFaceValue()<=6);
        }
    }

    @Test
    void RandomRollResult(){
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        int numberEqual = 0;

        for(int i = 0; i<100;i++){
            dice1.roll();
            dice2.roll();
            if(dice1.getFaceValue() == dice2.getFaceValue()){
                numberEqual++;
            }
        }
        assertNotEquals(100, numberEqual);
    }
}