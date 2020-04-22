package Player;

import Game.Board;
import Game.Cup;
import Square.Square;

public class Player {
    private String name;
    private Piece piece;
    private int cash = 1500;

    /**
     * @brief Constructeur
     * @param name (String) Nom du joueur
     * @param board (Board) Plateau
     */
    public Player(String name, Board board){
     this.name = name;
     piece = new Piece();
     piece.setLocation(board.getSquare(0));
    }

    /**
     * @return (String) nom du joueur
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return (Piece) Piece du joueur
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * @brief joue son tour
     * @param board (Board)     Plateau de jeu
     * @param cup (Cup)         Cup
     */
    public void takeTurn(Board board, Cup cup) {
        cup.roll();
        int resultDice = cup.getRolled();

        Square newLocation = board.getSquare(piece.getLocation(),resultDice);

        newLocation.landedOn(this);
        piece.setLocation(newLocation);
    }

    /**
     * @brief retourne l'argent du jouer
     * @return (int) argent
     */
    public int getNetWorth()
    {
        return cash;
    }

    /**
     * @ Set l'argent à un montant
     * @param cash (int) argent
     */
    public void setCash(int cash)
    {
        this.cash = cash;
    }

    /**
     * @brief ajoute de l'argent
     * @param cash (int) argent
     */
    public void addCash(int cash) {
        this.cash += cash;
    }
}
