/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Repaso {

    static int[][][] insti = new int[2][20][6];
    static Scanner sc = new Scanner(System.in);
    static int option = 1;

    static int[] seleccionar() {
        int[] valores = new int[3];

        System.out.println("Número de aula: ");
        valores[0] = sc.nextInt() - 11;
        System.out.println("Número de alumno: ");
        valores[1] = sc.nextInt();
        System.out.println("Número de asignatura: ");
        valores[2] = sc.nextInt();
        return valores;
    }

    static void editar() {
        int[] valores = seleccionar();
        System.out.println("Introduce la nota: ");
        int asignatura = sc.nextInt();
        insti[valores[0]][valores[1]][valores[2]] = asignatura;
    }

    static void leer(){
        int[] valores = seleccionar();
        System.out.println(insti[valores[0]][valores[1]][valores[2]]);
    }
    
    static void verTodo() {
        for (int[][] insti1 : insti) {
            System.out.println("aula:");
            for (int[] insti11 : insti1) {
                System.out.println("Alumno: ");
                for (int i = 0; i < insti11.length; i++) {
                    System.out.print(insti11[i] + " - ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    static void menu() {
        System.out.println("MENU:\n1.Introducir\n2.Leer\n3.Ver todo\n0.Salir");
        option = sc.nextInt();
        switch (option) {
            case 1 -> {
                editar();
            }
            case 2 -> {
                leer();
            }
            case 3 -> {
                verTodo();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (option != 0) {
            menu();
        }
    }

}
