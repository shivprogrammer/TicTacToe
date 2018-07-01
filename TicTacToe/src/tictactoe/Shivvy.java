package tictactoe;

import java.util.Scanner;

public class Shivvy {
    public static final int EMPTY = 0;
    public static final int EX = 1;
    public static final int OH = 2;
    public static final int ROWS = 3;
    public static final int COLS = 3;
    
    public static int remaningMoves = 9;
    
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
        System.out.println("You can enter an integer choice based on the game board map below");
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
    
    public static void playerMove() {
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
                    remainingMoves--;
                }
            else {
                System.out.println("Invalid move, please try again");
            }
        } while (!validMove);
        
        computerMove();
    }
    
    public static void computerMove() {
        boolean validMove = false;
        
        do {
            int compRowChoice = (int) Math.floor(Math.random() * 3);
            int compColChoice = (int) Math.floor(Math.random() * 3);
            
            if (gameBoard[compRowChoice][compColChoice] == EMPTY) {
                    System.out.println("Computer has made the choice of: " + compRowChoice + compColChoice);
                    gameBoard[playerRowChoice][playerColChoice] = OH;
                    validMove = true;
                    remainingMoves--;
            }
        } while (!validMove);
    }
    
    public static void tieGame() {
        
    }
    
    public static void main(String[] args) {
        clearScreen();
        IntroMessage();
        printBoardMap();
        System.out.println("Ready to Go? Type anything to play");
        String initiateGame  = in.next();
        
        if (!(initiateGame == "")) {
            System.out.println("IT IS GAME TIME BABY");
            playGame();
            
            while (currentState == GameState.PLAYING) {
                
            }
        }
        else
            System.out.println("Okay, have a great day");
        
        if (GameState.TIE_GAME)
            System.out.println("There are no winners or losers");
        
        // Let the games begin
//        if (currentState == GameState.PLAYING) {
//            clearScreen();
            
//            int playerInput = in.nextInt();
//            
//            switch (playerInput) {
//                case 0:
//                    System.out.println("  X  ");
//                    break;
//            }
//        }
    }
}
