/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Administrador
 */
public class Persona implements Jugar{
    public String nombre;
    public enum Estado{pesimo,medio,atope};
    
    public Estado estado;

    public Persona(String nombre, Estado estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    
    

    @Override
    public boolean PuedeJugar() {
        if(this.estado == Estado.atope){
            return true;
        }else
            return false;
    }
    
    
    
}
