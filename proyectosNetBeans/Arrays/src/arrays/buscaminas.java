/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dam1
 */
public class buscaminas {

    /**
     * @param args the command line arguments
     */
    static int nMinas = 0;
    static Random hayMina = new Random();
    static String[][] tablero;
    static String[][] hidTablero;

    public static String[][] creaTablero() {
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

    public static void revelaTablero(String[][] tablero, int nMinas) {
        for (String[] columnas : tablero) {
            System.out.println(Arrays.toString(columnas));
        }
        System.out.println("Hay " + nMinas + " minas.");
    }

    public static String[][] escondeTablero(String[][] tablero){
        
        return tablero;
    }
    
    public static void actualizaTablero(String[][] tablero, int nMinas) {
        System.out.println("    A B C D E F G H I");
        System.out.println("    -----------------");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Hay " + nMinas + " minas.");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        tablero = creaTablero();
        hidTablero = escondeTablero(tablero);
//        revelaTablero(tablero, nMinas);
        actualizaTablero(hidTablero, nMinas);

    }

}
