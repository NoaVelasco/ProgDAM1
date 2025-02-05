/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeo;

/**
 *
 * @author dam1
 */
public class text3 {

    public static String generarPassword(int longitud) {
        char[] pass = new char[longitud];
//        33-168
        for (int i = 0; i < longitud; i++) {
            pass[i] = (char) 97;
//            pass[i] = (char) ((Math.random() * 168) + 33);
        }
        return new String(pass);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(generarPassword(30));
    }

}
