/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bucles_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_CIAN = "\u001B[36m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_BLUE = "\u001B[44m";
        Scanner teclado = new Scanner(System.in);

        // Pide 2 enteros y escribe si son pares o impares del primero al segundo
        System.out.print(ANSI_BLUE + "1. Dime un numero entero: " + ANSI_RESET);
        int numInicio = teclado.nextInt();
        System.out.print(ANSI_BLUE + "Dime otro numero entero mayor que el anterior: " + ANSI_RESET);
        int numFinal = teclado.nextInt();

        // Si el usuario introduce los números al revés, intercambia sus valores
        if (numInicio > numFinal) {
            numInicio += numFinal;
            numFinal = numInicio - numFinal;
            numInicio -= numFinal;
        }

        while (numInicio <= numFinal) {
            if (numInicio % 2 == 0) {
                System.out.println(ANSI_CIAN + numInicio + " es par" + ANSI_RESET);
            } else {
                System.out.println(ANSI_YELLOW + numInicio + " es impar" + ANSI_RESET);
            }
            numInicio++;
        }

        // Pide entero positivo y muestra sus divisores
        int dividendo = 0;
        while (dividendo <1) {  
        System.out.print(ANSI_BLUE + "2. Dime un numero entero mayor que 0: " + ANSI_RESET);
        dividendo = teclado.nextInt();
        }
        int divisor = 1;

        while (divisor < dividendo) {
            if (dividendo % divisor == 0) {
                System.out.println(divisor + " es divisor de " + dividendo);
            }
            divisor++;
        }
        
        // @TODO a partir de aquí

        // Pregunta cuántos enteros se van a introducir. Muestra cuáles son menores que el primero
        System.out.print(ANSI_BLUE + "3. Cuantos numeros vas a introducir?: " + ANSI_RESET);
        int num3 = teclado.nextInt();
        int primerNum = 0;
        for (int i = 1; i <= num3; i++) {
            System.out.print(ANSI_BLUE + "Dime numero " + i + " de " + num3 + ": " + ANSI_RESET);
            int n = teclado.nextInt();
            if (i == 1) {
                primerNum = n;
            } else {

                if (n < primerNum) {
                    System.out.println(ANSI_RED + n + " no es mayor que " + primerNum + ANSI_RESET);
                }
            }
        }

        // Pregunta cuántos números (enteros o decimales) se introducirán y los suma
        System.out.print(ANSI_BLUE + "4. Cuantos numeros vas a introducir?: " + ANSI_RESET);
        int num4 = teclado.nextInt();
        double suma = 0;
        for (int i = 1; i <= num4; i++) {
            System.out.print(ANSI_BLUE + "Dime numero " + i + " de " + num4 + ": " + ANSI_RESET);
            suma += teclado.nextDouble();
        }
        System.out.println(ANSI_YELLOW + "La suma de los numeros es " + suma + ANSI_RESET);

        // Pide el mayor, el menor y la media aritmética
        System.out.print(ANSI_BLUE + "5. Cuantos numeros vas a introducir?: " + ANSI_RESET);
        num4 = teclado.nextInt();
        double menor = Double.MAX_VALUE;
        double mayor = Double.MIN_VALUE;
        suma = 0;
        for (int i = 1; i <= num4; i++) {
            System.out.print(ANSI_BLUE + "Dime numero " + i + " de " + num4 + ": " + ANSI_RESET);
            double n = teclado.nextDouble();
            suma += n;
            if (n < menor) {
                menor = n;
            }
            if (n > mayor) {
                mayor = n;
            }
        }
        System.out.println(ANSI_BLUE + "El menor es " + menor + ANSI_RESET);
        System.out.println(ANSI_BLUE + "El mayor es " + mayor + ANSI_RESET);
        System.out.println(ANSI_BLUE + "La media es " + suma / num4 + ANSI_RESET);

    }

}
