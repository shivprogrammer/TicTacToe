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
        }
    }
}
