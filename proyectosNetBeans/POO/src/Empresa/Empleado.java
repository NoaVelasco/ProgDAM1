/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.time.Year;

/**
 *
 * @author dam1
 */
public abstract class Empleado {

    String nombre;
    int edad, anio;
    double salario;
    final int PLUS = 300;
    private int anioAct;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario, int anio) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.anio = anio;
    }

    public boolean hasPlus() {
        anioAct = Year.now().getValue();
        return anioAct - anio >= 5;
    }

    public void plus(){
        if(hasPlus()){
            salario += PLUS;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnioAct() {
        return anioAct;
    }

    public void setAnioAct(int anioAct) {
        this.anioAct = anioAct;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", anio de entrada=").append(anio);
        sb.append('}');
        return sb.toString();
    }

}
