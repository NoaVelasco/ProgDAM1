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
public class TresEnRaya01 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static char[][] board = new char[3][3];

    static String hr = "+--------------+";
    static String strGiveCols = "  Introduce columna (A,B,C): ";
    static String strGiveRows = "  Introduce fila (1,2,3): ";
    static boolean loop = true;
    static final char[] PLAYERS = {'X', '0'};
    static final char EMPTY = ' ';
    static int turn = 0;
    static char actualPlayer = PLAYERS[0];
    static int col, row;

    static void makeBoard() {
        for (char[] board1 : board) {
            Arrays.fill(board1, EMPTY);
        }
    }

    static void updateBoard() {
        System.out.println("     A    B    C");
        System.out.println("  " + hr);
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " | ");
            }
            System.out.println("\n  " + hr);
        }
    }

    static boolean validPos(int row, int col) {
        boolean output = true;
        if (col >= 3 || col < 0 || row >= 3 || row < 0) {
            output = false;
        } else if (board[row][col] == PLAYERS[0] || board[row][col] == PLAYERS[1]) {
            output = false;
        }
        return output;
    }

    static void newTurn() {
        turn++;
        actualPlayer = PLAYERS[turn % 2];
    }

    static boolean chckWin() {
        // TODO resto
        return chckDiagonals() && chckOrto();
    }

    public static void win() {
        System.out.println("Enhorabuena, has ganado!");
        loop = false;
    }

    public static void menu() {
        System.out.println(hr);
        System.out.println("Turno del jugador " + turn + "[" + actualPlayer + "]");
        System.out.println(hr);
        System.out.print(strGiveRows);
        row = Integer.parseInt(sc.nextLine()) - 1;
        System.out.print(strGiveCols);
        String column = sc.nextLine();

        col = (int) column.toLowerCase().charAt(0);
        col -= 97;

        System.out.println("  ---------------------\n  fila " + row + " - columna " + col + "\n");

        if (validPos(row, col)) {
            board[row][col]=actualPlayer;
            if (chckWin()) {
                win();
            }
            newTurn();
        }
        updateBoard();
        if (turn == 9) {
            System.out.println("Ha habido un empate.");
            loop = false;
        }
    }

    static boolean chckDiagonals() {
        boolean win = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != actualPlayer) {
                win = false;
                break;
            }
        }
        if (win) {
            return win;
        }

        win = true;
        for (int i = 0, j = 2; i < board.length; i++, j--) {
            if (board[i][j] != actualPlayer) {
                win = false;
                break;
            }
        }
        if (win) {
            return win;
        }
        return false;
    }

    static boolean chckOrto() {
        int win;
        for (int i = 0; i < board.length; i++) {
            win = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != actualPlayer) {
                    break;
                } else {
                    win++;
                }
            }
            if (win == 3) {
                return true;
            }
        }
        for (int i = 0; i < board.length; i++) {
            win = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != actualPlayer) {
                    break;
                } else {
                    win++;
                }
            }
            if (win == 3) {
                return true;
            }
        }
        return false;
    }

    static void game() {
        makeBoard();
        updateBoard();
        while (loop) {
            menu();
        }
    }

    public static void main(String[] args) {
        game();
    }

}
