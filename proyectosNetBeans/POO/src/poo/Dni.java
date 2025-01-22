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
    int numero;
    char letra;
    Scanner sc = new Scanner(System.in);
    
    public Dni() {
        this.letra = ' ';
        this.numero = 0;
    }

    public Dni(int numero) {
        this.numero = numero;
        auxiliar();
    }
    
    public void leer(){
        System.out.println("Introduce el número: ");
        this.numero = sc.nextInt();
        auxiliar();
    }
    
    private void auxiliar(){
        switch (this.numero % 23) {
            case 0 -> this.letra = 'T';
            case 1 -> this.letra = 'R';
            case 2 -> this.letra = 'W';
            case 3 -> this.letra = 'A';
            case 4 -> this.letra = 'G';
            case 5 -> this.letra = 'M';
            case 6 -> this.letra = 'Y';
            case 7 -> this.letra = 'F';
            case 8 -> this.letra = 'P';
            case 9 -> this.letra = 'D';
            case 10 -> this.letra = 'X';
            case 11 -> this.letra = 'B';
            case 12 -> this.letra = 'N';
            case 13 -> this.letra = 'J';
            case 14 -> this.letra = 'Z';
            case 15 -> this.letra = 'S';
            case 16 -> this.letra = 'Q';
            case 17 -> this.letra = 'V';
            case 18 -> this.letra = 'H';
            case 19 -> this.letra = 'L';
            case 20 -> this.letra = 'C';
            case 21 -> this.letra = 'K';
            case 22 -> this.letra = 'E';
            default -> throw new IllegalArgumentException("Número no válido");
        }
    }

    @Override
    public String toString() {
        return  this.numero + "-" + this.letra;
    }
    
    
    
}
