package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private Board gameBoard;
    private GameState currentState;
    private static Scanner consoleInput = new Scanner(System.in);
    
    public TicTacToe() {
//        IntroMessage();
        System.out.print("Ready to Go? Type any buttons to start ");
        String initiateGame  = consoleInput.next();
        
        if (initiateGame != "") {
            gameBoard = new Board(0);
            playGame();
            
            if (currentState == GameState.YOU_WON) {
                System.out.println("You're a winner my friend");
            } else if (currentState == GameState.TIE_GAME) {
                System.out.println("This game has resulted in a draw");
            } else if (currentState == GameState.YOU_LOST)
                System.out.println("Well, looks like Artificial Intelligence is going to take over the world");
        }
    }
        
//    public void IntroMessage() {
//        gameBoard.clearScreen();
//        
//        System.out.println("Welcome to TicTacToe");
//        System.out.println("This is going to be a battle of Man vs. Machine. Human, you can go first as 'X'");
//        System.out.println("You can enter an integer combo choice based on the game board map below");
//        
//        gameBoard.printBoardMap();
//    }
    
    public void initializeGame() {
//        gameBoard.clearScreen();
        gameBoard.createBlankBoard();
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
                    gameBoard.moveCount++;
                    gameBoard.printBoard();
                    validMove = true;
                }
            
            else
                System.out.print("Invalid move, please try again");
            
        } while (!validMove);
        
        checkGameState(CellContent.EX);
        if (currentState == GameState.PLAYING)
            computerMove();
    }
        
    public void computerMove() {
        System.out.print("Computer, please make your move ");
        boolean validMove = false;
        int compRowChoice = consoleInput.nextInt() - 1;
        int compColChoice = consoleInput.nextInt() - 1;
        
        do {
//            int compRowChoice = (int) Math.floor(Math.random() * 2);
//            int compColChoice = (int) Math.floor(Math.random() * 2);
            
            if (gameBoard.cells[compRowChoice][compColChoice].content == CellContent.EMPTY) {
                    System.out.println("Computer has made the choice of: " + (compRowChoice + 1) + "," + (compColChoice + 1));
                    gameBoard.cells[compRowChoice][compColChoice].content = CellContent.OH;
                    gameBoard.rowChoice = compRowChoice;
                    gameBoard.colChoice = compColChoice;
                    gameBoard.moveCount++;
                    gameBoard.printBoard();
                    validMove = true;
            } else
                System.out.print("Invalid, try again");
            
        } while (!validMove);
        
        checkGameState(CellContent.OH);
    }
    
    public void checkGameState(CellContent player) {
        if (gameBoard.isThereWinner(CellContent.EX)) {
            currentState = GameState.YOU_WON;
        } else if (gameBoard.isThereWinner(CellContent.OH)) {
            currentState = GameState.YOU_LOST;
        } else if (gameBoard.moveCount == gameBoard.MAXIMUM_MOVES) {
            currentState = GameState.TIE_GAME;
        }
    }
    
    public static void main(String[] args) {
        new TicTacToe();
    }
}
