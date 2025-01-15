/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static int option = 1;

    static void menu() {
        System.out.println("""
                           MENU
                           -----------
                           1. Eliminar espacios
                           2. Frases infinitas
                           3. Convertir min/MAY
                           4. Extraer letras
                           5. Validar email
                           0. Salir
                           """);
        option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1 -> deleteSpaces();
            case 2 -> infinitePhrase();
            case 3 -> toLowUpp();
            case 4 -> extract();
            case 5 -> email();
            case 0 ->
                System.out.println("Adios");
            default ->
                throw new AssertionError();
        }
    }

    static void deleteSpaces() {
        System.out.print("Escribe una frase: ");
        String phrase = sc.nextLine();
        phrase = phrase.replaceAll(" ", "");
        System.out.println(phrase);
    }

    static void infinitePhrase() {
        String infinite = "";
        String phrase;
        do {
            System.out.print("Escribe una frase: ");
            phrase = sc.nextLine();
            infinite += phrase;
            infinite += " ";
        } while (!phrase.isEmpty());

        System.out.println(infinite);
    }

    static void toLowUpp() {
        System.out.print("Escribe una frase: ");
        String phrase = sc.nextLine();
        System.out.println("""
                           1. Convertir a MAYUSCULAS.
                           2. Convertir a minusculas.""");
        int convert = Integer.parseInt(sc.nextLine());
        switch (convert) {
            case 1 ->         System.out.println(phrase.toUpperCase());
            case 2 ->         System.out.println(phrase.toLowerCase());            
            default -> throw new AssertionError();
        }
    }
    
    static void email(){
        System.out.print("Escribe una dirección de correo: ");
        String email = sc.nextLine();
        String reg = "[A-Za-z0-9_.]+@[A-Za-z0-9_.]+[.][A-Za-z]{2,}";
        if (email.matches(reg)) {
            System.out.println("Es válido.");
        } else {
            System.out.println("No es válido.");
        }
    }

    static void extract(){
        System.out.print("Escribe una frase: ");
        String phrase = sc.nextLine();
        System.out.println(phrase.substring(3,5));
    }
    
    public static void main(String[] args) {
        while (option != 0) {
            menu();
        }
    }

}
