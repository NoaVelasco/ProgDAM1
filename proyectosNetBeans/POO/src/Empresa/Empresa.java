/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empresa;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        Plantilla p = new Plantilla();
        System.out.print("Ingrese el numero de empleados que desea contratar: ");
        p.contrata(sc.nextInt());

    }
    
}
