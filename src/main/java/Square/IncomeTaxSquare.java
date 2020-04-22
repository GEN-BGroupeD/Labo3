package Square;

import Player.Player;

public class IncomeTaxSquare extends Square{
    /**
     * Constructeur
     */
    public IncomeTaxSquare()
    {
        super("Income tax");
    }

    /**
     * @brief Action à effectuer quand un joueur atteris sur une case
     * @param player (Player) player
     */
    @Override
    public void landedOn(Player player) {
        reduceCash(player);
    }

    /**
     * @brief Deduis de l'argent au joueur
     * @param player (Player) player
     */
    private void reduceCash(Player player)
    {
        int cash = player.getNetWorth();
        cash -= Math.min(200, cash * 0.1);
        player.setCash(cash);
    }
}
