package tictactoe;

public class Board {
    public static final int TOTAL_ROWS = 3;
    public static final int TOTAL_COLS = 3;
    
    public static final int MAXIMUM_MOVES = 9;
    public static int moveCount = 0;
    
    int rowChoice;
    int colChoice;
    
    Cell[][] cells;
   
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