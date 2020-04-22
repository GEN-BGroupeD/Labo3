package Square;

import Player.Player;

public class GoSquare extends  Square{
    /**
     * Constructeur
     */
    public GoSquare()
    {
        super("Go");
    }

    /**
     * @brief Action à effectuer quand un joueur atteris sur une case
     * @param player (Player) player
     */
    @Override
    public void landedOn(Player player)
    {
        player.addCash(200);
    }
}
