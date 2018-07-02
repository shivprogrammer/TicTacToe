package tictactoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShivvyTest {
    public static final int EMPTY = 0;
    public static final int EX = 1;
    public static final int OH = 2;
    public static int[][] drawGame = new int[3][3];
    public static GameState currentState = GameState.PLAYING;
    
//    @Test
//    public void isBoardEmptyAtBeginning() {
//        public static int[][] gameBoard = new int[3][3];
//        
//        Shivvy.createEmptyBoard();
//        
//        assertEquals(gameBoard[0][0], EMPTY);
//        assertEquals(gameBoard[0][1], EMPTY);
//        assertEquals(gameBoard[0][2], EMPTY);
//        assertEquals(gameBoard[1][0], EMPTY);
//        assertEquals(gameBoard[1][1], EMPTY);
//        assertEquals(gameBoard[1][2], EMPTY);
//        assertEquals(gameBoard[2][0], EMPTY);
//        assertEquals(gameBoard[2][1], EMPTY);
//        assertEquals(gameBoard[2][2], EMPTY);
//    }
        
//    @Test
//    public void gameResultsInDraw() {
//        drawGame[0][0] = 1;
//        drawGame[0][1] = 2;
//        drawGame[0][2] = 1;
//        drawGame[1][0] = 2;
//        drawGame[1][1] = 1;
//        drawGame[1][2] = 2;
//        drawGame[2][0] = 1;
//        drawGame[2][1] = 2;
//        
//        // Making the last move in a game to result in a tie
//        assertEquals(checkGameStatus(EX, 3, 3), GameState.TIE_GAME); 
//    }
    
//    public void legalPlayerMoves() {
//        
//    }

// TODO: ArrayOutOfBoundException testing for numbers out of range on inputs
    
//    public ShivvyTest() {
//    }
//    
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
//
//    /**
//     * Test of clearScreen method, of class Shivvy.
//     */
//    @Test
//    public void testClearScreen() {
//        System.out.println("clearScreen");
//        Shivvy.clearScreen();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of IntroMessage method, of class Shivvy.
//     */
//    @Test
//    public void testIntroMessage() {
//        System.out.println("IntroMessage");
//        Shivvy.IntroMessage();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of printBoardMap method, of class Shivvy.
//     */
//    @Test
//    public void testPrintBoardMap() {
//        System.out.println("printBoardMap");
//        Shivvy.printBoardMap();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of playGame method, of class Shivvy.
//     */
//    @Test
//    public void testPlayGame() {
//        System.out.println("playGame");
//        Shivvy.playGame();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkGameState method, of class Shivvy.
//     */
//    @Test
//    public void testCheckGameState() {
//        System.out.println("checkGameState");
//        int whoseTurn = 0;
//        int rowChoice = 0;
//        int colChoice = 0;
//        Shivvy.checkGameState(whoseTurn, rowChoice, colChoice);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of initializeGame method, of class Shivvy.
//     */
//    @Test
//    public void testInitializeGame() {
//        System.out.println("initializeGame");
//        Shivvy.initializeGame();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of printBlankBoard method, of class Shivvy.
//     */
//    @Test
//    public void testPrintBlankBoard() {
//        System.out.println("printBlankBoard");
//        Shivvy.printBlankBoard();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of playerMove method, of class Shivvy.
//     */
//    @Test
//    public void testPlayerMove() {
//        System.out.println("playerMove");
//        Shivvy.playerMove();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of computerMove method, of class Shivvy.
//     */
//    @Test
//    public void testComputerMove() {
//        System.out.println("computerMove");
//        Shivvy.computerMove();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isThereWinner method, of class Shivvy.
//     */
//    @Test
//    public void testIsThereWinner() {
//        System.out.println("isThereWinner");
//        int whoseTurn = 0;
//        int playerRowChoice = 0;
//        int playerColChoice = 0;
//        boolean expResult = false;
//        boolean result = Shivvy.isThereWinner(whoseTurn, playerRowChoice, playerColChoice);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class Shivvy.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Shivvy.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of printBoard method, of class Shivvy.
//     */
//    @Test
//    public void testPrintBoard() {
//        System.out.println("printBoard");
//        Shivvy.printBoard();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of printCell method, of class Shivvy.
//     */
//    @Test
//    public void testPrintCell() {
//        System.out.println("printCell");
//        int content = 0;
//        Shivvy.printCell(content);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
