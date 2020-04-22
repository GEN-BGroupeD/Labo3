package Square;

import Player.Player;

public class Square {
    String name;
    public Square(int nb){
        if(nb == 0){
            name = "Go";
            nb ++;
        }
        else {
            name = "Square " + nb;
            nb++;
        }
    }

    @Override
    public String toString() {
        return name;
    }

   // public abstract void landedOn(Player player);
}
