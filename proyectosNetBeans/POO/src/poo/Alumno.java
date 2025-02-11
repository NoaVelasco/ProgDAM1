/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author dam1
 */
public class Alumno extends Persona{
    
    int curso, nAsignaturas;

    public Alumno() {
    }

    public Alumno(int curso, int nAsignaturas, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.curso = curso;
        this.nAsignaturas = nAsignaturas;
    }

    public Alumno(int curso, int nAsignaturas, String nombre, String apellidos, int edad, double peso, double altura, Direccion[] direccion) {
        super(nombre, apellidos, edad, peso, altura, direccion);
        this.curso = curso;
        this.nAsignaturas = nAsignaturas;
    }
    
    
    
}
