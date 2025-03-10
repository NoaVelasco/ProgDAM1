package arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class buscaminas2 {

    /**
     * @param args the command line arguments
     */
    
//   @TODO meter un número concreto de minas en posiciones aleatorias.
//    @TODO algoritmo que descubre las casillas con números alrededor.
    static Scanner sc = new Scanner(System.in);

    static int nMinas = 0;
    static int cells = 81;
    static Random hayMina = new Random();
    static char[][] bckBoard;
    static char[][] frntBoard;
    static String hr = "+-----------------------------+";
    static String prMines = "  MINAS: ";
//    static String quit = "  seguir (s/n)";
    static String prRows = "  Introduce fila (1-9): ";
    static String prCols = "  Introduce columna (A-I): ";
    static boolean loop = true;

    public static char[][] makeBackBoard() {
        char[] plainBoard = new char[cells];
        for (int i = 0; i < plainBoard.length; i++) {
            int rndm = hayMina.nextInt(9);
            if (rndm == 1) {
                plainBoard[i] = '*';
                nMinas++;
            } else {
                plainBoard[i] = '-';
            }
        }
        plainBoard = scanNMines(plainBoard);
        System.out.println(Arrays.toString(plainBoard));
        int cellBoard = 0;
        char[][] board = new char[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = plainBoard[cellBoard];
                cellBoard++;
            }
        }
        cells -= nMinas;
        return board;
    }

    public static void revealNMines(int row, int col) {

    }

    public static char[] scanNMines(char[] board) {
        int[] positions = {-10, -9, -8, -1, 1, 8, 9, 10};
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '*') {
                continue;
            }
            int totMines = 0;
            for (int p = 0; p < positions.length; p++) {
//            for (int pos : positions) {
                int j = i + positions[p];
                if (j < 0) {
                    continue;
                } else if (j >= board.length) {
                    break;
                }
                if (board[j] == '*') {
                    totMines++;
                }
            }

            board[i] = Integer.toString(totMines).charAt(0);
//            System.out.println((char)totMines);
            System.out.println(board[i]);
        }
        return board;
    }

    public static char[][] makeFrontBoard() {
        char[][] board = new char[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '#';
            }
        }
        return board;
    }

    public static void showBoard(char[][] board) {
        for (char[] columnas : board) {
            System.out.println(Arrays.toString(columnas));
        }
        System.out.println("Hay " + nMinas + " minas.");
    }

    public static void updateBoard(char[][] board) {
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

    public static void checkTile(int row, int col) {
        if (bckBoard[row][col] == '*') {
            frntBoard[row][col] = 'X';
            lose();
        } else if (frntBoard[row][col] == ' ') {
            System.out.println("Esa casilla ya está revelada.");
        } else {
            frntBoard[row][col] = bckBoard[row][col];
            cells--;
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

    public static void menu() {
        System.out.println(hr);
        System.out.println(prMines + nMinas);

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
        if (cells == 0) {
            win();
        }
        updateBoard(frntBoard);
    }

    // ------------ MAIN -----------------
    public static void main(String[] args) {
        bckBoard = makeBackBoard();
        frntBoard = makeFrontBoard();
        updateBoard(frntBoard);
//        updateBoard(bckBoard, nMinas);

//        showBoard(tablero, nMinas);
//        updateBoard(hidTablero, nMinas);
        while (loop) {
            menu();
        }
        System.out.println("Fin del juego.");

        updateBoard(bckBoard);
    }

}
