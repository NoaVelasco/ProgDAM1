/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPooAvanzado;

import java.util.Random;

/**
 *
 * @author dam1
 */
public class Metodos {
    public static  String genString(int longitud) {
        Random rander = new Random();
        char[] pass = new char[longitud];
//        33-168
        for (int i = 0; i < longitud; i++) {
//            pass[i] = (char) ((Math.random() * 122) + 33);
            pass[i] = (char) (rander.nextInt('a', 'z'));
        }
        return new String(pass);
    }
}
