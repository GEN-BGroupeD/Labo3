package Game;


public class Cup {
    private Dice[] dice;
    private int rolled;

    public Cup(int nbOfDice) {
        dice = new Dice[nbOfDice];
        for(int i = 0; i < nbOfDice; i++) {
            dice[i] = new Dice();
        }
    }

    public void roll() {
        rolled = 0;
        for (Dice dice : dice) {
            rolled += dice.getFaceValue();
        }
    }

    public int getRolled() {
        return rolled;
    }

    public Dice[] getDice() {
        return dice;
    }
}