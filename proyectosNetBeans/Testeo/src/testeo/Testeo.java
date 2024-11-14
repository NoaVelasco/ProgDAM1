/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeo;

/**
 *
 * @author dam1
 */
public class Testeo {

    /**
     * @param args the command line arguments
     */
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
        for (int i = maximo-1; i >= 1; i--) {
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
            |       MENÚ       |
            +------------------+
            | 1. Ahorcado      |
            | 2. Recursividad  |
            | 3. Dibujo        |
            | 0. Salir         |
            +------------------+
            """;

    public static void newRombo(int maximo) {
        for (int i = 1; i <= maximo; i++) {
            for (int j = maximo; j >= 0; j--) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            for (int j = 0; j <= maximo; j++) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
                System.out.println("");
        }
        for (int i = maximo; i >= 0; i--) {
            for (int j = maximo; j >= 0; j--) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
                System.out.println("");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        rombo(5);
        newRombo(5);
    }

}
