/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class condicionales_fechas {

    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
    
            System.out.print("Dime un mes: ");
            String mes = teclado.next();
            System.out.print("Dime un ano: ");
            int anio = teclado.nextInt();
            System.out.print("Dime el dia del mes: ");
            int dia = teclado.nextInt();
            boolean bisiesto;
            // String[] diasSemana = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
           
            
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

            switch (dia%7) {
                case 1:
                    System.out.println("Estamos a lunes");
                    break;
                case 2:
                    System.out.println("Estamos a martes");
                    break;
                case 3:
                    System.out.println("Estamos a miércoles");
                    break;
                case 4:
                    System.out.println("Estamos a jueves");
                    break;
                case 5:
                    System.out.println("Estamos a viernes");
                    break;
                case 6:
                    System.out.println("Estamos a sabado");
                    break;
                case 0:
                    System.out.println("Estamos a domingo");
                    break;
                default:
                    System.out.println("No es un día válido");
            }
            // System.out.println("Estamos a " + diasSemana[dia%7]);
            
    }
}
