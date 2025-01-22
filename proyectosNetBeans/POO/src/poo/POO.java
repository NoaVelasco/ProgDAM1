/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Persona0 Rodolfo = new Persona0("Rodolfo", "Cuenquisaurio", "Caramelos", 15, "Tarragona");
//        System.out.println(Rodolfo.toString());
//        
//        
//        Persona0 conPerro = new Persona0("tengo", "perro", new Perro("cani", "caniche", 12.2));
//        System.out.println(conPerro.perro.nombre);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nombre: ");
//        String nombre = sc.next();
//        System.out.println("Apellidos: ");
//        String apellidos = sc.nextLine();
//        apellidos = sc.nextLine();
//        System.out.println("Edad: ");
//        int edad = sc.nextInt();
//        System.out.println("Peso: ");
//        double peso = sc.nextDouble();
//        System.out.println("Altura: ");
//        double altura = sc.nextDouble();
//        System.out.println("Calle: ");
//        String calle = sc.next();
//        System.out.println("Numero: ");
//        int numero = sc.nextInt();
//        System.out.println("Ciudad: ");
//        String ciudad = sc.nextLine();
//        System.out.println("CP: ");
//        int cp = sc.nextInt();
//
//        System.out.println("Calle: ");
//        String calle2 = sc.next();
//        System.out.println("Numero: ");
//        int numero2 = sc.nextInt();
//        System.out.println("Ciudad: ");
//        String ciudad2 = sc.nextLine();
//        System.out.println("CP:");
//        int cp2 = sc.nextInt();
//
//        Direccion[] direcciones = new Direccion[2];
//        Direccion direccion = new Direccion(calle, numero, ciudad, cp);
//        Direccion direccion2 = new Direccion();
//        Direccion direccion3 = new Direccion(calle2, numero2, ciudad2, cp2);
//        direcciones[0] = direccion;
//        direcciones[1] = direccion3;
//
//        Persona rodolfo = new Persona(nombre, apellidos, edad, peso, altura, direcciones);
//        
//        System.out.println(rodolfo.toString());
        Dni nif1 = new Dni();
        nif1.leer();
        Dni nif2 = new Dni(12345678);
        System.out.println(nif1.toString());
        System.out.println(nif2.toString());
    }

}
