package ExamenElectro;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);
        
        electrodomesticos.add(new Lavadora(200, 30, "rojo", 'A', 40));
        electrodomesticos.add(new Lavadora(150, 20, "azul", 'B', 25));
        electrodomesticos.add(new Lavadora(300, 50, "negro", 'C', 35));
        electrodomesticos.add(new Lavadora(100, 10, "gris", 'D', 15));
        electrodomesticos.add(new Lavadora(250, 40, "blanco", 'E', 45));
        
        electrodomesticos.add(new Television(500, 10, "negro", 'A', 42, true));
        electrodomesticos.add(new Television(400, 8, "blanco", 'B', 32, false));
        electrodomesticos.add(new Television(600, 12, "gris", 'C', 50, true));
        electrodomesticos.add(new Television(350, 7, "rojo", 'D', 28, false));
        electrodomesticos.add(new Television(450, 9, "azul", 'E', 40, true));

        System.out.println("Calculando precio final...");
        for (Electrodomestico e: electrodomesticos) e.precioFinal();

        System.out.println("Precio de las televisiones");
        for (Electrodomestico e: electrodomesticos) {
            if (e instanceof Television) System.out.println(e.getPrecio() + " €");
        }
        System.out.println("Precio de las lavadoras");
        for (Electrodomestico e: electrodomesticos) {
            if (e instanceof Lavadora) System.out.println(e.getPrecio() + " €");
        }

        Collections.sort(electrodomesticos);

        System.out.println("Sección de ofertas:");
        System.out.println("Mejores ofertas de Lavadoras:");
        int count = 0;
        for (Electrodomestico e : electrodomesticos) {
            if (e instanceof Lavadora) {
                System.out.println(e.getPrecio() + " €");
                if (++count == 2) break;
            }
        }

        System.out.println("Mejores ofertas de Televisiones:");
        count = 0;
        for (Electrodomestico e : electrodomesticos) {
            if (e instanceof Television) {
                System.out.println(e.getPrecio() + " €");
                if (++count == 2) break;
            }
        }

        System.out.println("Lo he leído 20 veces y no entiendo el enunciado");
    }
}
