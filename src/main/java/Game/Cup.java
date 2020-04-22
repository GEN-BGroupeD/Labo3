package Game;


public class Cup {
    private Dice[] dice;
    private int rolled;

    /**
     * Constructeur
     * @param nbOfDice (int) nombre de dés dans un cup
     */
    public Cup(int nbOfDice) {
        dice = new Dice[nbOfDice];
        for(int i = 0; i < nbOfDice; i++) {
            dice[i] = new Dice();
        }
    }

    /**
     * @brief Lance les dés
     */
    public void roll() {
        rolled = 0;
        for (Dice dice : dice) {
            rolled += dice.getFaceValue();
        }
    }

    /**
     *
     * @return (int) Valeur obtenue par le lancé
     */
    public int getRolled() {
        return rolled;
    }
}