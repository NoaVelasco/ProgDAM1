/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class pruebaPractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat enEuros = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);
        double precioSeg;
        double descuento = 1.00;
        double precioTot;

        System.out.print("Bienvenido. Introduce el precio de la compra: ");
        double precioComp = input.nextDouble();
        System.out.print("Ahora introduce el metodo de pago (efectivo / tarjeta): ");
        String metodoPago = input.next().toLowerCase();
        System.out.print("Eres socio (si / no)?: ");
        String socioStr = input.next().toLowerCase();
        System.out.print("Es posible que tengas un descuento especial. Que dia de la semana es hoy?: ");
        String diaSemana = input.next().toLowerCase();

        if (precioComp > 500) {
            descuento = descuento - 0.03;
        }

        if (metodoPago.equals("tarjeta")) {
            descuento = descuento - 0.07;
        } else if (metodoPago.equals("efectivo")) {
            descuento = descuento - 0.12;  
        }

        if (socioStr.equals("si") || socioStr.equals("sí")) {
            descuento = descuento - 0.02;
        }

        if (diaSemana.equals("lunes")) {
            descuento = descuento - 0.08;
        }

        precioTot = precioComp * descuento;

        System.out.print("Estamos locos! Mas descuentos! Has comprado mas de una unidad (si / no)?: ");
        String numProds = input.next().toLowerCase();

        if (numProds.equals("si") || numProds.equals("sí")) {
            System.out.print("Eso esta muy bien. Vamos a rebajarlo. Cuanto cuesta?: ");
            precioSeg = input.nextDouble() / 2;
            System.out.println("Vale, pues ahora te cuesta solo " + enEuros.format(precioSeg) + " euros!");
            precioTot = (precioTot - precioSeg);
        }

        System.out.println("El precio total es de " + enEuros.format(precioTot) + " euros.");

    }

}
