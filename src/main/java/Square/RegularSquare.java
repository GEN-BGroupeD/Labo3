package Square;

import Player.Player;

public class RegularSquare extends Square {
    /**
     * Constructeur
     * @param name (String) nom
     */
    public RegularSquare(String name)
    {
        super(name);
    }

    /**
     * @brief Action à effectuer quand un joueur atteris sur une case
     * @param player (Player) player
     */
    @Override
    public void landedOn(Player player) {
    }
}