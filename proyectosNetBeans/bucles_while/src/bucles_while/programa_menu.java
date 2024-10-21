/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_while;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class programa_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        int numInicio;
        int numFinal;
        int suma;
        int ano;
        int mes;
        int dia;
        int anoChino;
        do {
            switch (opcion) {
                case 0:
                    System.out.println("MENU PRINCIPAL \nElige una de las siguientes opciones (1-4): ");
                    System.out.println("1: Sumatorio");
                    System.out.println("2: Tu edad");
                    System.out.println("3: Tu horoscopo");
                    System.out.println("4: Salir");
                    opcion = input.nextInt();
                    break;
                case 1:
                    System.out.println("\nSUMATORIO");
                    System.out.print("Introduce el primer numero (punto de partida): ");
                    numInicio = input.nextInt();
                    System.out.print("Introduce el segundo numero (final): ");
                    numFinal = input.nextInt();
                    suma = numInicio;
                    System.out.print(numInicio);
                    for (numInicio++; numInicio <= numFinal; numInicio++) {
                        suma += numInicio;
                        System.out.print(" + " + numInicio);
                    }
                    System.out.println(" = " + suma + "\n");
                    opcion = 0;
                    break;
                case 2:

                    System.out.println("\nEDAD");
//                    System.out.print("Dime tu dia de nacimiento: ");
//                    dia = input.nextInt();
//                    System.out.print("Dime tu mes de nacimiento: ");
//                    mes = input.nextInt();
//                    System.out.print("Dime tu ano de nacimiento: ");
//                    ano = input.nextInt();

                    System.out.println("Dime tu fecha de nacimiento ('dd mm aa'): ");
                    dia = Integer.parseInt(input.next());
                    mes = Integer.parseInt(input.next());
                    ano = Integer.parseInt(input.next());

                    LocalDate hoy = LocalDate.now();

                    int diaHoy = hoy.getDayOfMonth();
                    int mesHoy = hoy.getMonthValue();
                    int anoHoy = hoy.getYear();

                    dia = diaHoy - dia;
                    if (dia < 0) {
                        mes++;
                    }
                        dia = (dia % 30 + 30) %30;

                    mes = mesHoy - mes;
                    if (mes < 0) {
                        ano++;
                    }
                        mes = (mes % 12 + 12) % 12;

                    ano = anoHoy - ano;

                    System.out.println("Tienes " + ano + " anos, " + mes + " meses y " + dia + " dias.");

                    opcion = 0;
                    break;

                case 3:
                    System.out.println("\nHOROSCOPO CHINO");
                    System.out.print("Dime un ano: ");
                    anoChino = input.nextInt();
                    System.out.print("WOW, ese fue el ano de");
                    switch (anoChino % 12) {
                        case 0:
                            System.out.println("l mono!");
                            break;
                        case 1:
                            System.out.println("l gallo!");
                            break;
                        case 2:
                            System.out.println("l perro!");
                            break;
                        case 3:
                            System.out.println("l cerdo!");
                            break;
                        case 4:
                            System.out.println(" la rata!");
                            break;
                        case 5:
                            System.out.println("l buey!");
                            break;
                        case 6:
                            System.out.println("l tigre!");
                            break;
                        case 7:
                            System.out.println("l conejo!");
                            break;
                        case 8:
                            System.out.println("l dragon!");
                            break;
                        case 9:
                            System.out.println(" la serpiente!");
                            break;
                        case 10:
                            System.out.println("l caballo!");
                            break;
                        case 11:
                            System.out.println(" la cabra!");
                            break;
                        default:
                            System.out.println("Este ano no existe lol");
                    }
                    opcion = 0;
                    break;
                case 4:
                    opcion = 4;
                default:
                    System.err.println("Algo ha salido mal. Vuelve a probar.");
            }

        } while (opcion != 4);
        System.out.println("Bienvenido");
    }

}
