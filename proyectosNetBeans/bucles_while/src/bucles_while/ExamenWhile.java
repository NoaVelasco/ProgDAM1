/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_while;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ExamenWhile {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        PROGRAMA 1 -----------------------------------------------------------
        System.out.println("Programa 1: numeros entre 2 valores");
        System.out.print("Escribe el valor mínimo: ");
        int min = sc.nextInt();
        System.out.print("Escribe el valor maximo: ");
        int max = sc.nextInt();
        int inter;
        int numEscritos = 0;
        do {
            System.out.println("Escribe un numero comprendido entre minimo y maximo.");
            inter = sc.nextInt();
            numEscritos++;
        } while (inter > min && inter < max);

        System.out.println("Ese numero no era valido y el programa 1 ha terminado.");
        System.out.println("Has escrito un total de " + numEscritos + " numeros.");

//         PROGRAMA 2 -----------------------------------------------------------
        System.out.println("Programa 2: numeros hasta que te canses");
        boolean exit = false;
        boolean fallo = false;
        int par;
        String respuesta;
        while (exit == false && fallo == false) {
            System.out.println("Dame un numero par");
            par = sc.nextInt();
            if (par % 2 != 0) {
                fallo = true;
            } else {

                System.out.println("Quieres escribir otro? S/N");
                respuesta = sc.next().toLowerCase();
                if (!"s".equals(respuesta)) {
                    exit = true;
                }
            }
        }
        if (fallo) {
            System.out.print("Eso no es un numero par. ");
        }
        System.out.println("Fin del programa 2.");

        // PROGRAMA 3 -----------------------------------------------------------
        System.out.println("Programa 3: Ingresa libros.");
//        sc.nextLine();
        String input = "";
        String multiInput = "";
        String isDigit;

        int digitos = 0;
        int lineasComp = 0;

        while (!input.equals("*")) {
            System.out.print("Libro: ");
            input = sc.nextLine();
            if (!input.equals("/")) {
                multiInput += input;
            } else {
                for (int i = 0; i < multiInput.length(); i++) {

                    isDigit = "";
                    isDigit += multiInput.charAt(i);
                    switch (isDigit) {
                        case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" ->
                            digitos++;
                    }
                }
                System.out.println("Linea completa. Aparecen " + digitos + " digitos numericos.");
                digitos = 0;
                multiInput = "";
                lineasComp++;

            }

        }
        System.out.println("Fin. Se leyeron " + lineasComp + " lineas completas.");
        sc.close();
    }
}
