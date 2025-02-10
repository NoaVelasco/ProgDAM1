/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirFlota;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Board {

    private final int TILES_W, TILES_H;
    private char[][] board;
    private int col, row;

    // OUTPUTS -----------------------
    final char H2O = 'A';
    final char BOAT = 'B';
    final char HIT = 'X';
    final char SEA = '~';
    String hr, letterLegend;

    // LOS CONSTRUCTORES ------------------------------------
    public Board(int width, int height) {
        this.TILES_W = width;
        this.TILES_H = height;
        hr = fillHR();
        letterLegend = fillLetterLegend();
        makeBoard();
    }

    // LOS METODOS -----------------------------------------
    private String fillHR() {
        String output = "+-";
        for (int i = 0; i < TILES_W; i++) {
            output += "--";
        }
        output += "+";
        return output;
    }

    private String fillLetterLegend() {
        String output = "     ";
        for (int i = 0; i < TILES_W; i++) {
            output += (char) (i + 'A');
            output += " ";
        }
        return output;
    }

    private void makeBoard() {
        board = new char[TILES_H][TILES_W];
        for (char[] board1 : board) {
            Arrays.fill(board1, SEA);
        }
    }

    public void updateBoard() {
        System.out.println(letterLegend);
        System.out.println("   " + hr);
        for (int i = 0; i < board.length; i++) {
            if (i < 9) {
                System.out.print(" " + (i + 1));

            } else {
                System.out.print(i + 1);

            }
            System.out.print(" | ");

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("   " + hr);
    }

    public void putBoat(int size) {
        Scanner sc = new Scanner(System.in);
        boolean horiz = true;
        boolean validPos;
        boolean inPos = false;
        while (!inPos) {
            System.out.println("Vamos a introducir un barco de " + size + " casillas.");
            System.out.println("Quieres colocarlo en horizontal? [s/n]");
            String answer = sc.nextLine().toLowerCase();
            switch (answer.charAt(0)) {
                case 's' ->
                    horiz = true;
                case 'n' ->
                    horiz = false;
                default ->
                    System.out.println("Por favor, elige una opcion");
            }

            System.out.println("""
                               Elige la posicion inicial.
                               [ Recuerda dejar suficiente espacio ]""");

            System.out.print(">  Introduce columna (LETRA): ");
            String column = sc.nextLine();
            col = (int) column.toLowerCase().charAt(0);
            col -= 'a';

            System.out.print(">  Introduce fila (NUMERO): ");
            row = Integer.parseInt(sc.nextLine()) - 1;

            if (horiz) {

                if (col >= 0 && col + size <= TILES_W) {
                    validPos = true;
                    for (int i = col; i < col + size; i++) {
                        if (board[row][i] == BOAT) {
                            System.out.println("Esas casillas no son válidas.");
                            validPos = false;
                            break;
                        }
                    }
                    if (validPos) {
                        for (int i = col; i < col + 2; i++) {
                            board[row][i] = BOAT;
//                            updateBoard();
                        }
                        inPos = true;
                    }
                } else {
                    System.out.println("""
                                       Esas casillas no son v\u00e1lidas.
                                       [ Debes dejar suficiente espacio a la derecha ] """);
                }
            } else {
                if (row >= 0 && row + size <= TILES_H) {
                    validPos = true;
                    for (int i = row; i < row + size; i++) {
                        if (board[i][col] == BOAT) {
                            System.out.println("Esas casillas no son válidas.");
                            validPos = false;
                            break;
                        }
                    }
                    if (validPos) {
                        for (int i = row; i < row + 2; i++) {
                            board[i][col] = BOAT;
//                            updateBoard();
                        }
                        inPos = true;
                    }
                } else {
                    System.out.println("""
                                       Esas casillas no son v\u00e1lidas.
                                       [ Debes dejar suficiente espacio hacia abajo ] """);
                }
            }
        }

    }
}
