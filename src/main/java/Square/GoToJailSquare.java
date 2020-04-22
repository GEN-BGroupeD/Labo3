package Square;

import Game.Board;
import Player.Player;

public class GoToJailSquare extends Square{
    /**
     * Constructeur
     */
    public GoToJailSquare()
    {
        super("Go to jail");
    }

    /**
     * @brief Action à effectuer quand un joueur atteris sur une case ( aller en prison)
     * @param player (Player) player
     */
    @Override
    public void landedOn(Player player)
    {
        Board board = new Board();
        player.getPiece().setLocation(board.getSquare(10));
    }
}
