

import java.util.LinkedList;

public class MGame {
    private int nbPlayers;
    private Board board;
    private Dice dice;
    private LinkedList<Player> players;
    private final int MAXROUND = 20;
    private int roundCount = 0;

    public MGame(int nbPlayers)
    {
        if(nbPlayers >8 || nbPlayers <2){
            throw new IllegalArgumentException("Incorrect number of players");
        }
        dice = new Dice();
        board = new Board();
        this.nbPlayers = nbPlayers;


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

    public int getRoundCount() {
        return roundCount;
    }

    public void playGame()
    {
        for(int i = 0; i < MAXROUND; ++i)
        {
            playRound(players.get(roundCount % nbPlayers));
            roundCount++;
        }
    }
}