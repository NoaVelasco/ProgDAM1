/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raices;

/**
 *
 * @author dam1
 */
public class Alumno {
    public String nombre, apellido;
    public boolean retraso, injustificada, justificada;

    public Alumno() {
    }

    
    public Alumno(String nombre, String apellido, boolean retraso, boolean injustificada, boolean justificada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.retraso = retraso;
        this.injustificada = injustificada;
        this.justificada = justificada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isRetraso() {
        return retraso;
    }

    public void setRetraso(boolean retraso) {
        this.retraso = retraso;
    }

    public boolean isInjustificada() {
        return injustificada;
    }

    public void setInjustificada(boolean injustificada) {
        this.injustificada = injustificada;
    }

    public boolean isJustificada() {
        return justificada;
    }

    public void setJustificada(boolean justificada) {
        this.justificada = justificada;
    }

    @Override
    public String toString() {
        String output = "Alumno: " + nombre + " " + apellido; 
        if (retraso) {
            output += " " + retraso;
        } else if (injustificada) {
            output += " " + injustificada;
        } else if (justificada) {
            output += " " + justificada;           
        }
        return output;
    }
    
    
    
    
}
