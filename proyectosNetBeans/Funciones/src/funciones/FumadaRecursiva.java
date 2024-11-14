/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dam1
 */
public class FumadaRecursiva {

//    static Scanner sc = new Scanner(System.in);
    public static double Fumada(String operaciones) {
//        Pattern operadores = Pattern.compile("[\\-\\+\\*\\/\\%]");
//        Matcher matcher = operadores.matcher(operaciones);
        String falsoNum = "";
        String resto;
//        if (matcher.find()) {
        if (operaciones.matches(".*[+\\-*/%].*")) {
            for (int i = operaciones.length()-1; i >= 0; i--) {
                char caracter = operaciones.charAt(i);
                if (caracter <= '9' && caracter >= '0') {
                    falsoNum = caracter + falsoNum;
                } else {
                    resto = operaciones.substring(0, i);
                    int num = Integer.parseInt(falsoNum);
                    switch (caracter) {
                        case '/':
                            return  (Fumada(resto) / num);
                        case '*':
                            return  (Fumada(resto) * num);
                        case '%':
                            return  (Fumada(resto) % num);
                        case '-':
                            return  (Fumada(resto) - num);
                        case '+':
                            return  (Fumada(resto) + num);
                    }
                }
            }
        }
        return Double.parseDouble(operaciones);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Fumada("62+99/21%11-73"));
        System.out.println(Fumada("73/45/2*5-10+25%3"));
    }

}
