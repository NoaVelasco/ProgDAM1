/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class conecta4 {

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
    static int col;
    static int row;

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

//    public static boolean checkCol(int col) {
//        for (int i = 0; i < 6; i++) {
//            if (board[i][col] == '#') {
//                return true;
//            }
//        }
//        return false;
//    }
    static boolean putToken(int col) {
        for (int i = 5; i >= 0; i--) {
            if (board[i][col] == '#') {
                board[i][col] = actualPlayer;
                row = i;
                return true;
            }
        }
        System.out.println("Esa columna ya está llena. Prueba otra.");
        System.out.println(hr);
        return false;
    }

    static void changePlayer() {
        turn++;
        actualPlayer = PLAYERS[turn % 2];
    }

    static boolean checkDiagonal(){
        int conecta4= 1;
        for (int r = row+1; r < board.length; r++) {
            if (board[r][col+1]==actualPlayer) {
                conecta4++;
            } else {
                break;
            }
            
//            TODO repetir otros ángulos.
        }
        return false;
    }
    
    static boolean checkWin() {
        int conecta4 = 0;
//        boolean win = false;
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
        return false;
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
    }

    public static void main(String[] args) {
        makeBoard();
        updateBoard();
        while (loop) {
            menu();
        }
        System.out.println("Fin del juego.");
//        updateBoard();
    }

}
