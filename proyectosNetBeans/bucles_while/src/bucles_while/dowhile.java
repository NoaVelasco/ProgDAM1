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
public class dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. pide hasta meter cero     
        int num;
        do {
            System.out.print("Dame un número: ");
            num = input.nextInt();
        } while (num != 0);

        // 2. pide nombres de alumnos. Si no quiere escribir más, no sigue. 
        String opcion;
        input.nextLine();
        do {
            System.out.println("Dime el nombre de un alumno: ");
            input.nextLine();
            System.out.println("Continuar? Si/No");
            opcion = input.nextLine();
        } while (!opcion.equalsIgnoreCase("no"));

        // 3. pide fecha hasta que sea correcta
        boolean fecha = false;
        boolean bisiesto;

        do {
            System.out.println("Introduce una fecha (dd mm aaaa): ");
            int dia = input.nextInt();
            int mes = input.nextInt();
            int anio = input.nextInt();
            bisiesto = (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia <= 31 && dia > 0) {
                        fecha = true;
                    } else {
                        System.out.println("No es una fecha correcta.");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia <= 30 && dia > 0) {
                        fecha = true;
                    } else {
                        System.out.println("No es una fecha correcta.");
                    }
                    break;
                case 2:
                    if (bisiesto && dia <= 29 && dia > 0) {
                        fecha = true;
                    } else if (bisiesto == false && dia <= 28 && dia > 0) {
                        fecha = true;
                    } else {
                        System.out.println("No es una fecha correcta.");
                    }
                    break;
                default:
                    System.out.println("No es una fecha correcta.");
            }

        } while (fecha == false);

        System.out.println("Esa fecha es correcta.");

        // 4. Menú con dos submenús
        String menu = "FILE MENU \n1. New_File... \n2. Save... \n3. Exit";
        String submenu1 = "NEW FILE SUBMENU \n1. Java \n2. Python \n3. Back";
        String submenu2 = "SAVE FILE SUBMENU \n1. .java \n2. .py \n3. Back";
        int directory = 0;
        boolean loop = true;

        do {
            switch (directory) {
                case 0:
                    System.out.println(menu);
                    System.out.println("Choose an option: ");
                    switch (input.nextLine().toLowerCase()) {
                        case "1", "new file", "new_file" ->
                            directory = 1;
                        case "2", "save" ->
                            directory = 2;
                        case "3", "exit" ->
                            loop = false;
                        default ->
                            System.out.println("Repeat the input");
                    }
                    break;
                case 1:
                    System.out.println(submenu1);
                    System.out.println("Choose an option: ");
                    switch (input.nextLine().toLowerCase()) {
                        case "1", "java" -> {
                            System.out.println("Creating new JAVA file...");
                            directory = 0;
                        }
                        case "2", "python" -> {
                            System.out.println("Creating new PYTHON file...");
                            directory = 0;
                        }
                        case "3", "back" ->
                            directory = 0;
                        default ->
                            System.out.println("Repeat the input");
                    }
                    break;
                case 2:
                    System.out.println(submenu2);
                    System.out.println("Choose an option: ");
                    switch (input.nextLine().toLowerCase()) {
                        case "1", "java" -> {
                            System.out.println("Saving as JAVA file...");
                            directory = 0;
                        }
                        case "2", "py" -> {
                            System.out.println("Saving as PYTHON file...");
                            directory = 0;
                        }
                        case "3", "back" ->
                            directory = 0;
                        default ->
                            System.out.println("Repeat the input");
                    }
                    break;

                default:
                    System.out.println("Repeat the input");
            }

        } while (loop);
        System.out.println("Hasta luegui...");

        input.close();
    }

}
