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
    
    public static String[][] creaTablero(){
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] tablero = creaTablero();
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
        System.out.println("Hay " + nMinas + " minas.");
    }
    
}
