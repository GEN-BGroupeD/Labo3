package Square;

import Player.Player;

public class IncomeTaxSquare extends Square{
    public IncomeTaxSquare(String name)
    {
        super(name);
    }

    @Override
    public void landedOn(Player player) {
        reduceCash(player);
    }

    private void reduceCash(Player player)
    {
        int cash = player.getNetWorth();
        cash -= Math.min(200, cash * 0.1);
        player.setCash(cash);
    }
}
