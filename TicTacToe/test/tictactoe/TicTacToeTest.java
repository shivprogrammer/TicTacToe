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
    
    /*
    Test of playerMove method, of class TicTacToe.
    Test for valid move:
    Was playing entering in an empty cell? [HANDLED IN METHOD ITSELF]
    Was the row number entered an integer? [TODO: Add try catch block in the playerMove method]
    Was the col number entered an integer? TODO: Add try catch block in the playerMove method]
    Was the row number between 1 and 3? [HANDLED IN METHOD ITSELF]
    Was the col number between 1 and 3? [HANDLED IN METHOD ITSELF]
    */
    
    // This method is not used in game, but the logic is so it's added here for testing purposes
    public boolean isValidMove(int rowChoice, int colChoice) {
        return ((rowChoice < Board.TOTAL_ROWS && rowChoice >= 0) && (colChoice < Board.TOTAL_COLS && colChoice >= 0));
    }
    // Player Move Tests
    @Test
    public void validPlayerMove() {
        assertEquals(isValidMove(0, 2), true);
    }
    @Test
    public void invalidPlayerMove() {
        assertEquals(isValidMove(1, 100), false);
    }
    
     /*
    Test of computerMove method, of class TicTacToe.
    Test for computer making a valid move
    Test for computer making an invalid move
    */
    
    /*
    VARIOUS SCENARIOS WHERE PLAYER HAS WON
    */
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
       
    /*
    VARIOUS SCENARIOS WHERE COMPUTER HAS WON
    */
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
    
    /*
    GAME IS ONGOING
    */
    @Test
    public void stillPlayingGame() {
        Board gameBoard = new Board(7);
   
        assertEquals(gameBoard.isThereWinner(CellContent.EX), false);
        assertEquals(gameBoard.isThereWinner(CellContent.OH), false);
    }
    
    /*
    THERE WAS A TIE GAME
    */
    
   // TIE GAME 
//    @Test
//    public void gameResultedInDraw() {
//        Board gameBoard = new Board(9);
//        assertEquals(gameBoard.isThereWinner(CellContent.EX), true);
//    }
//    @Test
//    public void gameResultedInDraw() {
//        Board gameBoard = new Board(9);
//        assertEquals(gameBoard.isThereWinner(CellContent.EX), true);
//    }
}
