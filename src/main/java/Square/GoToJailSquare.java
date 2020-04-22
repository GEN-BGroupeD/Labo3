package Square;

import Game.Board;
import Player.Player;

public class GoToJailSquare extends Square{
    public GoToJailSquare(String name)
    {
        super(name);
    }

    @Override
    public void landedOn(Player player)
    {
        Board board = new Board();
        player.getPiece().setLocation(board.getSquare(10));
    }
}
