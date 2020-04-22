package Game;

import Game.Board;
import Player.Player;

import java.util.LinkedList;

public class MGame {
    private int nbPlayers;
    private Board board;
    private Cup cup;
    private LinkedList<Player> players;
    private final int MAXROUND = 20;
    private int roundCount = 0;

    /**
     * @brief Constructeur
     * @param nbPlayers (int) Nombre de joueurs dans la partie
     */
    public MGame(int nbPlayers)
    {
        if(nbPlayers >8 || nbPlayers <2){
            throw new IllegalArgumentException("Incorrect number of players");
        }
        cup = new Cup(2);
        board = new Board();
        this.nbPlayers = nbPlayers;


        players = new LinkedList<Player>();
        String baseName = "Player";
        for(int i = 1; i <= nbPlayers; ++i)
        {
            players.add(new Player(baseName + i,this.board));
        }
    }

    /**
     * @brief Renvois le plateau
     * @return (Board) Plateau
     */
    public Board getBoard()
    {
        return board;
    }

    /**
     * @brief Renvois le cup
     * @return (Cup)   Cup
     */
    public Cup getCup() {
        return cup;
    }

    /**
     * Renvois la liste des joueurs
     * @return (LinkedList<Player>) Liste des joueurs
     */
    public LinkedList<Player> getPlayers() {
        return players;
    }

    /**
     * @brief joue un tour
     */
    public void playRound()
    {
        for(int i = 0; i<nbPlayers; i++){
            players.get(i).takeTurn(board,cup);
        }
        roundCount++;
    }

    /**
     * Renvois le tour actuel
     * @return
     */
    public int getRoundCount() {
        return roundCount;
    }

    public void playGame()
    {
        for(int i = 0; i < MAXROUND; ++i)
        {
            playRound();
        }
    }
}