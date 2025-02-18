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
public class Repartidor extends Empleado {

    String zona;

    public Repartidor() {
    }

    public Repartidor(String zona) {
        this.zona = zona;
    }

    public Repartidor(String zona, String nombre, int edad, double salario, int anio) {
        super(nombre, edad, salario, anio);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public boolean hasPlus() {
//        setAnioAct(Year.now().getValue());
        if (super.hasPlus() && edad < 25 && zona.equalsIgnoreCase("zona 3")) {
            return true;
        }
        return false;
    }

    @Override
    public void plus(){
        if(hasPlus()){
            salario += PLUS;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Repartidor{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", anio de entrada=").append(anio);
        sb.append("zona=").append(zona);
        sb.append('}');
        return sb.toString();
    }

}
