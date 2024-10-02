/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_profesor;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduce tu nota");
        String nota = teclado.next();
        char primero = nota.charAt(2);
        if (primero < 'c'){ 
            System.out.println("Es o a o b");
         
        }else{ 
         System.out.println("El alumno " + nombre + " esta aprobado ");
        }    
        
    }
}
