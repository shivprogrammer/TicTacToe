package tictactoe;

public class Shivvy {
    static String[] gameBoard;
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    
    public static void IntroMessage() {
        System.out.println("Welcome to TicTacToe");
    }
    
    static void printBoard() {
        System.out.println("     |     |     ");
        System.out.println("----------");
        System.out.println("     |     |     ");
        System.out.println("----------");
        System.out.println("     |     |     ");
    }
    
    public static void main(String[] args) {
        clearScreen();
        IntroMessage();
        printBoard();
    }
}
