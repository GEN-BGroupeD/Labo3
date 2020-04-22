package Game;

import java.util.Random;

/**
 * Class Dice
 *
 * Représente un dés à 6 faces
 *
 * @author Dubuis Hélène, Triponez Michaël
 * @version 1.0
 */
public class Dice {
    // la face suppérieur du dés (pour voir la valeur obtenue)
    protected int faceValue;

    // Générateur de nombre aléatoire.
    private final static Random rand = new Random(System.currentTimeMillis());

    /**
     * @brief Constructeur, dés lancé à la création
     */
    public Dice() {
        roll();
    }
    /**
     * @return (int) le résultat du lancé
     */
    public int getFaceValue() {
        return faceValue;
    }
    /**
     * @brief Générer un nombre aléatoire entre 1 et 6, pour simuler le lancer de dés.
     */
    public void roll() {
        faceValue = rand.nextInt(6) + 1;
    }
}