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
public class Comercial extends Empleado {

    double comision;

    public Comercial() {
    }

    public Comercial(double comision) {
        this.comision = comision;
    }

    public Comercial(double comision, String nombre, int edad, double salario, int anio) {
        super(nombre, edad, salario, anio);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void plus() {
        setAnioAct(Year.now().getValue());
        if (getAnioAct() - anio > 30 && comision > 200) {
            salario += PLUS;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comercial{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", anio de entrada=").append(anio);
        sb.append("comision=").append(comision);
        sb.append('}');
        return sb.toString();
    }

}
