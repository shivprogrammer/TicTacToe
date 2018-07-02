package tictactoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zen
 */
public class TicTacToeTest {
    
    public TicTacToeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initializeGame method, of class TicTacToe.
     */
    @Test
    public void testInitializeGame() {
        System.out.println("initializeGame");
        TicTacToe instance = new TicTacToe();
        instance.initializeGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playGame method, of class TicTacToe.
     */
    @Test
    public void testPlayGame() {
        System.out.println("playGame");
        TicTacToe instance = new TicTacToe();
        instance.playGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        assertEquals(instance.getCurrentState() == GameState.PLAYING);
    }

    /**
     * Test of playerMove method, of class TicTacToe.
     */
    @Test
    public void testPlayerMove() {
        System.out.println("playerMove");
        TicTacToe instance = new TicTacToe();
        instance.playerMove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computerMove method, of class TicTacToe.
     */
    @Test
    public void testComputerMove() {
        System.out.println("computerMove");
        TicTacToe instance = new TicTacToe();
        instance.computerMove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkGameState method, of class TicTacToe.
     */
    @Test
    public void testCheckGameState() {
        System.out.println("checkGameState");
        CellContent player = null;
        TicTacToe instance = new TicTacToe();
        instance.checkGameState(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TicTacToe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TicTacToe.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
