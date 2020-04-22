package Square;

import Player.Player;

public abstract class Square {
    String name;

    /**
     * Constructeur
     * @param name (String) nom de la case
     */
    public Square(String name){
        this.name = name;
    }

    /**
     *
     * @return (String) nom de la case
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * @brief Action à effectuer quand un joueur atteris sur une case
     * @param player (Player) player
     */
   public abstract void landedOn(Player player);
}
