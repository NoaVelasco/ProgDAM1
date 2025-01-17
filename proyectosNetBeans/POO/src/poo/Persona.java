/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author dam1
 */
public class Persona {

    String nombre;
    String apellidos;
    String dirCalle;
    String dirNum;
    String dirCiudad;
    String[] direccion;
    byte edad;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, byte edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(String nombre, String apellidos, String dirCalle, String dirNum, String dirCiudad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirCalle = dirCalle;
        this.dirCiudad = dirCiudad;
        this.direccion = dondeVive(dirCalle, dirNum, dirCiudad);
    }

    public Persona(String nombre, String apellidos, String dirCalle, String dirNum, String dirCiudad, byte edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirCalle = dirCalle;
        this.dirNum = dirNum;
        this.dirCiudad = dirCiudad;
        this.direccion = dondeVive(dirCalle, dirNum, dirCiudad);
        this.edad = edad;
    }

    public static String[] dondeVive(String dirCalle, String dirNum, String dirCiudad) {
        String[] dir = {dirCalle, dirNum, dirCiudad};
        return dir;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos 
                + ", direccion=" + direccion[0] + " , num " + direccion[1] + " de la localidad " + direccion[2] 
                + ", edad=" + edad + '}';
    }

}
