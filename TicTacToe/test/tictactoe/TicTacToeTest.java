package tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {
    
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
    
    // This method is not used in game, but the logic is so it's added here for testing purposes
    public boolean isValidMove(int rowChoice, int colChoice) {
        return ((rowChoice < Board.TOTAL_ROWS && rowChoice >= 0) && (colChoice < Board.TOTAL_COLS && colChoice >= 0));
    }
    
    // Player Input Tests
    @Test
    public void validPlayerMove() {
        assertEquals(isValidMove(0, 2), true);
    }
    @Test
    public void invalidPlayerMove() {
        assertEquals(isValidMove(1, 100), false);
    }
    
    // Player Has Won Tests
    @Test
    public void playerWonHorizontal() {
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        gameBoard.cells[0][0].content = CellContent.EX;
        gameBoard.cells[0][1].content = CellContent.EX;
        gameBoard.cells[0][2].content = CellContent.EX;
        
        assertEquals(gameBoard.isThereWinner(CellContent.EX), true);
    }
    @Test
    public void playerWonVertical() {
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        gameBoard.cells[0][0].content = CellContent.EX;
        gameBoard.cells[1][0].content = CellContent.EX;
        gameBoard.cells[2][0].content = CellContent.EX;
        
        assertEquals(gameBoard.isThereWinner(CellContent.EX), true);
    }
    @Test
    public void playerWonDiagonal() {
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        gameBoard.cells[0][0].content = CellContent.EX;
        gameBoard.cells[1][1].content = CellContent.EX;
        gameBoard.cells[2][2].content = CellContent.EX;
        
        assertEquals(gameBoard.isThereWinner(CellContent.EX), true);
    }
    @Test
    public void playerWonBackwardsDiagonal() {
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        gameBoard.cells[2][0].content = CellContent.EX;
        gameBoard.cells[1][1].content = CellContent.EX;
        gameBoard.cells[0][2].content = CellContent.EX;
        
        assertEquals(gameBoard.isThereWinner(CellContent.EX), true);
    }
       
    // Computer Has Won Tests
        @Test
    public void computerWonHorizontal() {
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        gameBoard.cells[0][0].content = CellContent.OH;
        gameBoard.cells[0][1].content = CellContent.OH;
        gameBoard.cells[0][2].content = CellContent.OH;
        
        assertEquals(gameBoard.isThereWinner(CellContent.OH), true);
    }
    @Test
    public void computerWonVertical() {
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        gameBoard.cells[0][0].content = CellContent.OH;
        gameBoard.cells[1][0].content = CellContent.OH;
        gameBoard.cells[2][0].content = CellContent.OH;
        
        assertEquals(gameBoard.isThereWinner(CellContent.OH), true);
    }
    @Test
    public void computerWonDiagonal() {
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        gameBoard.cells[0][0].content = CellContent.OH;
        gameBoard.cells[1][1].content = CellContent.OH;
        gameBoard.cells[2][2].content = CellContent.OH;
        
        assertEquals(gameBoard.isThereWinner(CellContent.OH), true);
    }
    @Test
    public void computerWonBackwardsDiagonal() {
        Board gameBoard = new Board(0);
        gameBoard.createEmptyBoard();
        gameBoard.cells[2][0].content = CellContent.OH;
        gameBoard.cells[1][1].content = CellContent.OH;
        gameBoard.cells[0][2].content = CellContent.OH;
        
        assertEquals(gameBoard.isThereWinner(CellContent.OH), true);
    }
    
    
    // Game Is Still In Session
    
    
//    @Test
//    public void computerWon() {
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
//        CellContent player = CellContent.EX;
//        TicTacToe instance = new TicTacToe();
//        instance.checkGameState(player);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }    
}
