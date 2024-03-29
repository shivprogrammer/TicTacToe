package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private Board gameBoard;
    private GameState currentState;
    private static Scanner consoleInput = new Scanner(System.in);
    
    public TicTacToe() {
        gameBoard = new Board(0);
        gameBoard.introMessage();
        String initiateGame = consoleInput.next();
        
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
                
    public void initializeGame() {
        gameBoard.createEmptyBoard();
        currentState = GameState.PLAYING;
    }
    
    public void playGame() {
        initializeGame();
        while (currentState == GameState.PLAYING)
            playerMove();
    }
   
    /*
    **TODO** There's an inputMismatchException to watch out for, maybe an add on would be:
    if consoleInput is an instanceOf int, then move on to the code below, OR adding in a try-catch block
    */
    public void playerMove() { 
        System.out.println("");
        
        // Ensure that chosen row integer is within valid range
        System.out.print("Human, please enter the row number of your move: ");
        int playerRowChoice = consoleInput.nextInt() - 1;
        while (playerRowChoice > Board.TOTAL_ROWS || playerRowChoice < 0) {
            System.out.print("Invalid row choice, please choose ONLY a valid row integer between 1 and 3: ");
            playerRowChoice = consoleInput.nextInt() - 1;
        }
        
        // Ensure that chosen column integer is within valid range
        System.out.print("Human, please enter the column number of your move: ");
        int playerColChoice = consoleInput.nextInt() - 1;        
        while (playerColChoice >Board.TOTAL_COLS || playerColChoice < 0) {
            System.out.print("Invalid column choice, please choose ONLY a valid column integer between 1 and 3: ");
            playerColChoice = consoleInput.nextInt() - 1;
        }
        
        // Ensure that chosen cell coordinates have not already been taken
        if (gameBoard.cells[playerRowChoice][playerColChoice].content != CellContent.EMPTY) {
            System.out.println("This cell is taken, try another combination");
            System.out.println("");
            System.out.print("Please enter the row number of your move: ");
            playerRowChoice = consoleInput.nextInt() - 1;
            System.out.print("Please enter the column number of your move: ");
            playerColChoice = consoleInput.nextInt() - 1;
        }
        
        // Update the game
        System.out.println("");
        System.out.println("You have chosen row: " + (playerRowChoice + 1) + ", and column: " + (playerColChoice + 1));
        gameBoard.cells[playerRowChoice][playerColChoice].content = CellContent.EX;
        gameBoard.rowChoice = playerRowChoice;
        gameBoard.colChoice = playerColChoice;
        gameBoard.moveCount++;
        gameBoard.printBoardInConsole();
                
        // What's next?
        checkGameState(CellContent.EX);
        if (currentState == GameState.PLAYING)
            computerMove();
    }
    
    /*
    TODO: Currently this is a 2 player game -- the randomization process for the computer was either too predictable or slow
    and wasn't functioning as effectively as I would have liked, so I reverted back to this version to showcase the full playability of the game.
    */
    public void computerMove() {
        System.out.println("");        
        boolean validMove = false;
        
        // Ensure that chosen row integer is within valid range
        System.out.print("Computer, please enter the row number of your move: ");
        int compRowChoice = consoleInput.nextInt() - 1;
        while (compRowChoice > Board.TOTAL_ROWS || compRowChoice < 0) {
            System.out.print("Invalid row choice, please choose ONLY a valid row integer between 1 and 3: ");
            compRowChoice = consoleInput.nextInt() - 1;
        }
        
        // Ensure that chosen column integer is within valid range
        System.out.print("Computer, please enter the column number of your move: ");
        int compColChoice = consoleInput.nextInt() - 1;        
        while (compColChoice >Board.TOTAL_COLS || compColChoice < 0) {
            System.out.print("Invalid column choice, please choose ONLY a valid column integer between 1 and 3: ");
            compColChoice = consoleInput.nextInt() - 1;
        }
        
        do {
            if (gameBoard.cells[compRowChoice][compColChoice].content == CellContent.EMPTY) {
                    System.out.println("");
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