/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

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
    
    public static void calcArea() {
        System.out.println("Vamos a calcular areas. \nQue figura quieres?");
        System.out.println("1: circulo\n2: triangulo\n3: cuadrado");
        int figura = Integer.parseInt(input.next());
        switch (figura) {
            case 1:
                System.out.print("Introduce el radio: ");
                System.out.println(calcCir(input.nextInt()));
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
                throw new AssertionError();
        }
    }
    public static double calcCir(int radio) {
        return (radio*radio)*Math.PI;
    }
    
    public static double calcTri(int base, int altura) {
        return (base*altura)/2;
    }
    
    public static double calCuad(int lado1, int lado2) {
        return lado1*lado2;
    }
    
    
    public static void main(String[] args) {
        
        calcArea();
        
    }
    
}
