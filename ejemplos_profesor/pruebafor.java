
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
public class pruebafor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        for (int j = 1; j <= numero; j++) {
            boolean esPrimo = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    esPrimo = false;
                }
                
            }
            if(esPrimo==true){
                System.out.println(j);
            }
        }

        */
       System.out.println("Introduce una cadena");
       String cadena = scanner.nextLine();
       cadena = cadena.replace(" ","").toUpperCase();
       String inverso="";
       for(int i = cadena.length()-1; i>=0;i--){
           inverso = inverso+cadena.charAt(i);
       }
       
       if(cadena.equals(inverso)){
           System.out.println("Es palindromo");
       }else{
           System.out.println("No es palindromo");
       }
       
       
    }
}
