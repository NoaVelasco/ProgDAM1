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
    static String[][] tablero;
    static String[][] hidTablero;
    static String hr = "+--------------------------------------------+";
    static String prMines = "  MINAS: ";
    static String prRows = "  q: quitar | Introduce fila (1-9): ";
    static String prCols =  "  q: quitar | Introduce columna (A-I): ";
    static boolean loop = true;

    public static String[][] makeBackBoard() {
        String[][] tablero = new String[9][9];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                int rndm = hayMina.nextInt(9);
                if (rndm == 1) {
                    tablero[i][j] = "*";
                    nMinas++;
                } else {
                    tablero[i][j] = "@";
                }
            }
        }
        return tablero;
    }

    public static void showBoard(String[][] tablero, int nMinas) {
        for (String[] columnas : tablero) {
            System.out.println(Arrays.toString(columnas));
        }
        System.out.println("Hay " + nMinas + " minas.");
    }

    public static String[][] makeFrontBoard() {
        String[][] tablero = new String[9][9];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "#";
            }
        }
        return tablero;
    }

    public static void updateBoard(String[][] tablero, int nMinas) {
        System.out.println("    A B C D E F G H I");
        System.out.println("    -----------------");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
//        System.out.println("Hay " + nMinas + " minas.");
    }

    public static void menu() {
        updateBoard(hidTablero, nMinas);
        System.out.println(hr);
        System.out.println(prMines + nMinas);
        System.out.println(hr);
        System.out.print(prRows);
        String rowStr = sc.next();
        if (rowStr.equals("q")) {
            loop = false;
            return;
        }
        int row = Integer.parseInt(rowStr)-1;
        System.out.print(prCols);
        String column = sc.next();
        if (column.equals("q")) {
            loop = false;
            return;
        } 
        int col = (int)column.toLowerCase().charAt(0);
        col -= 97;
        System.out.println(row + " - " + col);
        
        
        
    }

    // ------------ MAIN -----------------
    public static void main(String[] args) {
        // TODO code application logic here
        tablero = makeBackBoard();
        hidTablero = makeFrontBoard();
//        showBoard(tablero, nMinas);
//        updateBoard(hidTablero, nMinas);
        while (loop) {
            menu();
        }

    }

}
