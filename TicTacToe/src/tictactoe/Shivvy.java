package tictactoe;

import java.util.Scanner;

public class Shivvy {
    public static final int EMPTY = 0;
    public static final int EX = 1;
    public static final int OH = 2;
    
    static int[] gameBoard = new int[9];
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
        System.out.println("  1  |  2  |  3  ");
        System.out.println("-----------");
        System.out.println("  4  |  5  |  6  ");
        System.out.println("-----------");
        System.out.println("  7  |  8  |  9  ");
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
        blankBoard();
        playerMove();
    }
    
    public static void blankBoard() {
        for (int cells = 0; cells < gameBoard.length; cells++) {
            gameBoard[cells] = EMPTY;
        }
        currentState = GameState.PLAYING;
    }
    
    public static void playerMove() {
        int playerMove = in.nextInt() - 1;
        
        if (playerMove <= 8 && playerMove >= 0 && gameBoard[playerMove] == EMPTY) {
            System.out.println("Sucessful move");
        }
        else
            System.out.println("Please try again");
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
        }
        else
            System.out.println("Okay, have a great day");
        
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
