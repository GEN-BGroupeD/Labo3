package Game;


public class Cup {
    private Dice[] dice;
    private int rolled;

    /**
     * @brief Constructeur
     * @param nbOfDice (int) Nombre de dés voulus dans le cup
     */
    public Cup(int nbOfDice) {
        dice = new Dice[nbOfDice];
        for(int i = 0; i < nbOfDice; i++) {
            dice[i] = new Dice();
        }
    }

    /**
     * @brief Lancer les dés
     */
    public void roll() {
        rolled = 0;
        for (Dice dice : dice) {
            rolled += dice.getFaceValue();
        }
    }

    /**
     * @brief Renvois la valeur obtenue par le lancé
     * @return (int) valeur obtenue
     */
    public int getRolled() {
        return rolled;
    }

    public Dice[] getDice() {
        return dice;
    }
}