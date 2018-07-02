package tictactoe;

public class Cell {
   int row;
   int col;
   CellContent content;
 
   public Cell(int row, int col) {
      this.row = row;
      this.col = col;
      clearCell();
   }
 
   public void clearCell() {
      content = CellContent.EMPTY;
   }
   
   public void printCell() {
      switch (content) {
         case EMPTY:
             System.out.print("   ");
             break;
         case OH:
             System.out.print(" O ");
             break;
         case EX:
             System.out.print(" X ");
             break;
      }
   }
}