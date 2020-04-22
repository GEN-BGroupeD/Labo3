package Square;

import Player.Player;

public class GoSquare extends  Square{
    public GoSquare(String name)
    {
        super(name);
    }

    @Override
    public void landedOn(Player player)
    {
        player.addCash(200);
    }
}
