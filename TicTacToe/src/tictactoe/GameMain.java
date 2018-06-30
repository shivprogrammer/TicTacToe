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
    }
}
