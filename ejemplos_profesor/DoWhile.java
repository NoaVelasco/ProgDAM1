/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_profesor;

import java.util.Scanner;

/**
 *
 * @author ds098
 */
public class DoWhile {

    // es una variable entera
    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
         * System.out.println("Ingresa el dia de la semana");
         * String diasemana = teclado.nextLine().toLowerCase();
         * System.out.println("Ingresa el dia del mes");
         * int dia = teclado.nextInt();
         * System.out.println("Ingresa el numero mes");
         * int mes = teclado.nextInt();
         * 
         * if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
         * System.out.println("Los datos introducidos son incorrectos");
         * } else {
         * 
         * 
         * switch (diasemana) {
         * case "lunes": case "martes": case "miercoles":
         * System.out.println("¿Ha habido examenes?");
         * String respuesta = teclado.nextLine().toLowerCase();
         * respuesta = teclado.nextLine().toLowerCase();
         * if(respuesta.equals("si")){
         * System.out.println("Introduce el numero de aprobados");
         * int aprobados = teclado.nextInt();
         * System.out.println("Introduce el numero de suspensos");
         * int suspensos = teclado.nextInt();
         * 
         * System.out.println("El porcentaje de aprobados es: "
         * +((double)aprobados/((double)aprobados + (double)suspensos))*100+"%");
         * }
         * break;
         * case "jueves":
         * System.out.println("¿Cuantos alumnos asistieron?");
         * double porcentaje = teclado.nextDouble();
         * if(porcentaje > 50){
         * System.out.println("Asistio la mayoria");
         * }else{
         * System.out.println("No asistio la mayoria");
         * }
         * break;
         * case "viernes":
         * if((dia == 1 && mes == 1)||(dia == 1 && mes == 7)||(dia == 15 && mes ==
         * 1)||(dia == 15 && mes == 7)){
         * System.out.println("Comienzo de nuevo ciclo");
         * 
         * System.out.println("Introduce el numero de alumnos");
         * int alumnos = teclado.nextInt();
         * System.out.println("Introduce el precio por alumno");
         * double precio = teclado.nextDouble();
         * 
         * System.out.println("El total del curso es :" + (alumnos*precio));
         * }
         * break;
         * default:
         * System.out.println("Eres un pistolero los findes se libra cachondo");
         * break;
         * 
         * }
         * 
         * }
         * 
         * int dia;
         * int mes;
         * int anio;
         * String fecha;
         * boolean fechavalida = false;
         * 
         * do {
         * 
         * System.out.println("dame un dia");
         * dia = teclado.nextInt();
         * System.out.println("dame un mes");
         * mes = teclado.nextInt();
         * System.out.println("dame un año");
         * anio = teclado.nextInt();
         * 
         * if (mes < 1 || mes > 12) {
         * System.out.println("le fecha debe estar entre 1 y 12");
         * fechavalida = false;
         * 
         * } else {
         * switch (mes) {
         * case 2:
         * if ((anio % 4 == 0 && dia <= 29) || (anio % 4 != 0 && dia <= 28)) {
         * fechavalida = true;
         * } else {
         * fechavalida = false;
         * }
         * 
         * break;
         * 
         * case 1:
         * case 3:
         * case 5:
         * case 7:
         * case 10:
         * case 12:
         * if (dia <= 31 && dia >= 1) {
         * fechavalida=true;
         * 
         * }else{
         * fechavalida = false;}
         * 
         * case 4:
         * case 6:
         * case 8:
         * case 11:
         * if (dia <= 30 && dia >= 1) {
         * fechavalida=true;
         * }else {
         * fechavalida = false;
         * }
         * break;
         * }
         * }
         * 
         * } while (fechavalida == false);
         * System.out.println("has elegido el dia" + dia + "y el mes " + mes + "y año" +
         * anio);
         * }
         */
        int opcion;
        int opcion2;
        do {

            System.out.println("Bienvenido al menu principal");
            System.out.println("Elige una opcion:");
            System.out.println("1. Ir a submenu 1");
            System.out.println("2. Ir a submenu 2.");
            System.out.println("3. Salir.");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    do {
                        System.out.println("Estas en el submenu 1");
                        System.out.println("Pulse 1 para volver al menu principal");

                        opcion2 = teclado.nextInt();
                        if (opcion2 != 1)
                            System.err.println("Pues aqui te quedas");

                    } while (opcion2 != 1); {
                }

                    break;

                case 2:
                    do {
                        System.out.println("Estas en el submenu 2");
                        System.out.println("Pulse 1 para volver al menu principal");

                        opcion2 = teclado.nextInt();

                        if (opcion2 != 1)
                            System.err.println("Pues aqui te quedas");

                    } while (opcion2 != 1); {
                }

                    break;

            }
        } while (opcion != 3);

        System.err.println("Hasta luego Mari Carmen");

    }

}
