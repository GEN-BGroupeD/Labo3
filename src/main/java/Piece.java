public class Piece {
    private String name;
    private Square location;
    private String[] possibleName = {"thimble", "top hat", "boot", "automobile", "warship", "Scottish terrier", "wheelbarrow"};

    private static int nbPiece = 0;

    public Piece(){
        if(nbPiece >= 7)
        {
            nbPiece = 0;
        }

        name = possibleName[nbPiece++];

    }

    public Square getLocation()
    {
        return this.location;
    }

    public void setLocation(Square newLocation)
    {
        location = newLocation;
    }

    public String getPieceName()
    {
        return name;
    }

}
