/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirFlota;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Board {

    private final int TILES_W, TILES_H;
    private char[][] bckBoard, frntBoard;
    private int col, row;

    // OUTPUTS -----------------------
    Scanner sc = new Scanner(System.in);
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
        bckBoard = new char[TILES_H][TILES_W];
        frntBoard = new char[TILES_H][TILES_W];
        for (int i = 0; i < bckBoard.length; i++) {
            Arrays.fill(bckBoard[i], SEA);
            Arrays.fill(frntBoard[i], SEA);
        }
    }

    public void updateBoard(boolean hidden) {
        char[][] board = hidden ? frntBoard : bckBoard;
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

    private void introRowCol() {
        System.out.print(">  Introduce columna (LETRA): ");
        String column = sc.nextLine();
        col = (int) column.toLowerCase().charAt(0);
        col -= 'a';
        System.out.print(">  Introduce fila (NUMERO): ");

        String aux = sc.nextLine();
        String regex = "\\d+";
        if (aux.matches(regex)) {
            row = Integer.parseInt(aux) - 1;
        } else {
            row = -1;
        }
    }

    public void fakeBoard() {
        for (int i = 0; i < 3; i++) {
            while (true) {
                int randR = new Random().nextInt(10);
                int randC = new Random().nextInt(10);
                if (bckBoard[randR][randC] != BOAT) {
                    bckBoard[randR][randC] = BOAT;
                    break;
                }
            }
        }
    }

    public void putBoat(int size) {

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
                default -> {
                    System.out.println("Por favor, elige una opcion");
                    continue;
                }
            }
            System.out.println("""
                               Elige la posicion inicial.
                               [ Recuerda dejar suficiente espacio ]""");
            introRowCol();
            if (horiz) {
                if (col >= 0 && col + size <= TILES_W) {
                    validPos = true;
                    for (int i = col; i < col + size; i++) {
                        if (bckBoard[row][i] == BOAT) {
                            System.out.println("Esas casillas no son válidas.");
                            validPos = false;
                            break;
                        }
                    }
                    if (validPos) {

                        for (int i = col; i < col + size; i++) {
                            bckBoard[row][i] = BOAT;
                        }
                        inPos = true;
                    }
                } else {
                    System.out.println("""
                                       Esas casillas no son validas.
                                       [ Debes dejar suficiente espacio a la derecha ] """);
                }
            } else {
                if (row >= 0 && row + size <= TILES_H) {
                    validPos = true;
                    for (int i = row; i < row + size; i++) {
                        if (bckBoard[i][col] == BOAT) {
                            System.out.println("Esas casillas no son válidas.");
                            validPos = false;
                            break;
                        }
                    }
                    if (validPos) {
                        for (int i = row; i < row + size; i++) {
                            bckBoard[i][col] = BOAT;
//                            updateBoard();
                        }
                        inPos = true;
                    }
                } else {
                    System.out.println("""
                                       Esas casillas no son validas.
                                       [ Debes dejar suficiente espacio hacia abajo ] """);
                }
            }
        }

    }

    public boolean shot() {
        // @TODO: 
        System.out.println("--------- DISPARAR ----------");
        boolean noBound = true;
        while (noBound) {
            introRowCol();
            if ((row >= 0 && row < TILES_W) || (col >= 0 && col < TILES_H)) {
                noBound = false;
            }
        }
        return bckBoard[row][col] == BOAT;
    }

    public void isHit(boolean impacted) {
        frntBoard[row][col] = impacted ? HIT : H2O;
        if (impacted) {
            frntBoard[row][col] = HIT;
            bckBoard[row][col] = HIT;
        } else {
            frntBoard[row][col] = H2O;
        }
    }
}
