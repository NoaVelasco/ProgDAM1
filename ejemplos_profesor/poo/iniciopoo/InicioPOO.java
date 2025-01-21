/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iniciopoo;

import java.util.Scanner;

/**
 *
 * @author ds098
 */
public class InicioPOO {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Persona persona1 = new Persona();
        
        persona1.nombre = "Carlos";
        
        System.out.println("Eres " + persona1.nombre + " " + persona1.apellidos);
        
        
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        System.out.println("Apellidos: ");
        String apellidos = teclado.nextLine();
        apellidos = teclado.nextLine();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        System.out.println("Peso: ");
        int peso = teclado.nextInt();
        System.out.println("Calle: ");
        String calle = teclado.next();
        System.out.println("Numero: ");
        int numero = teclado.nextInt();
        System.out.println("Ciudad: ");
        String ciudad = teclado.nextLine();
        ciudad = teclado.nextLine();
        int cp = teclado.nextInt();
        
        System.out.println("Calle: ");
        String calle2 = teclado.next();
        System.out.println("Numero: ");
        int numero2 = teclado.nextInt();
        System.out.println("Ciudad: ");
        String ciudad2 = teclado.nextLine();
        ciudad = teclado.nextLine();
        System.out.println("CP:");
        int cp2 = teclado.nextInt();
        
               
        Direccion[] direcciones = new Direccion[2];
        Direccion direccion = new Direccion(calle, numero, ciudad, cp);
        Direccion direccion2 = new Direccion(calle2, numero2, ciudad2, cp2);
        Direccion direccion3 = new Direccion();
        direcciones[0]=direccion;
        direcciones[1]=direccion3;
        Persona persona2 = new Persona(nombre, apellidos, edad, peso, direcciones);
        
        System.out.println(persona2.nombre + " " + persona2.apellidos + persona2.edad + persona2.peso
        + direccion.calle + direccion.numero + direccion.ciudad + direccion.cp+ " en verano vive en " +direccion3.calle + direccion3.numero + direccion3.ciudad + direccion3.cp);
        
    }
    
}
