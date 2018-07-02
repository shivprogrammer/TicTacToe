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
        
    public static void playGame() {
        clearScreen();
        createEmptyBoard();
        currentState = GameState.PLAYING;
        
        while (currentState == GameState.PLAYING)
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
                    
                    if (moveCount >= 5) {
                        if (didExWin(playerRowChoice, playerColChoice)) {
                            currentState = GameState.YOU_WON;
                        }
                    }
                    
                    if (moveCount == 9) {
                        currentState = GameState.TIE_GAME;
                    }
                }
            
            else
                System.out.println("Invalid move, please try again");
            
        } while (!validMove);
        
        computerMove();
    }
        
    public static void computerMove() {
        System.out.println("Computer, please make your move");
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
        
    public static boolean didExWin(int playerRowChoice, int playerColChoice) {
        return (
                (gameBoard[playerRowChoice][0] == EX
                && gameBoard[playerRowChoice][1] == EX
                && gameBoard[playerRowChoice][2] == EX)
             ||
                (gameBoard[0][playerColChoice] == EX
                && gameBoard[1][playerColChoice] == EX
                && gameBoard[2][playerColChoice] == EX)
             ||
                (gameBoard[0][0] == EX
                && gameBoard[1][1] == EX
                && gameBoard[2][2] == EX)
             ||
                (gameBoard[0][2] == EX
                && gameBoard[1][1] == EX
                && gameBoard[2][0] == EX)
                );
    }
        
    public static void main(String[] args) {
        clearScreen();
        IntroMessage();
        printBoardMap();
        System.out.println("Ready to Go? Type anything to play");
        String initiateGame  = in.next();
        
        // Game is ongoing
        if (!(initiateGame == "")) {
            System.out.println("IT IS GAME TIME BABY");
            playGame();
            
            while (currentState == GameState.PLAYING) {
                playerMove();
            }
            
            if (currentState != GameState.PLAYING) {
                if (currentState == GameState.YOU_WON) {
                    clearScreen();
                    System.out.println("YOU HAVE WON SON!!");
                }
                else if (currentState == GameState.TIE_GAME) {
                    clearScreen();
                    System.out.println("This game has resulted in a draw");
                }
            }
            
//        else
//            System.out.println("Okay, have a great day");
    }
}
