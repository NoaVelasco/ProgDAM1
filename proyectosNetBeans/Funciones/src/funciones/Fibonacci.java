/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static int Fibo(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return Fibo(num - 1) + Fibo(num - 2);
    }

    public static boolean Palindromo(String cadena, int principio, int fin) {
        if (principio >= fin) {
            return true;
        }
        if (cadena.charAt(principio)!=cadena.charAt(fin)) {
            return false;
        }
        return Palindromo(cadena, principio+1, fin-1);
    }
    
    public static void main(String[] args) {
        
        System.out.print("Di una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        cadena = cadena.replace(" ", "");
        boolean palindromo = Palindromo(cadena, 0, cadena.length()-1);
        if (palindromo) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        
        System.out.print("Cuantos numeros para Fibonacci? ");
        int ciclos = sc.nextInt();
        for (int i = 0; i < ciclos; i++) {
            
        System.out.print(Fibo(i) + " ");
        }
    }

}
