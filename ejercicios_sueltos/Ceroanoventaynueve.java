/*
Ejercicio
*/

import java.util.Scanner;

public class Ceroanoventaynueve {
  public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    // TE DICE EL NUMERO EN LETRAS
    System.out.print("Introduce el numero: ");
    String entreCien = teclado.nextLine();
    char dec;
    char uni;
    String decena;
    String unidad = "";
    String total = "";
    dec = entreCien.charAt(0);

    if (entreCien.length() == 1) {
        switch (dec) {
            case '0':
                total = "cero";
                break;
            case '1':
                total = "uno";
                break;
            case '2':
                total = "dos";
                break;
            case '3':
                total = "tres";
                break;
            case '4':
                total = "cuatro";
                break;
            case '5':
                total = "cinco";
                break;
            case '6':
                total = "seis";
                break;
            case '7':
                total = "siete";
                break;
            case '8':
                total = "ocho";
                break;
            case '9':
                total = "nueve";
                break;
            default:
                System.out.println("pues no sé");
        }
    } else if (entreCien.length() == 2) {
        uni = entreCien.charAt(1);

        switch (uni) {
            case '1':
                unidad = " y uno";
                break;
            case '2':
                unidad = " y dos";
                break;
            case '3':
                unidad = " y tres";
                break;
            case '4':
                unidad = " y cuatro";
                break;
            case '5':
                unidad = " y cinco";
                break;
            case '6':
                unidad = " y seis";
                break;
            case '7':
                unidad = " y siete";
                break;
            case '8':
                unidad = " y ocho";
                break;
            case '9':
                unidad = " y nueve";
                break;
            case '0':
                unidad = "";
                break;
            default:
                unidad = "";
                System.out.println("1 ha fallado en unidades");
        }
        switch (dec) {
            case '1':
                decena = "diez";
                break;
            case '2':
                decena = "veinte";
                break;
            case '3':
                decena = "treinta";
                break;
            case '4':
                decena = "cuarenta";
                break;
            case '5':
                decena = "cincuenta";
                break;
            case '6':
                decena = "sesenta";
                break;
            case '7':
                decena = "setenta";
                break;
            case '8':
                decena = "ochenta";
                break;
            case '9':
                decena = "noventa";
                break;
            default:
                decena = "";
                System.out.println("2 ha fallado en decenas");
        }

        total = decena + unidad;

        switch (entreCien) {
            case "10":
                total = "diez";
                break;
            case "11":
                total = "once";
                break;
            case "12":
                total = "doce";
                break;
            case "13":
                total = "trece";
                break;
            case "14":
                total = "catorce";
                break;
            case "15":
                total = "quince";
                break;
            default:
                System.out.println(total);
        }
    }

    System.out.println("tu numero es " + total);
}