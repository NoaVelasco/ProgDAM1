/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionarioscarlatti;

/**
 *
 * @author dam1
 */
public class Coches {
    String marca;
    String modelo;
    String color;
    String matricula;

    public Coches(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coches{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula + '}';
    }

 

    
    
}
