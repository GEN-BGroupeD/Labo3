package Player;

import Game.Board;
import Game.Cup;
import Square.Square;

public class Player {
    private String name;
    private Piece piece;

    /**
     * @brief Constructeur
     * @param name  (String)    Nom du joueur
     * @param board (Board)     plateau
     */
    public Player(String name, Board board){
     this.name = name;
     piece = new Piece();
     piece.setLocation(board.getSquare(0));
    }

    /**
     *
     * @return (String) nom du joueur
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return (Piece) Piece
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * @brief
     * @param board (Board) plateau
     * @param cup (Cup)     cup
     */
    public void takeTurn(Board board, Cup cup) {
        cup.roll();
        int resultDice = cup.getRolled();

        Square newLocation = board.getSquare(piece.getLocation(),resultDice);

        piece.setLocation(newLocation);
    }
}
