
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ejer3Arrays {

    /**
     * @param args the command line arguments
     */
    static Random rndm = new Random();
    static Scanner sc = new Scanner(System.in);

    public static int[] creaArray() {
        System.out.println("Tamano del array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Valores comprendidos entre MINIMO: ");
        int min = sc.nextInt();
        System.out.println("y MAXIMO: ");
        int max = sc.nextInt();

        for (int i = 0; i < size; i++) {
            boolean primo;
            int rNum;
            do {
//                primo = false;
                rNum = rndm.nextInt(max) + min;
                primo = isPrime(rNum);
            } while (!primo);
            array[i] = rNum;

        }
        return array;
    }

    public static boolean isPrime(int numero) {
        boolean primo = true;

        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 != array.length) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }
    }

    public static int sortArray(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j-1;
            while (i >= 0 && array[i] > key) {
                array[i+1] = array[i];
                i -= 1;
            }
            array[i+1] = key;
        }
//        int menor;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < array[i]) {
//                    menor = array[j];
//                    array[j] = array[i];
//                    array[i] = menor;
//                }
//            }
//        }
        return array[array.length - 1];
    }

    public static void main(String[] args) {
        int[] array = creaArray();
        printArray(array);
        System.out.println(sortArray(array) + " es el numero mas alto");
        printArray(array);
    }
}
