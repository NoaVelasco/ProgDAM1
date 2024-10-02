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
public class prog_240926 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

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

//        System.out.print("Dame un numero: ");
//        int num1 = teclado.nextInt();
//        System.out.print("Dame otro: ");
//        int num2 = teclado.nextInt();
//        System.out.print("Que operacion quieres hacer con ellos?: ");
//        String orden = teclado.next();
//        char ignora = 'f';
//        
//        
//        switch (orden.toLowerCase()) {
//            case "suma": case "sumar":
//                System.out.println(num1 +"+"+ num2 + "="+(num1+num2));
//                break;
//            case "resta": case "restar":
//                System.out.println(num1 +"-"+ num2 + "="+(num1-num2));
//                break;
//            case "multiplica": case "multiplicar":
//                System.out.println(num1 +"*"+ num2 + "="+(num1*num2));
//                break;
//            case "divide": case "dividir":
//                System.out.println(num1 +"/"+ num2 + "="+(num1/num2));
//                break;
//            case "modulo":
//                System.out.println(num1 +"%"+ num2 + "="+(num1%num2));
//                break;
//            default:
//                System.out.println("Escribe bien la orden, campeon.");
//        }
    }
}
