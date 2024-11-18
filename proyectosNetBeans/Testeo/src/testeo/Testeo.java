/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeo;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Testeo {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void rombo(int maximo) {
        for (int i = 1; i <= maximo; i++) {
            for (int j = 0; j < maximo - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(i + " ");
            }
            for (int j = 1; j < maximo - i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = maximo - 1; i >= 1; i--) {
            for (int j = 0; j < maximo - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(i + " ");
            }
            for (int j = 1; j < maximo - i; j++) {
                System.out.print(" ");
            }
            System.out.println("");

        }

    }

    public static String menu = """
            +------------------+
            |       MENÚ      |
            +------------------+
            | 1. Ahorcado      |
            | 2. Recursividad  |
            | 3. Dibujo        |
            | 0. Salir         |
            +------------------+
            """;
    public static int option = 1;

    public static void menu() {
        System.out.println(menu);
        System.out.print("Elige una opción: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                ahorcado();
                break;
            case 2:
                recursividad();
                break;
            case 3:
                dibujo();
                break;
            case 0:
                System.out.println("Adiós!");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                menu();
        }
    }

    public static void dibujo() {
        System.out.println("Dibujo de rombo");
        System.out.print("Introduce el tamaño del rombo del 1 al 9: ");
        int romboSize = sc.nextInt();
        newRombo(romboSize);
    }

    public static void ahorcado() {
        System.out.println("Ahorcado");
        System.out.print("Introduce la palabra a adivinar: ");

        String palabra = sc.next();
        hangout(palabra);
    }

    public static void recursividad() {
        System.out.println("Recursividad");
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void newRombo(int maximo) {
        for (int i = 1; i <= maximo; i++) {
            for (int j = maximo; j > 0; j--) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            for (int j = 1; j <= maximo; j++) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println("");
        }
        for (int i = maximo - 1; i >= 1; i--) {
            for (int j = maximo; j > 0; j--) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            for (int j = 1; j <= maximo; j++) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println("");
        }
    }

    public static void hangout(String palabra) {
        // Creamos una variable del tamaño de palabra con espacios para resolver
        String hidden1 = "";
        String hidden2;

        palabra = palabra.toUpperCase();

        // condición de victoria: que el número de letras desconocido sea 0
        int unresolved = palabra.length();

        for (int i = 0; i < palabra.length(); i++) {
            hidden1 += "_";
        }

        while (unresolved > 0) {
            // Hay nuevas letras acertadas?
            boolean newLet = false;

            System.out.println("Dime una letra: ");
            char guessLetter = sc.next().toUpperCase().charAt(0);
            hidden2 = "";

            // Si la letra está en la palabra, la añade y resta un caracter desconocido
            // Si no, o si ya está dicha, se mantiene.
            for (int i = 0; i < palabra.length(); i++) {
                if (guessLetter == palabra.charAt(i) && guessLetter != hidden1.charAt(i)) {
                    hidden2 += guessLetter;
                    unresolved--;
                    newLet = true;
                } else {
                    hidden2 += hidden1.charAt(i);
                }
            }
            hidden1 = hidden2;
            if (newLet) {
                System.out.println("¡Bravo, has acertado una letra!");
            } else {
                System.out.println("No has acertado letras nuevas");
            }

            System.out.println(hidden1);

        }
        System.out.println("¡Enhorabuena! Has ganado.");
    }

    public static void main(String[] args) {
        while (option != 0) {
//            System.out.println(menu);
//            option = sc.nextInt();
            menu();

        }

        // rombo(5);
        // newRombo(5);
        // hangout("Camarada");
    }

}
