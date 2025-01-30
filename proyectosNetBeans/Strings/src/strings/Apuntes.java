/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

import java.util.Arrays;

/**
 *
 * @author dam1
 */
public class Apuntes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String c = ">> Puedo convertir las letras en su valor numérico ASCII:";
        System.out.println(c);
        char aChar = 'a';
        String aStr = "a";

        System.out.println(">> aChar = 'a'");
        System.out.println(">> aStr = \"a\"");
        System.out.println((int) aChar + " :: (int) aChar");
        System.out.println((int) aStr.charAt(0) + " :: (int) aStr.charAt(0)");
        System.out.println(aStr.codePointAt(0) + " :: aStr.codePointAt(0)");

        c = "\n>> Si el carácter es un dígito, no me da su valor numérico real\n>> digitChar = '6'";
        System.out.println(c);
        char digitChar = '6';
        System.out.println((int) digitChar + " :: (int) digitChar");
        System.out.println(">> Habría que restar por '0' o usar un método de Character");
        System.out.println(digitChar - '0' + " :: digitChar - '0'");
        System.out.println(Character.getNumericValue(digitChar) + " :: Character.getNumericValue(digitChar)");

        c = "\n>> Puedo convertir un array de characteres en un string";
        System.out.println(c);
        System.out.println(">> char data[] = {'a', 'b', 'c'}\n>> String str = new String(data)");
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);

        c = """
           
        >> De hecho, puedo imprimir directamente un array de chars como un string
           siempre y cuando no se concatene con otro string.
        >> myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}""";
        System.out.println(c);
        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);

        c = ">> Aquí imprimo una matriz fila a fila:";
        System.out.println(c);
        char[][] matriz = new char[3][6];
        for (char[] matriz1 : matriz) {
            Arrays.fill(matriz1, '~');
        }
        for (char[] matriz1 : matriz) {
            System.out.println(matriz1);
        }

        c = """

        >> Y al revés, convertir un string en un array de bytes (valores numéricos)
                byte[] bytes = str.getBytes();  // str == "abc"
                System.out.println(Arrays.toString(bytes));""";
        System.out.println(c);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        c = """
          
          >> Saber si hay un caracter en un String:
                aChar = 'a'
                aStr = "a"
                str.indexOf(aChar) != -1  // boolean
                str.contains(aStr)  // boolean""";
        System.out.println(c);
        System.out.println(str.indexOf(aChar) != -1);
        System.out.println(str.contains(aStr));
        c = """
          >> Saber si hay un caracter en un ARRAY de caracteres:
                myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}
                new String(myArray).indexOf(aChar) != -1  // boolean
                new String(myArray).contains(aStr)  // boolean""";
        System.out.println(c);
        System.out.println(new String(myArray).indexOf(aChar) != -1);
        System.out.println(new String(myArray).contains(aStr));

        c = """
            
          >> Saber si hay una cadena en un lugar concreto:
                String regex = "mundo";
                String hola = "hola Mundo";
                System.out.println(hola.regionMatches(true, 5, regex, 0, 5));""";
        System.out.println(c);
        String regex = "mundo";
        String hola = "hola Mundo";
        System.out.println(hola.regionMatches(true, 5, regex, 0, 5));
        System.out.println("""
            >> Aunque si no necesitas regex, puede hacerse así:
                System.out.println(regex.equalsIgnoreCase(hola.substring(5, 5+5)));""");
        System.out.println(regex.equalsIgnoreCase(hola.substring(5, 5 + 5)));

        System.out.println("""
                           
            >> REEMPLAZAR
            >> La diferencia entre replace y replaceAll es que la segunda admite regex.
                    String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
                    String regex2 = "((?i)cat)";
            >> replace no encontraría coincidencias con "((?i)cat)".
            >> replaceAll lo interpreta como "cat" con [ignorecase].
                    System.out.println(myStr.replaceAll(regex2, "dog"));""");
        String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
        String regex2 = "((?i)cat)";
        System.out.println(myStr.replaceAll(regex2, "dog"));

        System.out.println("""
                           
            >> FORMAT
            >> Prefiero usar System.out.printf()
                 double precio = 5.15;
                 System.out.printf("%.2f", precio);""");

        double precio = 5.15678;
        System.out.printf("%.2f %n", precio);

        System.out.println("""
                           
            >> isEmpty() / isBlank()
            >> El primero devuelve true si está vacío.
            >> El segundo devuelve true si está vacío o solo contiene blancos.
                 String vacio = "";
                 String blanco = " ";
                 System.out.println(vacio.isEmpty());
                 System.out.println(vacio.isBlank());
                 System.out.println(blanco.isEmpty());
                 System.out.println(blanco.isBlank());""");
        String vacio = "";
        String blanco = " ";
        System.out.println(vacio.isEmpty());
        System.out.println(vacio.isBlank());
        System.out.println(blanco.isEmpty());
        System.out.println(blanco.isBlank());
    }

}
