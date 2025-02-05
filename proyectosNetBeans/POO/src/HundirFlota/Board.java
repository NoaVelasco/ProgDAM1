/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirFlota;

import java.util.Arrays;

/**
 *
 * @author dam1
 */
public class Board {

    final int TILES = 10;
    final char H20 = 'A';
    final char BOAT = 'B';
    final char HIT = 'X';
    final char SEA = '~';
    char[][] board = new char[TILES][TILES];
    int col, row;

    // LOS METODOS -----------------------------------------
    void makeBoard() {
        for (char[] board1 : board) {
            Arrays.fill(board1, SEA);
        }
    }
}
