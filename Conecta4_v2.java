/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author noave
 */
public class Conecta4_v2 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static char[][] board;
    static String hr = "+-----------------------------+";
    static String prCols = "  Introduce columna (1-7): ";
    static boolean loop = true;
    static final char[] PLAYERS = {'A', 'R'};
    static int turn = 0;
    static char actualPlayer = PLAYERS[0];
    static final int MAX_COLS = 7;
    static final int MAX_ROWS = 6;
    static int col;
    static int row;
    static int freeTiles = MAX_COLS * MAX_ROWS;

    public static char[][] makeBoard() {
        board = new char[6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '#';
            }
        }
        return board;
    }

    public static void updateBoard() {
        System.out.println("    1 2 3 4 5 6 7");
        System.out.println("   --------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < board[i].length; j++) {
                switch (board[i][j]) {
                    case 'A' ->
                        System.out.print("\033[0;33m" + board[i][j] + " " + "\u001B[0m");
                    case 'R' ->
                        System.out.print("\033[0;31m" + board[i][j] + " " + "\u001B[0m");
                    default ->
                        System.out.print(board[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    static boolean putToken(int col) {
        if (col >= MAX_COLS || col < 0) {
            System.out.println("Esa columna no existe. Prueba otra");
            System.out.println(hr);
        } else {
            for (int i = 5; i >= 0; i--) {
                if (board[i][col] == '#') {
                    board[i][col] = actualPlayer;
                    row = i;
                    freeTiles--;
                    System.out.println("Quedan " + freeTiles + " disponibles.");
                    return true;
                }
            }
            System.out.println("Esa columna ya está llena. Prueba otra.");
            System.out.println(hr);
        }
        return false;
    }

    static void changePlayer() {
        turn++;
        actualPlayer = PLAYERS[turn % 2];
    }

    static boolean checkDiagonal() {
        int conecta4 = 1;
        int c = col;

        if (row + 1 < MAX_ROWS) {
            // abajo + derecha
            for (int r = row + 1; r < MAX_ROWS; r++) {
                c++;
                if (c < MAX_COLS && board[r][c] == actualPlayer) {
//                System.out.println("aba-der " + c);
                    conecta4++;
                } else {
//                System.out.println("aba-der BREAK");
                    break;
                }
            }
            c = col;
        }
        if (row - 1 >= 0) {
            // arriba + izquierda
            for (int r = row - 1; r >= 0; r--) {
                c--;
                if (c >= 0 && board[r][c] == actualPlayer) {
//                    System.out.println("arr-izq " + c);
                    conecta4++;
                } else {
//                    System.out.println("arr-izq BREAK");
                    break;
                }
            }
            c = col;
        }

        if (conecta4 >= 4) {
            return true;
        }

        conecta4 = 1;

        if (row + 1 < MAX_ROWS) {
            // abajo + izquierda
            for (int r = row + 1; r < MAX_ROWS; r++) {
                c--;
                if (c >= 0 && board[r][c] == actualPlayer) {
//                    System.out.println("aba-izq " + c);
                    conecta4++;
                } else {
//                    System.out.println("aba-izq BREAK");
                    break;
                }
            }
            c = col;
        }

        if (row - 1 >= 0) {
            // arriba + derecha
            for (int r = row - 1; r >= 0; r--) {
                c++;
                if (c < MAX_COLS && board[r][c] == actualPlayer) {
//                    System.out.println("arr-der " + c);
                    conecta4++;
                } else {
//                    System.out.println("arr-der BREAK");
                    break;
                }
            }
        }

        return conecta4 >= 4;
    }

    static boolean checkWin() {
        int conecta4 = 0;
        for (int r = 0; r < 6; r++) {
            if (board[r][col] == actualPlayer) {
                conecta4++;
                if (conecta4 >= 4) {
                    return true;
                }
            } else {
                conecta4 = 0;
            }
        }
        conecta4 = 0;
        for (int c = 0; c < 6; c++) {
            if (board[row][c] == actualPlayer) {
                conecta4++;
                if (conecta4 >= 4) {
                    return true;
                }
            } else {
                conecta4 = 0;
            }
        }
        return checkDiagonal();
    }

    public static void win() {
        System.out.println("Enhorabuena, has ganado!");
        loop = false;
    }

    public static void menu() {

        System.out.println(hr);
        System.out.println("Turno del jugador " + actualPlayer);
        System.out.println(hr);
        System.out.print(prCols);
        col = Integer.parseInt(sc.next()) - 1;

        if (putToken(col)) {
            if (checkWin()) {
                win();
            }
            changePlayer();
        }
        updateBoard();
        if (freeTiles <= 0) {
            loop = false;
        }
    }

    public static void main(String[] args) {
        makeBoard();
        updateBoard();
        while (loop) {
            menu();
        }
        System.out.println("Fin del juego.");
    }
}

