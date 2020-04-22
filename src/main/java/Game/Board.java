package Game;

import Square.*;

public class Board {
    private int sizeBoard = 40;
    private Square[] squares = new Square[sizeBoard];

    public Board(){
        String baseName ="Square ";
        squares[0] = new GoSquare();
        squares[4] = new IncomeTaxSquare();
        squares[30] = new GoToJailSquare();

        int nbSquare = 1;
        for(int i = 1; i < sizeBoard;i++){
            if((i ==4)||(i ==30)){
                i++;
            }
                squares[i] = new RegularSquare(baseName+i);
                nbSquare ++;
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
        return squares[(i+position)%40];
    }
}
