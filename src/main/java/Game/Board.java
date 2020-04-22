package Game;

import Square.Square;

public class Board {
    private int sizeBoard = 40;
    private Square[] squares = new Square[sizeBoard];

    /**
     * @brief Constructeur
     */
    public Board(){
        for(int i = 0; i < sizeBoard;i++){
            squares[i] = new Square(i);
        }
    }

    /**
     * @brief Renvois la case à la position donnée
     * @param  position (int) position
     * @return (Square) Case à la position
     */
    public Square getSquare(int position){
        return squares[position];
    }

    /**
     * @brief
     * @param square (Square)   Case ou la piece se situe
     * @param position (int)    Avancement de la piece
     * @return
     */
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
