/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author dam1
 */
public class Persona0 {

    String nombre;
    String apellidos;
    String dirCalle;
    int dirNum;
    String dirCiudad;
    String[] direccion;
    byte edad;

    Perro perro;
    
    public Persona0() {
    }

    public Persona0(String nombre) {
        this.nombre = nombre;
    }

    public Persona0(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona0(String nombre, String apellidos, byte edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona0(String nombre, String apellidos, String dirCalle, int dirNum, String dirCiudad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirCalle = dirCalle;
        this.dirNum = dirNum;
        this.dirCiudad = dirCiudad;
//        this.direccion = dondeVive(dirCalle, dirNum, dirCiudad);
    }

    public Persona0(String nombre, String apellidos,  byte edad, String dirCalle, int dirNum, String dirCiudad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dirCalle = dirCalle;
        this.dirNum = dirNum;
        this.dirCiudad = dirCiudad;
//        this.direccion = dondeVive(dirCalle, dirNum, dirCiudad);
    }

    public Persona0(String nombre, String apellidos, Perro perro) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.perro = perro;
    }

    
    
//    public static String[] dondeVive(String dirCalle, int dirNum, String dirCiudad) {
//        
//        String[] dir = {dirCalle, StringdirNum + "", dirCiudad};
//        return dir;
//    }

//    @Override
//    public String toString() {
//        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos 
//                + ", direccion=" + direccion[0] + " , num " + direccion[1] + " de la localidad " + direccion[2] 
//                + ", edad=" + edad + '}';
//    }
    
    @Override
    public String toString() {
        String output = "Persona{"
                + "nombre=" + this.nombre;
        if (!this.apellidos.isBlank()) {
                output += ", apellidos=" + this.apellidos;
        }
               
        if (this.edad > 0) {
                output += ", edad=" + this.edad;
        }
        
        if (!this.dirCalle.isBlank() && !this.dirCiudad.isBlank() && this.dirNum > 0) {
                output += "; vive en calle=" + this.dirCalle
                        + ", núm= " + this.dirNum
                        + ", ciudad= " + this.dirCiudad + "}";
        }
        
        return output;
    }

}
