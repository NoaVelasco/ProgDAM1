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
public class Bucles_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_BLUE = "\u001B[44m";
        Scanner input = new Scanner(System.in);

        /* 
         1 Escriba un programa que pida dos números enteros. 
         El programa pedirá de nuevo el segundo número mientras no sea mayor que el primero. 
         El programa terminará escribiendo los dos números.
         */
        System.out.print("Dame el primer numero: ");
        int primer = input.nextInt();
        int segundo = primer - 1;
        int contador = 0;
        while (segundo < primer) {
            if (contador > 0) {
                System.out.println(ANSI_RED + "El segundo numero no es mayor que el primero" + ANSI_RESET);
            }
            System.out.print("Dame el segundo numero: ");
            segundo = input.nextInt();
            contador++;
        }
        System.out.println("Los numeros son " + primer + " y " + segundo);

        System.out.println("--------------------------------");
        // 2. Escriba un programa que pida números enteros mientras sean cada vez más grandes.
        System.out.print("Dame un numero: ");
        int kirby = input.nextInt();
        boolean condicion = true;
        do {
            System.out.print("Dame otro numero: ");
            segundo = input.nextInt();
            if (segundo > kirby) {
                kirby = segundo;
            } else {
                condicion = false;
            }
        } while (condicion);
        System.out.println(ANSI_RED + "Ese numero era menor que el anterior." + ANSI_RESET);

        System.out.println("--------------------------------");

        // version alternativa:
        System.out.println(ANSI_BLUE + "Version alternativa" + ANSI_RESET);
        System.out.print("Dame un numero: ");
        int kirby2 = input.nextInt();
        int segundo2;

        do {
            System.out.print("Dame otro numero: ");
            segundo2 = input.nextInt();
            kirby2 += segundo2;
            segundo2 = kirby2 - segundo2;
            kirby2 -= segundo2;

        } while (segundo2 < kirby2);
        System.out.println(ANSI_RED + "Ese numero era menor que el anterior." + ANSI_RESET);

        System.out.println("--------------------------------");

        /*
        3. Escriba un programa que pida la cantidad de números positivos que se tienen que escribir 
        y a continuación pida números hasta que se haya escrito la cantidad de números positivos indicada.
         */
        System.out.print("Dime la cantidad de numeros a escribir: ");
        contador = 1;
        int tope = input.nextInt();

        while (contador <= tope) {
            System.out.print("Dame el numero " + contador + " de " + tope + ": ");
            input.nextInt();
            contador++;
        }

        System.out.println("--------------------------------");
        /*
        4. Escriba un programa que pida un valor límite positivo y a continuación pida números 
        hasta que la suma de los números introducidos supere el límite inicial.
         */
        System.out.print("Dime el limite de valor que vamos a alcanzar: ");
        int limit = input.nextInt();
        int suma = 0;
        do {
            System.out.print("Dime un numero para sumar: ");
            suma += input.nextInt();
            System.out.println("Suma = " + suma);
        } while (suma < limit);
        System.out.println(ANSI_RED + "Limite superado" + ANSI_RESET);
        System.out.println("--------------------------------");
    }

}
