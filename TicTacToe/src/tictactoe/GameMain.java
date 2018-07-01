/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author zen
 */
public class GameMain {
    private Board board;
    private GameSttae currentState;
    private Seed currentPlayer;
    
    private static Scanner in = new Scanner(System.in);
    
    public GameMain() {
        board = new Board();
        
        initGame();
        
        do {
            playerMove(currentPlayer);
            board.paint();
            updateGame(currentPlayer);
            
            if (currentState == GameState.CROSS_WON) {
                System.out.println(" 'X' won!!");
            }
            else if (currentState == GameState.NOUGHT_WON) {
                System.out.println(" 'O' won!!");
            }
            else if (currentState == GameState.DRAW) {
                System.out.println("It's a Draw! Bye!");
            }
            
            currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.Cross;
        } while (currentState == GameState.PLAYING);
    }
    
    public void initGame() {
        board.init();
        currentPlayer = Seed.CROSS;
        currentState = GameState.PLAYING;
    }
    
    public void playerMove(Seed theSeed) {
        boolean validInput = false;
        do {
            if (theSeed == Seed.CROSS) {
                System.out.print("Player 'X', enter your move");
            }
            else {
                 System.out.print("Player 'X', enter your move");
            }
            
            int row = in.nextInt() - 1;
            int col = in.nextInt() - 1;
            if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS && board.cells[row][col].content == Seed.EMPTY) {
                board.cells[row][col].content = theSeed;
                board.currentRow = row;
                board.currentCol = col;
                validInput = true;
            }
            else {
                System.out.println("This is an invalid move, please try again");
            }
        } while (!validInput);
    }
    
    public void updateGame(Seed theSeed) {
        if (board.hasWon(theSeed)) {
            currentState = (theSeed == Seed.CROSS) ? GameState.CROSS_WON : GameState.NOUGHT_WON;
        }
        else if (board.isDraw()) {
            currentState = GameState.DRAW;
        }
    }
    
    public static void main(String[] args) {
        new GameMain();
    }
}
