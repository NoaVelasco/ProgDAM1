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

    private void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        String opciones = "ABCDEF";
        if (opciones.indexOf(letra) > -1) {
            this.consumoEnerg = letra;
        } else {
            this.consumoEnerg = 'F';
        }
//        if (letra > 64 && letra < 71) {
//            this.consumoEnerg = letra;
//        }
    }

    private void comprobarColor(String color) {
        boolean contains = false;
        for (String colorDisponible : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                contains = true;
            }
        }
        if (contains) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }
    
    public void precioFinal(double precio){
        
    }

    public Electrodomestico() {
        this.precioBase = 100;
        this.peso = 5;
        this.color = "blanco";
        this.consumoEnerg = 'F';
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnerg = 'F';
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnerg) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        comprobarConsumoEnergetico(consumoEnerg);
        comprobarColor(color);
    }

}
