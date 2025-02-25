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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona pedro = new Persona("Pedro",Persona.Estado.medio);
       
       if(pedro.PuedeJugar()){
           System.out.println("Es un cohete");
       }else
           System.out.println("Es un paquete");
    }
    
}
