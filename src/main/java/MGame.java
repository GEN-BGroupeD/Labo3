

import java.util.LinkedList;

public class MGame {
    private int nbPlayers;
    private Board board;
    private Dice dice;
    private LinkedList<Player> players;
    private static final int roundCount = 20;

    public MGame(int mbPlayers)
    {
        dice = new Dice();
        board = new Board();
        this.nbPlayers = mbPlayers;


        players = new LinkedList<Player>();
        String baseName = "Player";
        for(int i = 1; i <= nbPlayers; ++i)
        {
            players.add(new Player(baseName + i,this.board));
        }
    }

    public Board getBoard()
    {
        return board;
    }

    public Dice getDice() {
        return dice;
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void playRound(Player player)
    {
        player.takeTurn(board, dice);
    }

    public void playGame()
    {
        for(int i = 0; i < roundCount; ++i)
        {
            playRound(players.get(roundCount % nbPlayers));
        }
    }
}