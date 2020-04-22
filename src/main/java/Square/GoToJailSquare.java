package Square;

import Game.Board;
import Player.Player;

public class GoToJailSquare extends Square{
    public GoToJailSquare()
    {
        super("Go to jail");
    }

    @Override
    public void landedOn(Player player)
    {
        Board board = new Board();
        player.getPiece().setLocation(board.getSquare(10));
    }
}
