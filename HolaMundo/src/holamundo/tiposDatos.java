/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class tiposDatos {

//    static String carac = "as";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(carac.charAt(0));

        Scanner teclado = new Scanner(System.in);
        
//        System.out.println("Introduce un número: ");
//        int numero = teclado.nextInt();
//        System.out.println(numero);
//        
        System.out.println("introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println(nombre);
    }

}
