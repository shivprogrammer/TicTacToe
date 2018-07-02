package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private Board gameBoard;
    private GameState currentState;
    private static Scanner consoleInput = new Scanner(System.in);
    
    public GameMain() {
        IntroMessage();
        System.out.print("Ready to Go? Type any buttons to start ");
        String initiateGame  = consoleInput.next();
        
        if (initiateGame != "") {
            gameBoard = new Board();
            playGame();
            
            if (currentState == GameState.YOU_WON) {
                System.out.println("You're a winner my friend");
            } else if (currentState == GameState.TIE_GAME) {
                System.out.println("This game has resulted in a draw");
            } else if (currentState == GameState.YOU_LOST)
                System.out.println("Well, looks like Artificial Intelligence is going to take over the world");
        }
//        playGame();
        
//        do {
//            playerMove(currentPlayer);
//            board.paint();
//            updateGame(currentPlayer);
//         
//            if (currentState == GameState.CROSS_WON) {
//                System.out.println("'X' won!!");
//            } else if (currentState == GameState.NOUGHT_WON) {
//                System.out.println("'O' won!!");
//            } else if (currentState == GameState.DRAW) {
//                System.out.println("It's Draw! Bye!");
//            }
//            
//        } while (currentState == GameState.PLAYING);
    }
        
    public void IntroMessage() {
        gameBoard.clearScreen();
        
        System.out.println("Welcome to TicTacToe");
        System.out.println("This is going to be a battle of Man vs. Machine. Human, you can go first as 'X'");
        System.out.println("You can enter an integer combo choice based on the game board map below");
        
        gameBoard.printBoardMap();
    }
    
    public void initializeGame() {
        gameBoard.clearScreen();
        gameBoard.printBlankBoard();
        currentState = GameState.PLAYING;
    }
    
    public void playGame() {
        initializeGame();
        
        while (currentState == GameState.PLAYING)
            playerMove();
   }
    
    public void playerMove() {
        System.out.print("Please enter your move as 2 separate integers ranging from 1 to 3, first for x coordinate and 2nd for y coordinate: ");
        
        boolean validMove = false;
        int playerRowChoice = consoleInput.nextInt() - 1;
        int playerColChoice = consoleInput.nextInt() - 1;
        
        do {    
            if ((playerRowChoice <= Board.TOTAL_ROWS && playerRowChoice >= 0)
                 && (playerColChoice <=Board.TOTAL_COLS && playerColChoice >= 0)
                 && gameBoard.cells[playerRowChoice][playerColChoice].content == CellContent.EMPTY) {
                    System.out.println("Successful move");
                    gameBoard.cells[playerRowChoice][playerColChoice].content = CellContent.EX;
                    gameBoard.rowChoice = playerRowChoice;
                    gameBoard.colChoice = playerColChoice;
//                    gameBoard.moveCount++;
                    gameBoard.printBoard();
                    validMove = true;
                }
            
            else
                System.out.print("Invalid move, please try again");
            
        } while (!validMove);
        
        gameBoard.isThereWinner(CellContent.EX);
        if (currentState == GameState.PLAYING)
            computerMove();
    }
        
//    public static void computerMove() {
//        System.out.print("Computer, please make your move ");
//        
//        boolean validMove = false;
//        int compRowChoice = in.nextInt() - 1;
//        int compColChoice = in.nextInt() - 1;
//        
//        do {
////            int compRowChoice = (int) Math.floor(Math.random() * 2);
////            int compColChoice = (int) Math.floor(Math.random() * 2);
//            
//            if (gameBoard[compRowChoice][compColChoice] == EMPTY) {
//                    System.out.println("Computer has made the choice of: " + (compRowChoice + 1) + "," + (compColChoice + 1));
//                    gameBoard[compRowChoice][compColChoice] = OH;
//                    moveCount++;
//                    printBoard();
//                    validMove = true;
//            } else
//                System.out.print("Invalid, try again");
//            
//        } while (!validMove);
//        
//        checkGameState(OH, compRowChoice, compColChoice);
//    }
    
    public static void main(String[] args) {
    }
}
