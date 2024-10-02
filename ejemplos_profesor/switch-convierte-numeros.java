/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ds098
 */
public class HolaMundo {

    //es una variable entera
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num = teclado.nextInt();

        switch (num / 10) {
            case 1:
                
                System.out.print("diez");
                break;
            case 2:
                System.out.print("veinte");
                break;
            case 3:
                System.out.print("treinta");
                break;
            case 4:
                System.out.print("cuarenta");
                break;
            case 5:
                System.out.print("cincuenta");
                break;
            case 6:
                System.out.print("sesenta");
                break;
            case 7:
                System.out.print("setenta");
                break;
            case 8:
                System.out.print("ochenta");
                break;
            case 9:
                System.out.print("noventa");
                break;
        }

        if(num >=10){
            System.out.print(" y");
        }
        switch (num % 10) {
            
            case 1:
                System.out.println(" uno");
                break;
            case 2:
                System.out.println("  dos");
                break;
            case 3:
                System.out.println("  tres");
                break;
            case 4:
                System.out.println("  cuatro");
                break;
            case 5:
                System.out.println("  cinco");
                break;
            case 6:
                System.out.println("  seis");
                break;
            case 7:
                System.out.println("  siete");
                break;
            case 8:
                System.out.println("  ocho");
                break;
            case 9:
                System.out.println("  nueve");
                break;
        }

    }
}
