package Player;

import Game.Board;
import Game.Cup;
import Square.Square;

public class Player {
    private String name;
    private Piece piece;
    private int cash = 1500;

    public Player(String name, Board board){
     this.name = name;
     piece = new Piece();
     piece.setLocation(board.getSquare(0));
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void takeTurn(Board board, Cup cup) {
        cup.roll();
        int resultDice = cup.getRolled();

        Square newLocation = board.getSquare(piece.getLocation(),resultDice);

        piece.setLocation(newLocation);
    }

    public int getNetWorth()
    {
        return cash;
    }

    public void setCash(int cash)
    {
        cash = cash;
    }
    public void addCash(int cash) {
        this.cash += cash;
    }
}
