package tictactoe;

public class Board {
    public static final int TOTAL_ROWS = 3;
    public static final int TOTAL_COLS = 3;
    public final int MAXIMUM_MOVES = 9;
    
    int moveCount;
    int rowChoice;
    int colChoice;
    
    Cell[][] cells;
           
   public Board(int moveCount) {
       this.moveCount = moveCount;
       
       cells = new Cell[TOTAL_ROWS][TOTAL_COLS];
       for (int row = 0; row < TOTAL_ROWS; ++row) {
           for (int col = 0; col < TOTAL_COLS; ++col) {
               cells[row][col] = new Cell(row, col);
           }
       }
   }
   
   public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
   
   public void introMessage() {
        clearScreen();
        System.out.println("Welcome to TicTacToe");
        System.out.println("This is going to be a battle of Man vs. Machine. Human, you can go first as 'X'");
        System.out.println("You can enter an integer combo choice based on the game board map below");
        printBoardMap();
        System.out.println("");
        System.out.print("Ready to Go? Type any buttons to start ");
    }
   
   public void printBoardMap() {
        System.out.println("  1,1  |  1,2  |  1,3  ");
        System.out.println("------------------");
        System.out.println("  2,1  |  2,2  |  2,3  ");
        System.out.println("------------------");
        System.out.println("  3,1  |  3,2  |  3,3  ");
    }
   
   public void createEmptyBoard() {
       for (int row = 0; row < TOTAL_ROWS; ++row) {
           for (int col = 0; col < TOTAL_COLS; ++col) {
               cells[row][col].clearCell();
           }
       }
   }
   
   public void printBoardInConsole() {
      for (int row = 0; row < TOTAL_ROWS; ++row) {
         for (int col = 0; col < TOTAL_COLS; ++col) {
            cells[row][col].printCell();
            if (col < TOTAL_COLS - 1) System.out.print("|");
         }
         System.out.println();
         if (row < TOTAL_ROWS - 1) {
            System.out.println("---------");
         }
      }
   }
   
   public boolean isThereWinner(CellContent player) {
       return ((cells[rowChoice][0].content == player
                && cells[rowChoice][1].content == player
                && cells[rowChoice][2].content == player)
             ||
                (cells[0][colChoice].content == player
                && cells[1][colChoice].content == player
                && cells[2][colChoice].content == player)
             ||
                (cells[0][0].content == player
                && cells[1][1].content == player
                && cells[2][2].content == player)
             ||
                (cells[0][2].content == player
                && cells[1][1].content == player
                && cells[2][0].content == player));
    }
}