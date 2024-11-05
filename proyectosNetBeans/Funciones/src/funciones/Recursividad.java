/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

//    public static void CuentaReves(int numero) {
//        if (numero <= 0) {
//            System.out.println(numero);
//
//        } else {
//            System.out.println(numero);
//            CuentaReves(numero-1);
//        }
//    }
//    
//    public static void CuentaAtras(int numero){
//        if (numero > 0) {
//            System.out.println(numero);
//            CuentaAtras(numero-1);
//        } else {
//            System.out.println(numero);
//        }
//    }
//    
//    public static void CuentaDerecho(int numero) {
//        if (0<numero) {
//            CuentaDerecho(numero-1);
//            System.out.println(numero);
//        } else {
//            System.out.println(numero);
//        }
//    }
    public static int Sumatorio(int num) {
        int suma = num;
        if (1 < num) {
            suma += Sumatorio(num - 1);
        }
        return suma;
    }
    
    public static int Factorial(int num) {
        int suma = num;
        if (1 < num) {
            suma *= Sumatorio(num - 1);
        }
        return suma;
    }

    public static int SumatorioClase(int num) {
        if (num <= 0) {
            return 0;
        }
        return num + SumatorioClase(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("Escribe un numero: ");
        int input = sc.nextInt();
//        System.out.println("Del derecho:");
//        CuentaDerecho(input);
//        System.out.println("Del reves:");
//        CuentaReves(input);
//        System.out.println("Del reves:");
//        CuentaAtras(input);

        System.out.print(Sumatorio(input));
//        1+2+3+4+5+6= 21
    }

}
