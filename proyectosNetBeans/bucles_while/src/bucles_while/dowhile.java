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
            System.out.print("Dame un numero: ");
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
        
        /* TODO esto es lo que hice para comprobar fechas. Lo aprovecho y veo cómo meterlo en un while
        
        System.out.print("Dime un mes: ");
        String mes = teclado.next();
        System.out.print("Dime un ano: ");
        int anio = teclado.nextInt();
        System.out.print("Dime el dia del mes: ");
        int dia = teclado.nextInt();
        boolean bisiesto;
        
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            bisiesto = true;
            System.out.println("El ano " + anio + " es bisiesto");
        } else {
            bisiesto = false;
            System.out.println("El ano " + anio + " NO es bisiesto");
        }
        
        switch (mes) {
            case "enero": case "marzo": case "mayo": case "julio": case "agosto": case "octubre": case "diciembre":
            case "1": case "3": case "5": case "7": case "8": case "10": case "12":
                System.out.println("El mes tiene 31 dias.");
                break;
            case "abril": case "junio": case "septiembre": case "noviembre":
            case "4": case "6": case "9": case "11":
                System.out.println("El mes tiene 30 dias.");
                break;
            case "febrero": case "2":
                if (bisiesto) {
                    System.out.println("El mes tiene 29 dias.");
                } else {
                    System.out.println("El mes tiene 28 dias.");
                }
                break;
            default:
                System.out.println("No te he entendido.");
        }
        */
    }

}
