/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author noave
 */
public class HundirFlota {
    private static final int TAMANO_TABLERO = 10;
    private static final char AGUA = '~';
    private static final char BARCO = 'B';
    private static final char IMPACTO = 'X';
    private static final char FALLO = 'O';
    private char[][] tablero = new char[TAMANO_TABLERO][TAMANO_TABLERO];
    private Random random = new Random();

    public HundirFlota() {
        inicializarTablero();
        colocarBarcos();
    }

    private void inicializarTablero() {
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                tablero[i][j] = AGUA;
            }
        }
    }

    private void colocarBarcos() {
        colocarBarco(4);
        colocarBarco(3);
        colocarBarco(3);
        colocarBarco(2);
        colocarBarco(2);
        colocarBarco(2);
        colocarBarco(1);
        colocarBarco(1);
        colocarBarco(1);
        colocarBarco(1);
    }

    private void colocarBarco(int tamano) {
        boolean colocado = false;
        while (!colocado) {
            int fila = random.nextInt(TAMANO_TABLERO);
            int columna = random.nextInt(TAMANO_TABLERO);
            boolean horizontal = random.nextBoolean();

            if (horizontal) {
                if (columna + tamano <= TAMANO_TABLERO) {
                    boolean espacioLibre = true;
                    for (int i = 0; i < tamano; i++) {
                        if (tablero[fila][columna + i] != AGUA) {
                            espacioLibre = false;
                            break;
                        }
                    }
                    if (espacioLibre) {
                        for (int i = 0; i < tamano; i++) {
                            tablero[fila][columna + i] = BARCO;
                        }
                        colocado = true;
                    }
                }
            } else {
                if (fila + tamano <= TAMANO_TABLERO) {
                    boolean espacioLibre = true;
                    for (int i = 0; i < tamano; i++) {
                        if (tablero[fila + i][columna] != AGUA) {
                            espacioLibre = false;
                            break;
                        }
                    }
                    if (espacioLibre) {
                        for (int i = 0; i < tamano; i++) {
                            tablero[fila + i][columna] = BARCO;
                        }
                        colocado = true;
                    }
                }
            }
        }
    }

    public void mostrarTablero() {
        System.out.print("  ");
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
        System.out.println();
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                if (tablero[i][j] == IMPACTO || tablero[i][j] == FALLO) {
                    System.out.print(tablero[i][j] + " ");
                } else {
                    System.out.print(AGUA + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean disparar(int fila, int columna) {
        if (tablero[fila][columna] == BARCO) {
            tablero[fila][columna] = IMPACTO;
            return true;
        } else if (tablero[fila][columna] == AGUA) {
            tablero[fila][columna] = FALLO;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HundirFlota juego = new HundirFlota();
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            juego.mostrarTablero();
            System.out.println("Introduce la fila (0-9) y la columna (A-J) para disparar: ");
            int fila = scanner.nextInt();
            char columnaChar = scanner.next().charAt(0);
            int columna = columnaChar - 'A';

            if (juego.disparar(fila, columna)) {
                System.out.println("¡Impacto!");
            } else {
                System.out.println("Agua...");
            }

            // Verificar si todos los barcos han sido hundidos
            juegoTerminado = true;
            for (int i = 0; i < TAMANO_TABLERO; i++) {
                for (int j = 0; j < TAMANO_TABLERO; j++) {
                    if (juego.tablero[i][j] == BARCO) {
                        juegoTerminado = false;
                        break;
                    }
                }
            }

            if (juegoTerminado) {
                System.out.println("¡Has hundido todos los barcos!");
            }
        }

        scanner.close();
    }
}
