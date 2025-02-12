/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author dam1
 */
public class Truck extends Coche {

    private double peso;
    private int ruedas;

    public Truck() {
    }

    public Truck(double peso, int ruedas) {
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public Truck(double peso, int ruedas, String color, int anio) {
        super(color, anio);
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public Truck(double peso, int ruedas, String color, int anio, String marca, String modelo, int potencia, double precio) {
        super(color, anio, marca, modelo, potencia, precio);
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Truck: "
                + "marca=" + super.getMarca()
                + ", modelo=" + super.getModelo()
                + ", potencia=" + super.getPotencia()
                + ", precio=" + super.getPrecio()
                + " , color=" + super.getColor()
                + ", anio=" + super.getAnio() 
                + ", peso=" + peso
                + ", ruedas=" + ruedas + '.';
    }

}
