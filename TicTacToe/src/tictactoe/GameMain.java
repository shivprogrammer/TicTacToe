//package tictactoe;
//
//import java.util.Scanner;
//
public class GameMain {
//   private Board board;
//   private GameState currentState;
//   private Seed currentPlayer;
// 
//   private static Scanner in = new Scanner(System.in);
// 
//   public GameMain() {
//      board = new Board();
//      
//      initGame();
//      do {
//         playerMove(currentPlayer);
//         board.paint();
//         updateGame(currentPlayer);
//         
//         if (currentState == GameState.CROSS_WON) {
//            System.out.println("'X' won!!");
//         } else if (currentState == GameState.NOUGHT_WON) {
//            System.out.println("'O' won!!");
//         } else if (currentState == GameState.DRAW) {
//            System.out.println("It's Draw! Bye!");
//         }
//
//         currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.CROSS;
//      } while (currentState == GameState.PLAYING);
//   }
// 
//   public void initGame() {
//      board.init();
//      currentPlayer = Seed.CROSS;
//      currentState = GameState.PLAYING;
//   }
// 
//   public void playerMove(Seed theSeed) {
//      boolean validInput = false;
//      do {
//         if (theSeed == Seed.CROSS) {
//            System.out.print("Player 'X', enter your move as two separate integers from 1-3, first will correspond to the row and the second will correspond to the column to insert your X");
//         } else {
//            System.out.print("Player 'O', enter your move as two separate integers from 1-3, first will correspond to the row and the second will correspond to the column to insert your O");
//         }
//         int row = in.nextInt() - 1;
//         int col = in.nextInt() - 1;
//         if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
//               && board.cells[row][col].content == Seed.EMPTY) {
//            board.cells[row][col].content = theSeed;
//            board.currentRow = row;
//            board.currentCol = col;
//            validInput = true;
//         } else {
//            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
//                  + ") is not valid. Try again...");
//         }
//      } while (!validInput);
//   }
// 
//   public void updateGame(Seed theSeed) {
//      if (board.hasWon(theSeed)) {
//         currentState = (theSeed == Seed.CROSS) ? GameState.CROSS_WON : GameState.NOUGHT_WON;
//      } else if (board.isDraw()) {
//         currentState = GameState.DRAW;
//      }
//   }
// 
//   public static void main(String[] args) {
//      new GameMain();
//   }
}