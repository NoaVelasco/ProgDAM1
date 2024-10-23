/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static double randomero;
    static DecimalFormat formato = new DecimalFormat("0.000");

    public static void calcArea() {
        System.out.println("Vamos a calcular areas. \nQue figura quieres?");
        System.out.println("1: circulo\n2: triangulo\n3: cuadrado");
        int figura = Integer.parseInt(input.next());
        switch (figura) {
            case 1:
                System.out.print("Introduce el radio: ");
                double radio = calcCir(input.nextInt());
                System.out.println(formato.format(radio));
                break;
            case 2:
                System.out.print("Introduce la base: ");
                int base = input.nextInt();
                System.out.print("Introduce la altura: ");
                int altura = input.nextInt();
                System.out.println(calcTri(base, altura));
                break;
            case 3:
                System.out.print("Intruduce el primer lado: ");
                int lado1 = input.nextInt();
                System.out.print("Intruduce el segundo lado: ");
                int lado2 = input.nextInt();
                System.out.println(calCuad(lado1, lado2));
                break;
            default:
                System.out.println("No es una entrada valida.");
        }
    }

    public static double calcCir(int radio) {
        return (radio * radio) * Math.PI;
    }

    public static int calcTri(int base, int altura) {
        return (base * altura) / 2;
    }

    public static int calCuad(int lado1, int lado2) {
        return lado1 * lado2;
    }

    // Crea una aplicación que nos genere una cantidad de números enteros aleatorios 
    // que nosotros le pasaremos por teclado. Crea un método para ello. 
    // Este método devolverá un número entero aleatorio. Muestra estos números por pantalla.
    public static void randomNums(int cantidad) {
        for (; cantidad > 0; cantidad--) {
            randomero = Math.random() * 100;

            System.out.println((int) randomero);
        }
    }

//    c)     Diseñe un método que al ingresar por teclado un número, 
//            si es par mostrar el doble, si es impar mostrar el triple.
    public static void dobleTriple(int number) {
        if (number % 2 == 0) {
            System.out.println("El doble es " + number * 2);
        } else {
            System.out.println("El triple es " + number * 3);
        }
    }

    public static void multiplica(int numer) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numer + " * " + i + " = " + numer * i);
        }
    }

    public static void main(String[] args) {

        int opcion = 0;
        while (opcion != 5) {

            switch (opcion) {
                case 0:
                    System.out.println("Elige una opcion: \n1. Calcular areas\n2. Numeros aleatorios\n3. Pares e impares \n4. Tabla de multiplicar\n5. Salir");
                    opcion = input.nextInt();
                    break;
                case 1:
                    calcArea();
                    opcion = 0;
                    break;
                case 2:
                    System.out.print("Numeros aleatorios. Cuantos quieres?: ");
                    randomNums(input.nextInt());
                    opcion = 0;
                    break;
                case 3:
                    System.out.print("Numeros pares/impares. Introduce un numerico: ");
                    dobleTriple(input.nextInt());
                    opcion = 0;
                    break;
                case 4:
                    System.out.print("Tabla de multiplicar. Introduce un numerico: ");
                    multiplica(input.nextInt());
                    opcion = 0;
                    break;
                default:
                    System.err.println("Vuelve a intentarlo.");
                    opcion = 0;
            }
        }
        System.out.println("Hasta luego.");
    }

}
