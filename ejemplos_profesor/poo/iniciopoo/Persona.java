/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciopoo;

/**
 *
 * @author ds098
 */
public class Persona {
    
    String nombre;
    String apellidos;
    int edad;
    int peso;
    
    Direccion[] direccion;
    
   
    

    public Persona() {
    }
    
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, int edad, int peso, Direccion[] direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.direccion = direccion;
    }

  

   

  
      
    
}
