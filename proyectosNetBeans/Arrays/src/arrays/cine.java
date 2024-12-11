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
public class cine {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static int option = 1;
    static String[][] room1 = new String[10][10];
    static String[][] room2 = new String[10][10];
    static String[][] room3 = new String[10][10];

    static String menuStr = """
            +------------------+
            |       CINE       |
            +------------------+
            | 1. Sala 1        |
            | 2. Sala 2        |
            | 3. Sala 3        |
            | 0. Salir         |
            +------------------+
            """;

    public static void menu() {
        System.out.print(menuStr);
        boolean reserved = true;
        boolean operation = true;
        option = sc.nextInt();
        if (option > 0 && option < 4) {
            String[][] room = whichRoom(option);
            showRoom(room);
            while (reserved && operation) {
                System.out.println("Quieres reservar un asiento? (s/n): ");
                if (sc.next().equalsIgnoreCase("s")) {

                    System.out.print("Introduce la fila en la que quieres reservar: ");
                    int row = sc.nextInt() - 1;
                    System.out.print("Introduce el asiento en el que te quieres sentar: ");
                    int col = sc.nextInt() - 1;
                    if ("R".equals(room[row][col])) {
                        System.out.println("Ese asiento está ocupado. Prueba otra vez.");
                    } else if ("L".equals(room[row][col])) {
                        reserved = false;
                        room[row][col] = "R";
                        System.out.println("Has reservado el asiento " + (col + 1) + " de la fila " + (row + 1) + " en la sala " + option);
                    }
                } else {
                    operation = false;
                }
            }
        }

    }

//    public static boolean isReserved(String[][] room, int row, int col) {
//
//    }
    public static void makeRooms() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                room1[i][j] = "L";
                room2[i][j] = "L";
                room3[i][j] = "L";
            }
        }
    }

    public static String[][] whichRoom(int nRoom) {
        switch (nRoom) {
            case 1:
                return room1;

            case 2:
                return room2;

            case 3:
                return room3;

            default:
                throw new AssertionError();
        }
    }

    public static void showRoom(String[][] room) {
        System.out.println("      1 2 3 4 5 6 7 8 9 10");
        System.out.println("     ---------------------");
        for (int i = 0; i < 10; i++) {
            String output;
            output = (i == 9) ? ("" + (i + 1) + " | ") : (" " + (i + 1) + " | ");
            System.out.print(output);
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + room[i][j]);
            }
            System.out.println("");
        }
        System.out.println("    ---------------------");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        makeRooms();
        while (option != 0) {
            menu();
        }
    }

}
