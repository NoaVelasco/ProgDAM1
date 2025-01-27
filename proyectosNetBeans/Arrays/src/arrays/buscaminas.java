package arrays;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class buscaminas {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static int nMinas = 0;
    static Random hayMina = new Random();
    static String[][] bckBoard;
    static String[][] frntBoard;
    static String hr = "+-----------------------------+";
    static String prMines = "  MINAS: ";
//    static String quit = "  seguir (s/n)";
    static String prRows = "  Introduce fila (1-9): ";
    static String prCols = "  Introduce columna (A-I): ";
    static boolean loop = true;

    public static char[][] makeBackBoard() {
        char[] plainBoard = new char[81];
        for (char cell : plainBoard) {
            int rndm = hayMina.nextInt(9);
            if (rndm == 1) {
                cell = '*';
                nMinas++;
            }
        }
        plainBoard = scanNMines(plainBoard);
        int cellBoard = 0;
        char[][] board = new char[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = plainBoard[cellBoard];
            }
        }
        return board;
    }
    //    public static String[][] makeBackBoard() {
    //        String[][] board = new String[9][9];
    //        for (int i = 0; i < board.length; i++) {
    //            for (int j = 0; j < board.length; j++) {
    //                int rndm = hayMina.nextInt(9);
    //                if (rndm == 1) {
    //                    board[i][j] = "*";
    //                    nMinas++;
    //                } else {
    //                    board[i][j] = " ";
    //                }
    //            }
    //        }
    //        return board;
    //    }

    //    public static TODO algoritmo que comprueba numeros de minas
    public static void revealNMines(int row, int col) {

    }

    public static char[] scanNMines(char[] board) {
        int[] positions = {-6, -5, -4, -1, 1, 4, 5, 6};
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '*') {
                continue;
            }
            int totMines = 0;
            for (int pos : positions) {
                int j = i + pos;
                if (j < 0 || j >= board.length) {
                    continue;
                }
                if (board[j] == '*') {
                    totMines++;
                }
            }
            board[i] = (char) totMines;
        }
        return board;
    }

    public static String[][] makeFrontBoard() {
        String[][] board = new String[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "#";
            }
        }
        return board;
    }

    public static void showBoard(String[][] board) {
        for (String[] columnas : board) {
            System.out.println(Arrays.toString(columnas));
        }
        System.out.println("Hay " + nMinas + " minas.");
    }

    public static void updateBoard(String[][] board, int nMinas) {
        System.out.println("    A B C D E F G H I");
        System.out.println("    -----------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
//        System.out.println("Hay " + nMinas + " minas.");
    }

    public static void menu() {
//        updateBoard(frntBoard, nMinas);
        System.out.println(hr);
        System.out.println(prMines + nMinas);
//        System.out.println(hr);
//        System.out.println(quit);
//        String question = sc.next();
//        sc.nextLine();
//        if (question.equalsIgnoreCase("n")) {
//            loop = false;
//            return;
//        }
        System.out.println(hr);
        System.out.print(prCols);
        String column = sc.next();

        int col = (int) column.toLowerCase().charAt(0);
        col -= 97;

        System.out.print(prRows);
        String rowStr = sc.next();

        int row = Integer.parseInt(rowStr) - 1;
        System.out.println("  ---------------------\n  fila " + row + " - columna " + col + "\n");

        checkTile(row, col);
        if (nMinas == 0) {
            win();
        }
        updateBoard(frntBoard, nMinas);
    }

    public static void checkTile(int row, int col) {
        if (bckBoard[row][col].contentEquals("*")) {
            frntBoard[row][col] = "X";
            lose();
        } else if (frntBoard[row][col].contentEquals(" ")) {
            System.out.println("Esa casilla ya está revelada.");
        } else {
            frntBoard[row][col] = " ";
        }
    }

    public static void win() {
        System.out.println("Enhorabuena, has ganado!");
        loop = false;
    }

    public static void lose() {
        System.out.println("Oooooh, has perdido :(");
        loop = false;
    }

    // ------------ MAIN -----------------
    public static void main(String[] args) {
        // TODO code application logic here
//        bckBoard = makeBackBoard();
        frntBoard = makeFrontBoard();
        updateBoard(frntBoard, nMinas);
//        showBoard(tablero, nMinas);
//        updateBoard(hidTablero, nMinas);
        while (loop) {
            menu();
        }
        System.out.println("Fin del juego.");
        showBoard(bckBoard);
    }

}
