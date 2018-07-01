package tictactoe;

import java.util.Scanner;

public class Shivvy {
    static String[] gameBoard;
    static GameState currentState;
    
//    private static Scanner in = new Scanner(System.in);
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    
    public static void IntroMessage() {
        System.out.println("Welcome to TicTacToe");
        System.out.println("This is going to be a battle of Man vs. Machine. Human, you can go first as 'X'");
        System.out.println("You can enter an integer choice based on the game board map below");
        System.out.println("Ready to Play?");
    }
    
    public static void printBoardMap() {
        System.out.println("  1  |  2  |  3  ");
        System.out.println("-----------");
        System.out.println("  4  |  5  |  6  ");
        System.out.println("-----------");
        System.out.println("  7  |  8  |  9  ");
    }
    
        public static void printBlankBoard() {
        System.out.println("     |     |     ");
        System.out.println("----------");
        System.out.println("     |     |     ");
        System.out.println("----------");
        System.out.println("     |     |     ");
    }
    
    public static void playGame() {
        clearScreen();
        printBlankBoard();
        currentState = GameState.PLAYING;
    }
    
    public static void main(String[] args) {
        clearScreen();
        IntroMessage();
        printBoardMap();
        
        gameBoard = new String[9];
        
        playGame();
        
        if (currentState == GameState.PLAYING) {
            clearScreen();
            System.out.println("ITS GAME TIME BABY");
        }
//        while (currentState == GameState.PLAYING) {
//            int playerInput;
//            
//            try {
//                playerInput = in.nextInt();
//            }
//        }
    }
}
