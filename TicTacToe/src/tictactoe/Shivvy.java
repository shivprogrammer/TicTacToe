package tictactoe;

// ** THIS IS THE ORIGINAL FILE THAT I HAD THEN TRANSLATED INTO THE OBJECT ORIENTED PROGRAM THAT RUNS THE GAME **

//import java.util.Scanner;

//public class Shivvy {
//    public static final int YOU_LOST = -1;
//    public static final int PLAYING = 0;
//    public static final int TIE_GAME = 1;
//    public static final int YOU_WON = 3;
    
//    public static final int EMPTY = 0;
//    public static final int EX = 1;
//    public static final int OH = 2;
    
//    public static final int TOTAL_ROWS = 3;
//    public static final int TOTAL_COLS = 3;
    
//    public static final int MAXIMUM_MOVES = 9;
//    public static int moveCount = 0;
    
//    public static int[][] gameBoard = new int[TOTAL_ROWS][TOTAL_COLS];
//    static GameState currentState;
    
//    private static Scanner in = new Scanner(System.in);
    
//    public static void clearScreen() {  
//        System.out.print("\033[H\033[2J");  
//        System.out.flush();  
//    }  
    
//    public static void IntroMessage() {
//        clearScreen();
//        
//        System.out.println("Welcome to TicTacToe");
//        System.out.println("This is going to be a battle of Man vs. Machine. Human, you can go first as 'X'");
//        System.out.println("You can enter an integer combo choice based on the game board map below");
//        
//        printBoardMap();
//    }
    
//    public static void printBoardMap() {
//        System.out.println("  1,1  |  1,2  |  1,3  ");
//        System.out.println("------------------");
//        System.out.println("  2,1  |  2,2  |  2,3  ");
//        System.out.println("------------------");
//        System.out.println("  3,1  |  3,2  |  3,3  ");
//    }
        
//    public static void playGame() {
//        initializeGame();
//        
//        while (currentState == GameState.PLAYING) {
//            playerMove();
//        }
//    }
    
//    public static void checkGameState(int whoseTurn, int rowChoice, int colChoice) {
//        if (isThereWinner(EX, rowChoice, colChoice)) {
//            currentState = GameState.YOU_WON;
//        } else if (isThereWinner(OH, rowChoice, colChoice)) {
//            currentState = GameState.YOU_LOST;
//        } else if (moveCount == MAXIMUM_MOVES) {
//            currentState = GameState.TIE_GAME;
//        }
//    }
    
//    public static void initializeGame() {
//        clearScreen();
//        printBlankBoard();
//        currentState = GameState.PLAYING;
//    }
    
//    public static void printBlankBoard() {
//         for (int row = 0; row < TOTAL_ROWS; ++row) {
//            for (int col = 0; col < TOTAL_COLS; ++col) {
//                gameBoard[row][col] = EMPTY;
//            }
//        }
//    }
        
//    public static void playerMove() {
//        System.out.print("Please enter your move as 2 separate integers ranging from 1 to 3, first for x coordinate and 2nd for y coordinate: ");
//        
//        boolean validMove = false;
//        int playerRowChoice = in.nextInt() - 1;
//        int playerColChoice = in.nextInt() - 1;
//        
//        do {    
//            if ((playerRowChoice <= 2 && playerRowChoice >= 0)
//                 && (playerColChoice <=2 && playerColChoice >= 0)
//                 && gameBoard[playerRowChoice][playerColChoice] == EMPTY) {
//                    System.out.println("Successful move");
//                    gameBoard[playerRowChoice][playerColChoice] = EX;
//                    moveCount++;
//                    printBoard();
//                    validMove = true;
//                }
//            
//            else
//                System.out.print("Invalid move, please try again");
//            
//        } while (!validMove);
//        
//        checkGameState(EX, playerRowChoice, playerColChoice);
//        
//        if (currentState == GameState.PLAYING)
//            computerMove();
//    }
//        
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
        
//    public static boolean isThereWinner(int whoseTurn, int playerRowChoice, int playerColChoice) {
//        return (
//                (gameBoard[playerRowChoice][0] == whoseTurn
//                && gameBoard[playerRowChoice][1] == whoseTurn
//                && gameBoard[playerRowChoice][2] == whoseTurn)
//             ||
//                (gameBoard[0][playerColChoice] == whoseTurn
//                && gameBoard[1][playerColChoice] == whoseTurn
//                && gameBoard[2][playerColChoice] == whoseTurn)
//             ||
//                (gameBoard[0][0] == whoseTurn
//                && gameBoard[1][1] == whoseTurn
//                && gameBoard[2][2] == whoseTurn)
//             ||
//                (gameBoard[0][2] == whoseTurn
//                && gameBoard[1][1] == whoseTurn
//                && gameBoard[2][0] == whoseTurn)
//                );
//    }
        
//    public static void main(String[] args) {
//        IntroMessage();
//        System.out.print("Ready to Go? Type any buttons to start ");
//        String initiateGame  = in.next();
//        
//        if (initiateGame != "") {
//            playGame();
//            
//            if (currentState == GameState.YOU_WON) {
//                System.out.println("You're a winner my friend");
//            } else if (currentState == GameState.TIE_GAME) {
//                System.out.println("This game has resulted in a draw");
//            } else if (currentState == GameState.YOU_LOST)
//                System.out.println("Well, looks like Artificial Intelligence is going to take over the world");
//        }
//    }

//    public static void printBoard() {
//      for (int row = 0; row < TOTAL_ROWS; ++row) {
//         for (int col = 0; col < TOTAL_COLS; ++col) {
//            printCell(gameBoard[row][col]);
//            if (col != TOTAL_COLS - 1) {
//               System.out.print("|");
//            }
//         }
//         System.out.println();
//         if (row != TOTAL_ROWS - 1) {
//            System.out.println("---------");
//         }
//      }
//      System.out.println();
//   }
 
//   public static void printCell(int content) {
//      switch (content) {
//         case EMPTY:
//             System.out.print("   ");
//             break;
//         case OH:
//             System.out.print(" O ");
//             break;
//         case EX:
//             System.out.print(" X ");
//             break;
//      }
//   }
}