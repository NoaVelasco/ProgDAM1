/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author dam1
 */
public class Profesor extends Persona {
    String asignatura; 
    double sueldo;

    public Profesor() {
    }

    public Profesor(String asignatura, double sueldo, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.asignatura = asignatura;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "asignatura=" + asignatura + ", sueldo=" + sueldo + ", nombre=" + super.toString() + '}';
    }
    
    
    
}
