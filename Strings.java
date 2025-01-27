/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Arrays;

/**
 *
 * @author noave
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // puedo convertir las letras en su valor numérico ASCII:
        char aChar = 'a';
        String aStr = "a";

        System.out.println((int) aChar);
        System.out.println((int) aStr.charAt(0));
        System.out.println(aStr.codePointAt(0));

        // puedo convertir un array de characteres en un string
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);

        // y un string en un array de bytes (valores numéricos)
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        // de hecho, puedo imprimir directamente un array de chars como un string
        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);

        char[][] matriz = new char[3][6];
        for (char[] matriz1 : matriz) {
            Arrays.fill(matriz1, '~');
        }
        for (char[] matriz1 : matriz) {
            System.out.println(matriz1);
        }
         */

        String regex = "mundo";
        String hola = "hola Mundo";
        System.out.println(hola.regionMatches(true, 5, regex, 0, 5));

        String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
        String regex2 = "((?i)cat)";
        System.out.println(myStr.replace(regex2, "$1dog"));

    }

}
