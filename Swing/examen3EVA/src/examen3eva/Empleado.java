/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3eva;

import java.util.Objects;

/**
 *
 * @author dam1
 */
public class Empleado {

    String dni;
    String nombre;
    String ape;
    int anio;
    Double fijo;
    Double factura;
    Double porcentaje;

    Double total;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String ape, int anio, Double fijo, Double factura, Double porcentaje) {
        this.dni = dni;
        this.nombre = nombre;
        this.ape = ape;
        this.anio = anio;
        this.fijo = fijo;
        this.factura = factura;
        this.porcentaje = porcentaje;

        this.total = 0.0;
    }

    public void calcTotal() {
        this.total = fijo + factura * porcentaje * 0.01;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Double getFijo() {
        return fijo;
    }

    public void setFijo(Double fijo) {
        this.fijo = fijo;
    }

    public Double getFactura() {
        return factura;
    }

    public void setFactura(Double factura) {
        this.factura = factura;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.anio != other.anio) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.total, other.total);
    }

    @Override
    public String toString() {
        return "Empleado: " + "dni=" + dni + ", nombre=" + nombre + ", ape=" + ape + ", anio=" + anio + ", fijo=" + fijo + ", factura=" + factura + ", porcentaje=" + porcentaje + ", total=" + total;
    }

}
