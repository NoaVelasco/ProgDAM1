/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Random;

/**
 *
 * @author dam1
 */
public class Password {

    final int LONG_DEF = 8;
    int longitud;
    String contrasena;

    public static String generarPassword(int longitud) {
        Random rander = new Random();
        char[] pass = new char[longitud];
//        33-168
        for (int i = 0; i < longitud; i++) {
//            pass[i] = (char) ((Math.random() * 122) + 33);
            pass[i] = (char) (rander.nextInt('!', 'z'));
        }
        return new String(pass);
    }

    public void generarPassFuerte(int longitud) {
        Random rander = new Random();
        if (longitud < 11) {
            longitud = 11;
        }
        char[] pass = new char[longitud];
//        33-168
        for (int i = 0; i < longitud; i++) {
            if (i < 6) {
                pass[i] = (char) (rander.nextInt('0', '9'));
            } else if (i < 9) {
                pass[i] = (char) (rander.nextInt('A', 'Z'));
            } else if (i < 11) {
                pass[i] = (char) (rander.nextInt('a', 'z'));

            } else {
                pass[i] = (char) (rander.nextInt('!', 'z'));
            }

        }
        this.contrasena = new String(pass);
    }

    public boolean esFuerte(String pass) {
//        String regex = ""
        int num = 0, min = 0, may = 0;
        for (int i = 0; i < pass.length(); i++) {
            char iChar = pass.charAt(i);
//            if (iChar >= '0' && iChar <= '9') {
            if (Character.isDigit(iChar)) {
                num++;
            }
//            if (iChar >= 'a' && iChar <= 'z') {
            if (Character.isLowerCase(iChar)) {
                min++;
            }
//            if (iChar >= 'A' && iChar <= 'Z') {
            if (Character.isUpperCase(iChar)) {
                may++;
            }
        }
        return may > 2 && min > 1 && num > 5;
    }

    public Password() {
        this.longitud = LONG_DEF;
        this.contrasena = generarPassword(LONG_DEF);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword(longitud);
    }

}
