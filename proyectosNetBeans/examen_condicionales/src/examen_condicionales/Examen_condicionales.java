/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_condicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Examen_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLUE = "\u001B[44m";
        
        DecimalFormat formato = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.print("Hola, usuario.\nIntroduce el dia de la semana: ");
        String diaSemana = input.next().toLowerCase();
        System.out.print("Introduce el dia en formato numero: ");
        int dia = input.nextInt();
        System.out.print("Introduce el mes en formato numero: ");
        int mes = input.nextInt();

        int aprobados;
        int suspensos;
        double porcentaje;

        if (dia <= 31 && mes <= 12) {
            switch (diaSemana) {
                case "lunes":
                case "martes":
                case "miercoles":
                case "miércoles":
                    System.out.println(ANSI_BLUE + "NIVELES" + ANSI_RESET);
                    System.out.print("Cuantos alumnos aprobaron?: ");
                    aprobados = input.nextInt();
                    System.out.print("Cuantos alumnos suspendieron?: ");
                    suspensos = input.nextInt();

                    porcentaje = aprobados + suspensos;
                    porcentaje = (aprobados / porcentaje) * 100;

                    System.out.println("El porcentaje de aprobados es " + formato.format(porcentaje) + " %.");
                    break;
                case "jueves":
                    System.out.println(ANSI_BLUE + "PRACTICA HABLADA" + ANSI_RESET + "\nIntroduce el porcentaje de asistencia: ");
                    double asistencia = Double.parseDouble(input.next());
                    if (asistencia > 50) {
                        System.out.println("Asistio la mayoria.");
                    } else {
                        System.out.println("No asistio la mayoria.");
                    }
                    break;
                case "viernes":
                    System.out.println(ANSI_BLUE + "INGLES PARA VIAJEROS" + ANSI_RESET);
                    switch (dia + "" + mes) {
                        case "11", "151", "17", "157" -> {
                            System.out.println("Comienzo de nuevo ciclo");
                            System.out.print("Introduce la cantidad de alumnos de nuevo ciclo: ");
                            int alumnosNuevos = input.nextInt();
                            System.out.print("Introduce el precio en euros por cada alumno: ");
                            double precioAlumno = input.nextInt();

                            System.out.println("El total de ingreso por todos los alumnos es: " + (alumnosNuevos * precioAlumno));
                        }
                        default ->
                            System.out.println("Nada que introducir");
                    }
                    break;
                default:
                    System.err.println("ERROR. No es un dia de la semana valido.");
            }

        } else {
            System.err.println("ERROR. No es una fecha valida.");
        }
    }

}
