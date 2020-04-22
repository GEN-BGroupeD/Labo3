public class Board {
    private int sizeBoard = 40;
    private Square[] squares = new Square[sizeBoard];

    Board(){
        for(int i = 0; i < sizeBoard;i++){
            squares[i] = new Square();
        }
    }

    public Square getSquare(int position){
        return squares[position];
    }

    public Square getSquare(Square square, int position){
        int i = 0;
        while (squares[i] != square){
            i++;
            if(i > 40){
                return null;
            }
        }
        return squares[i+position];
    }
}
