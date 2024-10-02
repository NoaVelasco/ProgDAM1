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
public class prog_240930 {
    // Viaje de fin de curso
    // 100 alumnos -> 65 € cada uno
    // 50 a 99 -> 70 €
    // 30 a 49 -> 95 €
    // menos de 30 -> 4000 €

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cuantos alumnos iran de viaje de fin de curso: ");
        int alumnos = teclado.nextInt();
//        double precioFinal;

        if (alumnos < 1 || alumnos > 100) {
            System.out.println("No hay viaje.");
        } else if (alumnos == 100) {
            System.out.println("El precio del viaje es de " + (alumnos * 65) + " euros");
            System.out.println("El precio por alumno es de 65 euros");
        } else if (alumnos >= 50) {
            System.out.println("El precio del viaje es de " + (alumnos * 70) + " euros");
            System.out.println("El precio por alumno es de 70 euros");
        } else if (alumnos >= 30) {
            System.out.println("El precio del viaje es de " + (alumnos * 95) + " euros");
            System.out.println("El precio por alumno es de 95 euros");
        } else {
            System.out.println("El precio del viaje es de 4000 euros");
            System.out.println("El precio por alumno es de " + (4000/alumnos)+" euros");

        }
    }
}
