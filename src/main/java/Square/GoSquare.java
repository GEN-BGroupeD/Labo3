package Square;

import Player.Player;

public class GoSquare extends  Square{
    public GoSquare()
    {
        super("Go");
    }

    @Override
    public void landedOn(Player player)
    {
        player.addCash(200);
    }
}
