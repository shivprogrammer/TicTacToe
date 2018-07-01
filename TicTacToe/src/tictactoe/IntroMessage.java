package tictactoe;

public class IntroMessage {
    static String[] board;
    
    public static void main(String[] args) {
      populateEmptyBoard();
      System.out.println("Welcome to 2 Player Tic Tac Toe.");
      System.out.println("--------------------------------");
      printBoard();
      System.out.println("X's will play first. Enter a slot number to place X in:");
    }
    
    static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a+1);
        }
    }
    
    static void printBoard() {
        System.out.println("/---|---|---\\");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");System.out.println("/---|---|---\\");
    }
}
