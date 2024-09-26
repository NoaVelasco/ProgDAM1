/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class calculos {

    static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

// CELSIUS --> FARENHEIT
        System.out.println("Introduce los grados:");
        double celsius = teclado.nextDouble();  // Aquí metemos los decimales con la coma.
        double farenheit = 32 + (9 * celsius / 5);
        System.out.println(celsius + " son " + farenheit + " grados Farenheit");

// LONGITUD CIRC
        System.out.println("Introduce la longitud de una circunferencia:");
        double longitud = Double.parseDouble(teclado.next());  // Aquí metemos los decimales con el punto.
        double radio = (double) (longitud / (2 * PI));
        System.out.println(" El radio de la circunferencia es: " + radio);

// LONGITUD TRIANGULO
        System.out.println("Introduce el primer lado de un triangulo:");
        double lado1 = Double.parseDouble(teclado.next());
        System.out.println("Introduce el segundo lado de un triangulo:");
        double lado2 = Double.parseDouble(teclado.next());
        System.out.println("Introduce el tercer lado de un triangulo:");
        double lado3 = Double.parseDouble(teclado.next());
        double triangulo = lado1 + lado2 + lado3;
        System.out.println("La longitud del triangulo es: " + triangulo);
    }

}
