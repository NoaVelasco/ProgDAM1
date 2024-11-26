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
public class Arrays {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    static Random randomNum = new Random();

    static public void arrayMet() {
        System.out.println("Introduce la longitud del array: ");
        int longArray = sc.nextInt();
        int[] lista = new int[longArray];
        int suma = 0;
        double media;

        for (int i = 0; i < longArray; i++) {
//            int randomNum =  (int) (Math.random() * 101);
            lista[i] = randomNum.nextInt(10);
            System.out.println(lista[i]);
            suma += lista[i];
        }
        System.out.println("La suma es " + suma);
        
        
        media =  suma / (double) lista.length;
        System.out.println("La media es " + media);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        arrayMet();
    }

}
