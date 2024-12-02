/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1eva;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Examen1eva {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static String menu = """
                                
            *********************************************************
            
            ***************** EXAMEN DE PROGRAMACION ****************
            
            *********************************************************
            
            *             1. Juego del Ahorcado
            
            *             2. Torres de hanoi recursivas.
            
            *             3. Dibuja un arbol.
            
            *             0. Salir
            
            *********************************************************
            """;
    public static int option = 1;

    public static void menu() {
        System.out.println(menu);
        System.out.print("Elige una opcion: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                ahorcado();
                break;
            case 2:
                System.out.println("Hanoi GUARRO");
                hanoiMal(7);
                System.out.println("-----------------------------------------");
                System.out.println("Las malditas torres de Hanoi de las narices BIEN");
                hanoiBien(3, "Torre 1", "Torre 3", "Torre 2");
                break;
            case 3:
                dibujo();
                break;
            case 0:
                System.out.println("Adiós!");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }

    public static void dibujo() {
        System.out.println("Dibujo de arbol navideno");
        System.out.print("Introduce el tamanio del arbol del 1 al 9: ");
        int naviPower = sc.nextInt();
        arbolito(naviPower);
    }

    public static void ahorcado() {
        System.out.println("Ahorcado");
        System.out.print("Introduce la palabra a adivinar: ");

        String palabra = sc.next();
        System.out.println("Numero de letras: " + palabra.length());
        hangout(palabra);
    }

    public static void hangout(String palabra) {
        String hidden1 = "";
        String hidden2;

        palabra = palabra.toUpperCase();

        // condición de victoria: que el número de letras desconocido sea 0
        int unresolved = palabra.length();

        // condición de derrota, que agote las vidas
        int vidas = 10;

        // Creamos una variable del tamaño de palabra con espacios para resolver
        for (int i = 0; i < palabra.length(); i++) {
            hidden1 += "_";
        }

        while (unresolved > 0 && vidas > 0) {
            // Hay nuevas letras acertadas?
            boolean newLet = false;
            // Hemos fallado?
            boolean strike = false;

            System.out.println("Dime una letra: ");
            char guessLetter = sc.next().toUpperCase().charAt(0);
            hidden2 = "";

            // Si la letra está en la palabra, la añade y resta un caracter desconocido
            // Si no, pierde 1 vida.
            for (int i = 0; i < palabra.length(); i++) {
                if (guessLetter == palabra.charAt(i) && guessLetter != hidden1.charAt(i)) {
                    hidden2 += guessLetter;
                    System.out.println("A tope, has acertado una letra en la posicion " + (i + 1) + "!");
                    unresolved--;
                    newLet = true;
                } else {
                    hidden2 += hidden1.charAt(i);
                    strike = true;
                }
            }
            hidden1 = hidden2;
            if (strike && !newLet) {
                vidas--;
                System.out.println("Has fallado. Tienes " + vidas + " vidas.");
            }

            System.out.println(hidden1);

        }
        if (vidas > 0) {
            System.out.println("¡Enhorabuena! Has ganado.");
        } else {
            System.out.println("Has perdido.");
        }
    }

    public static void arbolito(int maximo) {
        for (int h = 0; h < maximo; h++) {
            for (int i = 1; i <= maximo; i++) {
                for (int j = maximo; j > 0; j--) {
                    if (j > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(i);
                    }
                }
                for (int j = 1; j <= maximo; j++) {
                    if (j > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(i);
                    }
                }
                System.out.println("");
            }
        }
        for (int k = 0; k < maximo; k++) {
            System.out.print(" ");
            for (int l = 0; l < maximo * 2 - 2; l++) {
                System.out.print(maximo);
            }
            System.out.println(" ");
        }
    }

    public static void hanoiMal(int pasos) {
        if (pasos == 1) {
            System.out.println("Mover Disco 1 de Torre 1 a Torre 3");
//                System.out.println("paso 9");
            return;
        }

        switch (pasos) {
            case 7:
//                System.out.println("paso 1");
                System.out.println("Mover Disco 1 de Torre 1 a Torre 3");
                break;
            case 6:
//                System.out.println("paso 2");
                System.out.println("Mover Disco 2 de Torre 1 a Torre 2");
                break;
            case 5:
//                System.out.println("paso 3");
                System.out.println("Mover Disco 1 de Torre 3 a Torre 2");
                break;
            case 4:
//                System.out.println("paso 4");
                System.out.println("Mover Disco 3 de Torre 1 a Torre 3");
                break;
            case 3:
//                System.out.println("paso 5");
                System.out.println("Mover Disco 1 de Torre 2 a Torre 1");
                break;
            case 2:
//                System.out.println("paso 6");
                System.out.println("Mover Disco 2 de Torre 2 a Torre 3");
                break;
            default:
                throw new AssertionError();
        }
        hanoiMal(pasos - 1);
    }

    public static void hanoiBien(int disco, String deaqui, String paca, String laotra) {
        // socorro 
        // caso base se repite en pasos impares
        if (disco == 1) {
            System.out.println("Muevo disco " + disco + " de " + deaqui + " a " + paca);
            return;
        } else {
            // el 3 pasa a 2, el 2 pasa al caso base, así que esto imprime los movimientos del disco 2
            // le pasa al caso base los pasos 1 y 5
            hanoiBien(disco - 1, deaqui, laotra, paca);
            // el 3 solo se muestra 1 vez, justo en medio
            // ya tendrían que mostrarse los pasos 1 al 3, este es el 4.º
            System.out.println("Muevo disco " + disco + " de " + deaqui + " a " + paca);
            // igual que antes, el 3 pasa al 2 y el 2 al caso base, así que esto imprime los mov del disco 2
            // este le pasa al caso base los movimientos 3 y 7
            hanoiBien(disco - 1, laotra, paca, deaqui);
        }
    }

    public static void main(String[] args) {
        while (option != 0) {
            menu();
        }
    }

}
