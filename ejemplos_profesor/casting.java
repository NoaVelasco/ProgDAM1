/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_profesor;

import java.text.DecimalFormat;




/**
 *
 * @author Administrador
 */
public class casting {

   public static String entero1="8";
   public static String entero2="9";
   public static int numero = 3;
   public static int numero2 = 4;
     
   public static char letra = 'a';
   
   public static String cadena = "ioan tiene un 8 en programacion es false tiene un 8.4";
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println(entero1+entero2);
        System.out.println(Integer.parseInt(entero1)+Integer.parseInt(entero2));
        System.out.println(numero+numero2);
        System.out.println(Integer.toString(numero)+numero2);
        System.out.println(Character.toString(letra));
        char c = cadena.charAt(8);
        System.out.println(c);
    }
    
}