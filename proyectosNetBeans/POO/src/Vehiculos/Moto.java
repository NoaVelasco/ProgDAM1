/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author dam1
 */
public class Moto extends Vehiculo {

    private int cilindrada;
    private double peso;

    public Moto() {
    }

    public Moto(int cilindrada, double peso) {
        this.cilindrada = cilindrada;
        this.peso = peso;
    }

    public Moto(int cilindrada, double peso, String marca, String modelo, int potencia, double precio) {
        super(marca, modelo, potencia, precio);
        this.cilindrada = cilindrada;
        this.peso = peso;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Moto: "
                + "marca=" + super.getMarca()
                + ", modelo=" + super.getModelo()
                + ", potencia=" + super.getPotencia()
                + ", precio=" + super.getPrecio()
                + "cilindrada=" + cilindrada
                + ", peso=" + peso + '.';
    }

}
