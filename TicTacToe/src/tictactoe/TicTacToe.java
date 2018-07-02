package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private Board gameBoard;
    private GameState currentState;
    private static Scanner consoleInput = new Scanner(System.in);
    
    public TicTacToe() {
        gameBoard = new Board(0);
        gameBoard.introMessage();
        String initiateGame  = consoleInput.next();
        
        if (initiateGame != "") {
            playGame();
            
            if (currentState == GameState.YOU_WON) {
                System.out.println("YOU WON! You're a winner my friend");
            } else if (currentState == GameState.TIE_GAME) {
                System.out.println("This game has resulted in a draw");
            } else if (currentState == GameState.YOU_LOST)
                System.out.println("COMPUTER WON! Well, looks like artificial intelligence is going to take over the world");
        }
    }
    
    public GameState getCurrentState() {
        return currentState;
    }
            
    public void initializeGame() {
        gameBoard.createEmptyBoard();
        currentState = GameState.PLAYING;
    }
    
    public void playGame() {
        initializeGame();
        while (currentState == GameState.PLAYING)
            playerMove();
   }
    
    public void playerMove() {
        System.out.println("");
        System.out.print("Please enter your move in a row and column pair with each number ranging from 1-3 (example: '1 2'): ");
        
        boolean validMove = false;
        int playerRowChoice = consoleInput.nextInt() - 1;
        int playerColChoice = consoleInput.nextInt() - 1;
        
        do {    
            if ((playerRowChoice <= Board.TOTAL_ROWS && playerRowChoice >= 0)
                 && (playerColChoice <=Board.TOTAL_COLS && playerColChoice >= 0)
                 && gameBoard.cells[playerRowChoice][playerColChoice].content == CellContent.EMPTY) {
                
                    System.out.println("You have chosen row: " + (playerRowChoice + 1) + ", and column: " + (playerColChoice + 1));
                    gameBoard.cells[playerRowChoice][playerColChoice].content = CellContent.EX;
                    gameBoard.rowChoice = playerRowChoice;
                    gameBoard.colChoice = playerColChoice;
                    gameBoard.moveCount++;
                    gameBoard.printBoardInConsole();
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
        System.out.println("");
        System.out.print("Computer, please make your move: ");
        
        boolean validMove = false;
        int compRowChoice = consoleInput.nextInt() - 1;
        int compColChoice = consoleInput.nextInt() - 1;
        
        do {
//            int compRowChoice = (int) Math.floor(Math.random() * 2);
//            int compColChoice = (int) Math.floor(Math.random() * 2);
            
            if (gameBoard.cells[compRowChoice][compColChoice].content == CellContent.EMPTY) {
                    System.out.println("Computer has chosen row: " + (compRowChoice + 1) + ", and column: " + (compColChoice + 1));
                    gameBoard.cells[compRowChoice][compColChoice].content = CellContent.OH;
                    gameBoard.rowChoice = compRowChoice;
                    gameBoard.colChoice = compColChoice;
                    gameBoard.moveCount++;
                    gameBoard.printBoardInConsole();
                    validMove = true;
            }
            
            else
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
