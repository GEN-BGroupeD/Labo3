public class Player {
    private String name;
    private Piece piece;

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

    public void takeTurn(Board board, Dice dice) {
        dice.roll();
        int resultDice = dice.getFaceValue();
        dice.roll();
        resultDice += dice.getFaceValue();

        Square newLocation = board.getSquare(piece.getLocation(),resultDice);

        piece.setLocation(newLocation);
    }
}
