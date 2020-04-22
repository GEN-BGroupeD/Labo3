import Game.*;
import Player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Board board;
    Player player;

    @BeforeEach
    void createPlayer()
    {
        board = new Board();
        player = new Player("Tintin",board);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Tintin", "Arthur","Alain","Françoise","Sunny"})
    void playerHaveCorrectName(String testName){

        player = new Player(testName,board);
        assertEquals(testName, player.getName());
    }

    @Test
    void playerCanTakeTurn(){
        Cup cup = new Cup(2);
        String oldCase = player.getPiece().getLocation().toString();
        player.takeTurn(board,cup);
        String newCase = player.getPiece().getLocation().toString();
        assertNotEquals(oldCase,newCase);
    }
   @Test
    void playerHavePieceAndStartAtGo() {
        assertNotNull(player.getPiece());
        assertEquals("Go", player.getPiece().getLocation().toString());
    }
    @Test
    void playersEarn200WhenTheyGoThroughGoSquare(){
        player.setCash(0);
        player.getPiece().setLocation(board.getSquare(0));
        player.getPiece().getLocation().landedOn(player);
        assertEquals(200,player.getNetWorth());
    }
    @Test
    void playerLoseMoneyWhenTheyGetToTheIncomeTaxSquare()
    {
        player.setCash(200);
        player.getPiece().setLocation(board.getSquare(4));
        player.getPiece().getLocation().landedOn(player);
        assertEquals(180,player.getNetWorth());
    }

    @Test
    void playersShouldGoToJailWhenTheyGoThroughGoToJailSquare()
    {
        player.getPiece().setLocation(board.getSquare(30));
        player.getPiece().getLocation().landedOn(player);
        assertEquals(player.getPiece().getLocation().toString(), "Square 10");
    }
    @Test
    void playerStartWith1500Dollar(){
        player = new Player("Tintin",board);
        int cash = 1500;
        assertEquals(cash,player.getNetWorth());
    }
    @Test
    void cashCanBeModifiedAndAdd(){
        player.setCash(0);
        assertEquals(0,player.getNetWorth());
        player.addCash(200);
        assertEquals(200, player.getNetWorth());
    }

}