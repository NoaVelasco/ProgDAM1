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
public class kirby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2. Escriba un programa que pida números enteros mientras sean cada vez más grandes.
        System.out.print("Dame un numero: ");
        int kirby = input.nextInt();
        int segundo;
        do {
            System.out.print("Dame otro numero: ");
            segundo = input.nextInt();
            kirby += segundo;
            segundo = kirby - segundo;
            kirby -= segundo;

        } while (segundo < kirby);
        System.out.println("Ese numero era menor que el anterior.");

        System.out.println("--------------------------------");
    }

}
