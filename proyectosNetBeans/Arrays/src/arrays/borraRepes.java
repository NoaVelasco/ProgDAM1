/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dam1
 */
public class borraRepes {

    // generar un programa que cree un array de números como el del ejemplo y después 
    // borre los números repetidos en dicho array
    // {4,5,6,4,7,5,8,9,4}
    static Random randomNum = new Random();

    static public void creaArray() {
        int coleccion[] = new int[9];
        for (int i = 0; i < 9; i++) {
            int numero = randomNum.nextInt(9) + 1;
            coleccion[i] = numero;
//            System.out.println(numero);
        }
        System.out.println(Arrays.toString(coleccion));

        eliminaRepes(coleccion);
    }

    public static void eliminaRepes(int[] coleccion) {
        int contador = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (coleccion[j] == coleccion[i]) {
                    coleccion[j] = 0;
                }
            }
            if (coleccion[i] == 0) {
                contador++;
            }
//            System.out.println(coleccion[i]);
        }
        System.out.println(Arrays.toString(coleccion));

        int[] newArray = new int[9 - contador];
        int j = 0;
        for (int i = 0; i < newArray.length; i++) {
            while (coleccion[j] == 0) {
                j++;
            }

            newArray[i] = coleccion[j];
            j++;

        }

        System.out.println(Arrays.toString(newArray));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        creaArray();
    }

}
