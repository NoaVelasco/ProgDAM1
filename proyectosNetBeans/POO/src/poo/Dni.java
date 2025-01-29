/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Dni {

    private long numero;
    private char letra;
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public void leer() {
        System.out.println("Introduce el número: ");
        this.numero = new Scanner(System.in).nextLong();
        this.letra = generarLetra(this.numero);
    }

    private char generarLetra(long num) {
        return LETRAS.charAt((int) (num % 23));
    }

    public Dni() {
        this.letra = ' ';
        this.numero = 0;
    }

    public Dni(long numero) {
        this.numero = numero;
        this.letra = generarLetra(this.numero);
    }

    public long getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setNumero(long numero) {
        this.numero = numero;
        this.letra = generarLetra(this.numero);
    }

    @Override
    public String toString() {
        return this.numero + "-" + this.letra;
    }

}
