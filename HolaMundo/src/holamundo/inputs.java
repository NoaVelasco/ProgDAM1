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
public class inputs {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce tu edad: ");
        int numero = teclado.nextInt();

        teclado.nextLine();
        System.out.println("Introduce tu direccion: ");
        String direccion = teclado.nextLine();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + numero);
        System.out.println("Dirección: " + direccion);
    }
}
