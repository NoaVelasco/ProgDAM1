/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class GestionNotas {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static String[] notas = {
        "Juan Perez:Programacion:4",
        "Maria Lopez:BBDD:3",
        "Carlos Sanchez:SSII:9",
        "Ana Gomez:Programacion:6",
        "Luis Fernandez:BBDD:5",
        "Elena Martinez:SSII:10",
        "Jose Ramirez:Programacion:4",
        "Juan Perez:BBDD:5",
        "Maria Lopez:SSII:6",
        "Carlos Sanchez:Programacion:5",
        "Ana Gomez:BBDD:7",
        "Luis Fernandez:SSII:5",
        "Elena Martinez:Programacion:1",
        "Jose Ramirez:BBDD:3",
        "Juan Perez:SSII:2",
        "Maria Lopez:Programacion:8",
        "Carlos Sanchez:BBDD:4",
        "Ana Gomez:SSII:5",
        "Luis Fernandez:Programacion:6",
        "Elena Martinez:BBDD:9",
        "Jose Ramirez:SSII:10"
    };

    static int opcion;
    static String input;

    static double media(int modo, String valor) {
        int cont = 0;
        double suma = 0.0;
        double output;

        for (String reg : notas) {
            String[] division = reg.split(":");
            if (division[modo].equals(valor)) {
                suma += Double.parseDouble(division[2]);
                cont++;
            }
        }

        if (cont == 0) {
            output = 0.0;
        } else {
            output = suma * 1.0 / cont;
        }
        return output;
    }

    public static void main(String[] args) {

        System.out.println("""
                           Elige de que quieres la media: 
                           1 (alumno)
                           2 (asignatura)""");
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1 -> {
                System.out.println("""
                                   Escribe el nombre del alumno: 
                                   Juan Perez
                                   Maria Lopez
                                   Carlos Sanchez
                                   Ana Gomez
                                   Luis Fernandez
                                   Elena Martinez
                                   Jose Ramirez""");
                input = sc.nextLine();
            }
            case 2 -> {
                System.out.println("""
                                   Escribe la asignatura: 
                                   Programacion
                                   BBDD
                                   SSII""");
                input = sc.nextLine();
            }
            default -> {
                System.out.println("No es una opcion valida.");
                throw new AssertionError();
            }
        }

        double resultado = media(opcion - 1, input);
        System.out.println("La media de " + input + " es: " + resultado);

    }

}
