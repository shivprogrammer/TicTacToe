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
public class Cell {
    Seed content;
    
    int row, col;
    
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        clear();
    }
}
