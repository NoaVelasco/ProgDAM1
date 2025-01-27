package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class HundirFlota00 {

    // LAS VARIABLES ----------------------------------------
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    //tamaño del tablero
    static final int TILES = 10;
    //caracteres
    static final char H2O = '~';
    static final char BOAT = 'B';
    static final char HIT = 'X';
    static final char FAIL = 'O';
    //tablero
    static char[][] board = new char[TILES][TILES];
    static char[][] frntBoard = new char[TILES][TILES];

    // bucle del juego
    static boolean loop = true;

    // LOS METODOS -----------------------------------------
    // colocar los barcos
    static void putBoats() {
        putBoat(4);
        putBoat(3);
        putBoat(3);
        putBoat(2);
        putBoat(2);
        putBoat(2);
        putBoat(1);
        putBoat(1);
        putBoat(1);
        putBoat(1);
    }

    //poner barcos segun tamaño
    static void putBoat(int size) {
        boolean axisX;
        boolean validPos = true;
        boolean inPosition = true;
        //comprobar que puede ponerse en lugar random
        while (!inPosition) {
            axisX = rand.nextBoolean();
            int row = rand.nextInt(TILES);
            int col = rand.nextInt(TILES);

            //poner en horizontal
            if (axisX) {
                //comprobar que cabe
                if (col + size <= TILES) {
                    validPos = true;
                    for (int i = col; i < col + size; i++) {
                        if (board[row][i] != H2O) {
                            validPos = false;
                            break;
                        }
                    }
                    if (validPos) {
                        for (int i = col; i < col + size; i++) {
                            board[row][i] = BOAT;
                        }
                    }
                }
                //poner en vertical
            } else {
                //comprobar que cabe
                if (row + size <= TILES) {
                    validPos = true;
                    for (int i = row; i < row + size; i++) {
                        if (board[i][col] != H2O) {
                            validPos = false;
                            break;
                        }
                    }
                    if (validPos) {
                        for (int i = row; i < row + size; i++) {
                            board[i][col] = BOAT;
                        }

                    }
                }

            }
        }
    }

    static void makeBoards() {
        for (char[] board1 : board) {
            Arrays.fill(board1, H2O);
        }
        for (char[] board1 : frntBoard) {
            Arrays.fill(board1, H2O);
        }
    }

//    static void showBoard(){
//        
//    }
//    static void updateBoard(){
//        
//    }
    public static void main(String[] args) {
        makeBoards();
        putBoats();
//        game();
    }

}
