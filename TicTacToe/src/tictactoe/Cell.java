package tictactoe;

public class Cell {
   CellContent content;
   
   int row, col;
 
   public Cell(int row, int col) {
      this.row = row;
      this.col = col;
      clear();
   }
 
   public void clear() {
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