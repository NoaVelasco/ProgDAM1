/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class condicionales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce num 1: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduce num 2: ");
        int num2 = teclado.nextInt();
        System.out.print("Introduce num 3: ");
        int num3 = teclado.nextInt();
        int mayor;
        int menor;

        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos los numeros (" + num1 + ") son iguales.");
            mayor = num1;
            menor = num1;
        } else if (num1 == num2) {
            System.out.println(num1 + " y " + num2 + " (numero 1 y 2) son iguales.");
            mayor = Integer.max(num1, num3);
            menor = Integer.min(num1, num3);
        } else {
            menor = Integer.min(num1, num2);
            mayor = Integer.max(num1, num2);
            if (num2 == num3) {
                System.out.println(num2 + " y " + num3 + " (numero 2 y 3) son iguales.");
            } else if (num1 == num3) {
                System.out.println(num1 + " y " + num3 + " (numero 1 y 3) son iguales.");
            } else {
                mayor = Integer.max(mayor, num3);
                menor = Integer.min(menor, num3);
            }

        }
        System.out.println(mayor + " es el mayor.");
        System.out.println(menor + " es el menor.");

      
    }
}
