/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author dam1
 */
public class Electrodomestico {

    double precioBase, peso;
    String color;
    char consumoEnerg;

    String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
    final double PRECIO_DEF = 100, PESO_DEF = 5;
    final String COLOR_DEF = "blanco";
    final char ENER_DEF = 'F';

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioFinal(precioBase);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnerg(char consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    
    
    
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        char output = letra >= 'A' && letra <= 'F' ? letra : 'F';

//        String opciones = "ABCDEF";
//        if (opciones.indexOf(letra) > -1) {
//            this.consumoEnerg = letra;
//        } else {
//            this.consumoEnerg = 'F';
//        }
//        if (letra >= 'A' && letra <= 'F') {
//            this.consumoEnerg = letra;
//        }
//        if (letra > 64 && letra < 71) {
//            this.consumoEnerg = letra;
//        }
        return output;
    }

    private String comprobarColor(String color) {
        for (String colorDisponible : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                return color;
            }
        }
        return COLOR_DEF;
    }

    public double precioFinal(double precio) {
        double aux1 = (this.peso - 5) * 1.1;
        double aux2 = (this.consumoEnerg - 'C') * 100;
        double aux3 = precio *= aux1;
        aux3  += aux2;
//        this.precioBase = aux3;
        return aux3;
    }

    public Electrodomestico() {
        this.precioBase = PRECIO_DEF;
        this.peso = PESO_DEF;
        this.color = COLOR_DEF;
        this.consumoEnerg = ENER_DEF;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumoEnerg = ENER_DEF;
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnerg) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnerg = comprobarConsumoEnergetico(consumoEnerg);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", peso=" + peso + ", color=" + color + ", consumoEnerg=" + consumoEnerg + '}';
    }

}
