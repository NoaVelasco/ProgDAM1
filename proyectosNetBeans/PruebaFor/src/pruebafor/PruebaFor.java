/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebafor;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class PruebaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dame un numero mayor que 1: ");
        int numInput = Integer.parseInt(input.nextLine());
        boolean primo;

        for (int i = 2; i <= numInput; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {

                System.out.println(i);
            }
        }

        System.out.println("Dame una cadena de texto:");
        String strInput = input.nextLine().toLowerCase();
        strInput = strInput.replace(" ", "");
        String newStr = "";
        for (int i = 0; i < strInput.length(); i++) {
            newStr = strInput.charAt(i) + newStr;
        }

        if (strInput.equals(newStr)) {
            System.out.println("Es palindromo.");
        } else {
            System.out.println("No es palindromo");
        }
    }

}
