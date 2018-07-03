package tictactoe;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zen
 */
public class TicTacToeTest {
//    public static final int YOU_LOST = -1;
//    public static final int PLAYING = 0;
//    public static final int TIE_GAME = 1;
//    public static final int YOU_WON = 3;
        
//    public Board tieGame;
//    public Board playerWon;
//    public Board computerWon;
    
    @Test
    public void isBoardEmptyAtBeginning() {        
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        
        assertEquals(gameBoard.cells[0][0].content, CellContent.EMPTY);
        assertEquals(gameBoard.cells[0][1].content, CellContent.EMPTY);
        assertEquals(gameBoard.cells[0][2].content, CellContent.EMPTY);
        assertEquals(gameBoard.cells[1][0].content, CellContent.EMPTY);
        assertEquals(gameBoard.cells[1][1].content, CellContent.EMPTY);
        assertEquals(gameBoard.cells[1][2].content, CellContent.EMPTY);
        assertEquals(gameBoard.cells[2][0].content, CellContent.EMPTY);
        assertEquals(gameBoard.cells[2][1].content, CellContent.EMPTY);
        assertEquals(gameBoard.cells[2][2].content, CellContent.EMPTY);
    }
    
    @Test
    public void validPlayerMove() {
        
    }
    
//    @Test
//    public void playerWon() {
//        TicTacToe instance = new TicTacToe();
//        Board gameBoard = new Board(0);
//        gameBoard.createEmptyBoard();
//        gameBoard.cells[0][0].content = CellContent.EX;
//        gameBoard.cells[0][1].content = CellContent.EX;
//        gameBoard.cells[0][2].content = CellContent.EX;
//        
//        assertEquals(currentState, GameState.YOU_WON);
//    }
    
//    @Test
//    public void computerWon() {
//        
//    }
    
//    @Test
//    public void gameResultedInTie() {
//        final int TIE_GAME = 1;
//        
//        Board gameBoard = new Board(9);
//        
//        assertEquals(gameBoard.checkGameState(CellContent.EX), 1);
//    }
    
//    @Test
//    public void testPlayGame() {
//        System.out.println("playGame");
//        TicTacToe instance = new TicTacToe();
//        instance.playGame();
        
//        assertEquals(gameBoard.currentState == 0);
//    }
    
//    public TicTacToeTest() {
//    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of initializeGame method, of class TicTacToe.
     */
//    @Test
//    public void testInitializeGame() {
//        System.out.println("initializeGame");
//        TicTacToe instance = new TicTacToe();
//        instance.initializeGame();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of playGame method, of class TicTacToe.
     */

    /**
     * Test of playerMove method, of class TicTacToe.
     Test for valid move:
     Was playing entering in an empty cell?
     Was the row number entered an integer?
     Was the col number entered an integer?
     Was the row number between 1 and 3?
     Was the col number between 1 and 3?
     */
//    @Test
//    public void testPlayerMove() {
//        System.out.println("playerMove");
//        TicTacToe instance = new TicTacToe();
//        instance.playerMove();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of computerMove method, of class TicTacToe.
     Test for computer making a valid move
     Test for computer making an invalid move
     */
//    @Test
//    public void testComputerMove() {
//        System.out.println("computerMove");
//        TicTacToe instance = new TicTacToe();
//        instance.computerMove();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of checkGameState method, of class TicTacToe.
     List out a game board that would result in a draw
     List out a game board that would result in player winning
     List out a game board that would result in computer winning
     */
//    @Test
//    public void testCheckGameState() {
//        System.out.println("checkGameState");
//        CellContent player = null;
//        TicTacToe instance = new TicTacToe();
//        instance.checkGameState(player);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }    
}
