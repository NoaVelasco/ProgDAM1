/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author dam1
 */
public class Coche extends Vehiculo {
    private String color;
    private int anio;

    public Coche() {
    }

    public Coche(String color, int anio) {
        this.color = color;
        this.anio = anio;
    }

    public Coche(String color, int anio, String marca, String modelo, int potencia, double precio) {
        super(marca, modelo, potencia, precio);
        this.color = color;
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Coche: "
                + "marca=" + super.getMarca()
                + ", modelo=" + super.getModelo()
                + ", potencia=" + super.getPotencia()
                + ", precio=" + super.getPrecio()
                + " , color=" + color 
                + ", anio=" + anio + '.';
    }
    
    
    
}
