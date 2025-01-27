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
public class TresEnRaya00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        inicializarTablero(tablero);
        boolean juegoTerminado = false;
        char jugadorActual = 'X';
        Scanner sc = new Scanner(System.in);

        while (!juegoTerminado) {
            mostrarTablero(tablero);
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.println("Elige una opción: 1. Poner nueva ficha 2. Mover ficha existente");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                ponerFicha(tablero, jugadorActual, sc);
            } else if (opcion == 2) {
                moverFicha(tablero, jugadorActual, sc);
            } else {
                System.out.println("Opción no válida.");
                continue;
            }

            juegoTerminado = comprobarVictoria(tablero, jugadorActual) || comprobarEmpate(tablero);

            if (!juegoTerminado) {
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }

        mostrarTablero(tablero);
        if (comprobarVictoria(tablero, jugadorActual)) {
            System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    public static void ponerFicha(char[][] tablero, char jugador, Scanner sc) {
        int fila, columna;
        do {
            System.out.println("Introduce la fila (0-2): ");
            fila = sc.nextInt();
            System.out.println("Introduce la columna (0-2): ");
            columna = sc.nextInt();
        } while (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ');

        tablero[fila][columna] = jugador;
    }

    public static void moverFicha(char[][] tablero, char jugador, Scanner sc) {
        int filaOrigen, columnaOrigen, filaDestino, columnaDestino;
        do {
            System.out.println("Introduce la fila de la ficha a mover (0-2): ");
            filaOrigen = sc.nextInt();
            System.out.println("Introduce la columna de la ficha a mover (0-2): ");
            columnaOrigen = sc.nextInt();
        } while (filaOrigen < 0 || filaOrigen > 2 || columnaOrigen < 0 || columnaOrigen > 2 || tablero[filaOrigen][columnaOrigen] != jugador);

        do {
            System.out.println("Introduce la fila de destino (0-2): ");
            filaDestino = sc.nextInt();
            System.out.println("Introduce la columna de destino (0-2): ");
            columnaDestino = sc.nextInt();
        } while (filaDestino < 0 || filaDestino > 2 || columnaDestino < 0 || columnaDestino > 2 || tablero[filaDestino][columnaDestino] != ' ');

        tablero[filaOrigen][columnaOrigen] = ' ';
        tablero[filaDestino][columnaDestino] = jugador;
    }

    public static boolean comprobarVictoria(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true;
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
        return false;
    }

    public static boolean comprobarEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
