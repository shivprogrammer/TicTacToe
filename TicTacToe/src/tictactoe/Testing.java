package tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Testing {
    // TESTING FOR createEmptyBoard
    public void isBoardEmptyAtBeginning() {
        createEmptyBoard();
        
        Test.assertEquals(gameBoard[0][0], EMPTY);
        Test.assertEquals(gameBoard[0][1], EMPTY);
        Test.assertEquals(gameBoard[0][2], EMPTY);
        Test.assertEquals(gameBoard[1][0], EMPTY);
        Test.assertEquals(gameBoard[1][1], EMPTY);
        Test.assertEquals(gameBoard[1][2], EMPTY);
        Test.assertEquals(gameBoard[2][0], EMPTY);
        Test.assertEquals(gameBoard[2][1], EMPTY);
        Test.assertEquals(gameBoard[2][2], EMPTY);
    }
    ///// END TESTING /////
    // TESTING FOR createEmptyBoard
    // Nevermind, you don't want to emulate the Scanner (but I don't know how the hell I am going to run the PlayerMove method without activating the damn scanner, but at least I can manually put the moves that a player could be expected to make -- this one may be an annoyance)
    public void legalPlayerMoves() {
        //
    }
    ///// END TESTING /////
    
     // didExWin TESTS
    ///// END TESTING /////
}