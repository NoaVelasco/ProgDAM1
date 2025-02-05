/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

//import java.util.Scanner;
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
//        Dni nif1 = new Dni();
//        nif1.leer();
//        System.out.println(nif1.toString());
//        Dni nif2 = new Dni(12345678);
//        System.out.println(nif2.toString());
        /*
        Cafetera italiana = new Cafetera();
        Cafetera electrica = new Cafetera(1500);
        Cafetera puchero = new Cafetera(600, 50);
        
        // ----------------- ITALIANA
        System.out.println(italiana.getCapacidadActual());
        System.out.println(italiana.getCapacidadMaxima());
        italiana.servirTaza(150);
        System.out.println(italiana.getCapacidadActual());
        italiana.agregarCafe(400);
        System.out.println(italiana.getCapacidadActual());
        italiana.vaciarCafetera();
        System.out.println(italiana.getCapacidadActual());
        italiana.llenarCafetera();
        System.out.println(italiana.getCapacidadActual());
        
        // ----------------- ELECTRICA
        System.out.println(electrica.getCapacidadActual());
        System.out.println(electrica.getCapacidadMaxima());
        electrica.servirTaza(150);
        System.out.println(electrica.getCapacidadActual());
        electrica.agregarCafe(400);
        System.out.println(electrica.getCapacidadActual());
        electrica.vaciarCafetera();
        System.out.println(electrica.getCapacidadActual());
        electrica.llenarCafetera();
        System.out.println(electrica.getCapacidadActual());
        
        // ----------------- PUCHERO
        System.out.println(puchero.getCapacidadActual());
        System.out.println(puchero.getCapacidadMaxima());
        puchero.servirTaza(150);
        System.out.println(puchero.getCapacidadActual());
        puchero.agregarCafe(400);
        System.out.println(puchero.getCapacidadActual());
        puchero.vaciarCafetera();
        System.out.println(puchero.getCapacidadActual());
        puchero.llenarCafetera();
        System.out.println(puchero.getCapacidadActual());
         */

        /*
        Electrodomestico lavadora = new Electrodomestico();
        Electrodomestico tostadora = new Electrodomestico(50, 4.00);
        Electrodomestico lavavajillas = new Electrodomestico(200, 6, "azul", 'B');
        Electrodomestico horno = new Electrodomestico(300, 10, "fucsia", 'G');
        
        System.out.println(lavadora.toString());
        System.out.println(tostadora.toString());
        System.out.println(lavavajillas.toString());
        System.out.println(horno.toString());
 
        lavadora.precioFinal(lavadora.getPrecioBase());
        tostadora.precioFinal(tostadora.getPrecioBase());
        lavavajillas.precioFinal(lavavajillas.getPrecioBase());
        horno.precioFinal(horno.getPrecioBase());
        
        System.out.println(lavadora.toString());
        System.out.println(tostadora.toString());
        System.out.println(lavavajillas.toString());
        System.out.println(horno.toString());
        */
        
        Password pass1 = new Password();
        Password pass2 = new Password(32);
        
        System.out.println(pass1.contrasena + pass1.esFuerte(pass1.contrasena));
        System.out.println(pass2.contrasena + pass2.esFuerte(pass2.contrasena));
        
        pass1.longitud = 30;
        pass1.generarPassFuerte(pass1.longitud);
        System.out.println(pass1.contrasena + pass1.esFuerte(pass1.contrasena));
        
        
    }
}
