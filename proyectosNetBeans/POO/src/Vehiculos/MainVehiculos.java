/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author dam1
 */
public class MainVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche kart = new Coche("verde", 2020, "Mario", "Kart", 3000, 200.50);
        Coche heladero = new Coche("azul", 1999, "Seat", "Cutre", 10, 15.95);
        
        Moto minimoto = new Moto(10, 10, "Asesina", "Ruidosa", 20, 129.20);
        Moto motoBowser = new Moto(300, 100, "Bowser", "Destructora", 207, 329.20);
    
        Truck camion = new Truck(500, 8, "negro", 2017, "Volvo", "Pisahuevos", 200000, 20000);
        Truck locuron = new Truck(1500, 18, "fucsia", 2078, "Renault", "Futuro", 5600000, 10000000);
    
        
        System.out.println(kart.toString());
        System.out.println(heladero.toString());
        System.out.println(minimoto.toString());
        System.out.println(motoBowser.toString());
        System.out.println(camion.toString());
        System.out.println(locuron.toString());
        
    }
    
    
}
