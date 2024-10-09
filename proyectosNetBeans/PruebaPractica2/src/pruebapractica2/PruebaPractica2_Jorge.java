/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapractica2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class PruebaPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        Scanner input = new Scanner(System.in);
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        int contador = 0;
        while (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            if (contador > 0) {
                System.out.println("Los lados no son correctos");
            }
            contador++;
            System.out.print("Dime la longitud del lado 1: ");
            lado1 = input.nextInt();

            System.out.print("Dime la longitud del lado 2: ");
            lado2 = input.nextInt();

            System.out.print("Dime la longitud del lado 3: ");
            lado3 = input.nextInt();
        }
        System.out.println("Los lados son correctos");

        if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                System.out.println("Es equilatero");
            } else {
                System.out.println("Es isosceles");
            }
        } else {
            System.out.println("Es escaleno");
        }

        // EJERCICIO 2 
        System.out.print("Dime la coordenada de X: ");
        int ejeX = input.nextInt();
        System.out.print("Dime la coordenada de Y: ");
        int ejeY = input.nextInt();

        if (ejeX < 0 && ejeY < 0) {
            System.out.println("Está en el cuadrante 3: Izquierda/Abajo");
        } else if (ejeX < 0 && ejeY > 0) {
            System.out.println("Esta en el cuadrante 4: Izquierda/Arriba");
        } else if (ejeX > 0 && ejeY < 0) {
            System.out.println("Esta en el cuadrante 2: Derecha/Abajo");
        } else {
            System.out.println("Esta en el cuadrante 1: Derecha/Arriba");
        }

        // EJERCICIO 3
        System.out.println("Piedra, Papel o Tijeras...");
        System.out.println("Ejige jugador 1: ");
        String jugador1 = input.next().toLowerCase();
        System.out.println("Ejige jugador 2: ");
        String jugador2 = input.next().toLowerCase();
        
        System.out.println(jugador1+jugador2);
        switch (jugador1+jugador2) {
            case "piedrapiedra": case "papelpapel": case "tijerastijeras":
                System.out.println("empate");
                break;
            case "piedratijeras": case "papelpiedra": case "tijeraspapel":
                System.out.println("gana el jugador 1");
                break;
            default:
                System.out.println("gana el jugador 2");
        }



        
    }
}
