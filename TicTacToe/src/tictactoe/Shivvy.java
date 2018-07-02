package tictactoe;

import java.util.Scanner;

public class Shivvy {
    public static final int EMPTY = 0;
    public static final int EX = 1;
    public static final int OH = 2;
    public static final int ROWS = 3;
    public static final int COLS = 3;
    public static final int MAXIMUM_MOVES = 9;
    
    public static int moveCount = 0;
    
    public static int[][] gameBoard = new int[ROWS][COLS];
    static GameState currentState;
    
    private static Scanner in = new Scanner(System.in);
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    
    public static void IntroMessage() {
        System.out.println("Welcome to TicTacToe");
        System.out.println("This is going to be a battle of Man vs. Machine. Human, you can go first as 'X'");
        System.out.println("You can enter an integer combo choice based on the game board map below");
    }
    
    public static void printBoardMap() {
        System.out.println("  1,1  |  2,1  |  3,1  ");
        System.out.println("------------------");
        System.out.println("  1,2  |  2,2  |  3,2  ");
        System.out.println("------------------");
        System.out.println("  1,3  |  2,3  |  3,3  ");
    }
    
//    public static void printBlankBoard() {
//        System.out.println("     |     |     ");
//        System.out.println("----------");
//        System.out.println("     |     |     ");
//        System.out.println("----------");
//        System.out.println("     |     |     ");
//    }
    
    public static void playGame() {
        clearScreen();
//        printBlankBoard();
        createEmptyBoard();
        playerMove();
    }
    
    public static void createEmptyBoard() {
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                gameBoard[row][col] = EMPTY;
            }
        }
        currentState = GameState.PLAYING;
    }
    
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
    
    public static void playerMove() {
        System.out.println("Please enter your move as two separate integers ranging from 1 to 3");
        boolean validMove = false;
        
        do {
            int playerRowChoice = in.nextInt() - 1;
            int playerColChoice = in.nextInt() - 1;
            
            if ((playerRowChoice <= 2 && playerRowChoice >= 0)
                 && (playerColChoice <=2 && playerColChoice >= 0)
                 && gameBoard[playerRowChoice][playerColChoice] == EMPTY) {
                    System.out.println("Successful move");
                    gameBoard[playerRowChoice][playerColChoice] = EX;
                    validMove = true;
                    moveCount++;
                    tieGameCheck(moveCount);
                }
            else {
                System.out.println("Invalid move, please try again");
            }
        } while (!validMove);
        
        computerMove();
    }
    
    // TESTING FOR createEmptyBoard
    // Nevermind, you don't want to emulate the Scanner (but I don't know how the hell I am going to run the PlayerMove method without activating the damn scanner, but at least I can manually put the moves that a player could be expected to make -- this one may be an annoyance)
    public void legalPlayerMoves() {
        //
    }
    ///// END TESTING /////
    
    public static void computerMove() {
        boolean validMove = false;
        
        do {
            int compRowChoice = in.nextInt() - 1;
            int compColChoice = in.nextInt() - 1;
//            int compRowChoice = (int) Math.floor(Math.random() * 2);
//            int compColChoice = (int) Math.floor(Math.random() * 2);
            
            if (gameBoard[compRowChoice][compColChoice] == EMPTY) {
                    System.out.println("Computer has made the choice of: " + (compRowChoice + 1) + "," + (compColChoice + 1));
                    gameBoard[compRowChoice][compColChoice] = OH;
                    validMove = true;
                    moveCount++;
            }
            else {
                System.out.println("The computer fucked up");
            }
        } while (!validMove);
    }
    
    public static void tieGameCheck(int moveCount) {
        if (moveCount == MAXIMUM_MOVES) {
            currentState = GameState.TIE_GAME;
        }
    }
    
    public static void main(String[] args) {
        clearScreen();
        IntroMessage();
        printBoardMap();
        System.out.println("Ready to Go? Type anything to play");
        String initiateGame  = in.next();
        
        // Game is ongoing
        if (!(initiateGame == "")) {
            System.out.println("IT IS GAME TIME 1BABY");
            playGame();
            
            while (currentState == GameState.PLAYING) {
                playerMove();
            }
            
            if (currentState == GameState.TIE_GAME)
                System.out.println("There are no winners or losers");
        }
        else
            System.out.println("Okay, have a great day");
    }
}
