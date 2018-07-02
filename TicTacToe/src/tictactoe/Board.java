package tictactoe;

public class Board {
    public static final int TOTAL_ROWS = 3;
    public static final int TOTAL_COLS = 3;
    
    public static final int MAXIMUM_MOVES = 9;
    public static int moveCount = 0;
    
    public static int rowChoice;
    public static int colChoice;
    
    public static Cell[][] cells;
    
    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
    public void printBoardMap() {
        System.out.println("  1,1  |  1,2  |  1,3  ");
        System.out.println("------------------");
        System.out.println("  2,1  |  2,2  |  2,3  ");
        System.out.println("------------------");
        System.out.println("  3,1  |  3,2  |  3,3  ");
    }
   
   public Board() {
       cells = new Cell[TOTAL_ROWS][TOTAL_COLS];
       for (int row = 0; row < TOTAL_ROWS; ++row) {
           for (int col = 0; col < TOTAL_COLS; ++col) {
               cells[row][col] = new Cell(row, col);
           }
       }
   }
   
   public void printBlankBoard() {
       for (int row = 0; row < TOTAL_ROWS; ++row) {
           for (int col = 0; col < TOTAL_COLS; ++col) {
               cells[row][col].clearCell();
           }
       }
   }
// 
//   public boolean isDraw() {
//      for (int row = 0; row < ROWS; ++row) {
//         for (int col = 0; col < COLS; ++col) {
//            if (cells[row][col].content == Seed.EMPTY) {
//               return false;
//            }
//         }
//      }
//      return true;
//   }
// 
//   public boolean hasWon(Seed theSeed) {
//      return (cells[currentRow][0].content == theSeed
//                   && cells[currentRow][1].content == theSeed
//                   && cells[currentRow][2].content == theSeed
//              || cells[0][currentCol].content == theSeed
//                   && cells[1][currentCol].content == theSeed
//                   && cells[2][currentCol].content == theSeed
//              || currentRow == currentCol
//                   && cells[0][0].content == theSeed
//                   && cells[1][1].content == theSeed
//                   && cells[2][2].content == theSeed
//              || currentRow + currentCol == 2
//                   && cells[0][2].content == theSeed
//                   && cells[1][1].content == theSeed
//                   && cells[2][0].content == theSeed);
//   }
//
   
   public static boolean isThereWinner(CellContent player) {
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
   public void printBoard() {
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
}