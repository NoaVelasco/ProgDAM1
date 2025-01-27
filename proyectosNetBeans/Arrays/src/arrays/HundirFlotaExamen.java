/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author dam1
 */
public class HundirFlotaExamen {

    /**
     * @param args the command line arguments
     */
    // LAS VARIABLES ----------------------------------------
    static Scanner sc = new Scanner(System.in);

    //tamaño del tablero
    static final int TILES = 6;
    //caracteres
    static final char H2O = 'A';
    static final char BOAT = 'B';
    static final char HIT = 'X';
    //tablero
    static char[][] board = new char[TILES][TILES];
    static int col, row;
    //pintar tablero
    static String hr = "+-------------+";
    static String strCols = ">  Introduce columna (A-F): ";
    static String strRows = ">  Introduce fila (1-6): ";

    // bucle del juego
    static boolean loop = true;
    static int intentos = 10;
    static int toWin = 0;

    // LOS METODOS -----------------------------------------
    static void makeBoard() {
        for (char[] board1 : board) {
            Arrays.fill(board1, H2O);
        }
    }

    static void updateBoard() {
        System.out.println("    A B C D E F");
        System.out.println("  " + hr);
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("  " + hr);
    }

    static void putBoats() {
        boolean horiz = true;
        boolean validPos = true;
        boolean inPos = false;
        while (!inPos) {
            System.out.println("Vamos a introducir un barco");
            System.out.println("Quieres colocarlo en horizontal? [s/n]");
            String answer = sc.nextLine().toLowerCase();
            switch (answer.charAt(0)) {
                case 's':
                    horiz = true;
                    break;
                case 'n':
                    horiz = false;
                    break;
                default:
                    System.out.println("Por favor, elige una opcion");
                    continue;
//                    throw new AssertionError();
            }

            System.out.println("Ahora elige la posicion inicial.\n"
                    + "Recuerda que debes dejar 1 espacio para la siguiente casilla");

            System.out.println(strCols);
            String column = sc.nextLine();
            col = (int) column.toLowerCase().charAt(0);
            col -= 97;

            System.out.print(strRows);
            row = Integer.parseInt(sc.nextLine()) - 1;

            if (horiz) {

                if (col >= 0 && col + 2 <= TILES) {
                    validPos = true;
                    for (int i = col; i < col + 2; i++) {
                        if (board[row][i] != H2O) {
                            System.out.println("Esas casillas no son válidas.");
                            validPos = false;
                            break;
                        }
                    }
                    if (validPos) {
                        for (int i = col; i < col + 2; i++) {
                            board[row][i] = BOAT;
//                            updateBoard();
                        }
                        inPos = true;
                    }
                } else {
                    System.out.println("Esas casillas no son válidas.");
                }
            } else {
                if (row >= 0 && row + 2 <= TILES) {
                    validPos = true;
                    for (int i = row; i < row + 2; i++) {
                        if (board[i][col] != H2O) {
                            System.out.println("Esas casillas no son válidas.");
                            validPos = false;
                            break;
                        }
                    }
                    if (validPos) {
                        for (int i = row; i < row + 2; i++) {
                            board[i][col] = BOAT;
//                            updateBoard();
                        }
                        inPos = true;
                    }
                } else {
                    System.out.println("Esas casillas no son válidas.");
                }
            }
        }
    }

    static boolean acierto(int row, int col) {
        return board[row][col] == BOAT;
    }

    static void dispara() {
        System.out.println("Vamos a disparar.");
        System.out.println(strCols);
        String column = sc.nextLine();
        col = (int) column.toLowerCase().charAt(0);
        col -= 97;

        System.out.print(strRows);
        row = Integer.parseInt(sc.nextLine()) - 1;

        if (acierto(row, col)) {
            System.out.println("----------------- TOCADO -----------------");
            toWin++;
            board[row][col] = HIT;
        } else {
            System.out.println("----------------- AGUA -----------------");
        }
        intentos--;

    }

    static boolean ckWin() {
        if (toWin == 4) {
            loop = false;
            return true;
        }
        return false;
    }

    static boolean ckLose() {
        if (intentos == 0) {
            loop = false;
            return true;
        }
        return false;
    }

    static void game() {
        while (loop) {
            updateBoard();
            dispara();

            if (ckWin()) {
                System.out.println("----------------- FELICIDADES -----------------");
            } else if (ckLose()) {
                System.out.println("----------------- GAME OVER -----------------");
            } else {
                System.out.println("Tienes " + intentos + " intentos.");

            }
        }
    }

    public static void main(String[] args) {
        makeBoard();
        updateBoard();
        putBoats();
        updateBoard();
        putBoats();
        game();
//        updateBoard();

    }

}
