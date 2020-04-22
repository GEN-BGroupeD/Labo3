package Player;

import Square.Square;

public class Piece {
    private String name;
    private Square location;
    private String[] possibleName = {"thimble", "top hat", "boot", "automobile", "warship", "Scottish terrier", "wheelbarrow"};

    private static int nbPiece = 0;

    /**
     * @brief Constructeur
     */
    public Piece(){
        if(nbPiece >= 7)
        {
            nbPiece = 0;
        }

        name = possibleName[nbPiece++];

    }

    /**
     *
     * @return (Square) Location
     */
    public Square getLocation()
    {
        return this.location;
    }

    /**
     *
     * @param newLocation (Square) newLocation
     */
    public void setLocation(Square newLocation)
    {
        location = newLocation;
    }

    /**
     *
     * @return (String) nom de la piece
     */
    public String getPieceName()
    {
        return name;
    }

}
