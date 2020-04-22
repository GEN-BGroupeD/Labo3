package Square;

import Player.Player;

public abstract class Square {
    String name;
    public Square(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

   public abstract void landedOn(Player player);
}
