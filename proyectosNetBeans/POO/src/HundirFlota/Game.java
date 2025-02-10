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
public class Game {

    private boolean loop = true;
    private final int[] boatsToPut = {5, 4, 3, 3, 2, 2};
    private int toWinP1 = Arrays.stream(boatsToPut).sum();
    private int toWinP2 = Arrays.stream(boatsToPut).sum();
    private int[] scoresArr = {toWinP1, toWinP2};
    private Board boardP1, boardP2;
    private Board[] players = new Board[2];
    private int boardSizeW, boardSizeH;
    private int turn = 0, actualPlayer;

    public Game(int boardWidth, int boardHeight) {
        this.boardSizeW = boardWidth;
        this.boardSizeH = boardHeight;
        boardP1 = new Board(boardSizeW, boardSizeH);
        boardP2 = new Board(boardSizeW, boardSizeH);
        players[0] = boardP1;
        players[1] = boardP2;
    }

    private void putBoats(Board player) {
        for (var boat : boatsToPut) {
            player.putBoat(boat);
        }
    }

    public void putAllBoats() {
        System.out.println("Es el turno del jugador 1");
        boardP1.updateBoard(false);
        putBoats(boardP1);
        boardP1.updateBoard(false);
        System.out.println("");
        System.out.println("Es el turno del jugador 2");
        boardP2.updateBoard(false);
        putBoats(boardP2);
        boardP2.updateBoard(false);
    }

    public void changePlayer() {
        turn++;
        actualPlayer = (turn % 2);
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int col, row;
        System.out.println("-----------------------------------");
        System.out.println("Turno del jugador " + (actualPlayer + 1));
        System.out.println("-----------------------------------");
        players[actualPlayer].updateBoard(true);
        System.out.print(">  Introduce columna (LETRA): ");
        String column = sc.nextLine();
        col = (int) column.toLowerCase().charAt(0);
        col -= 'a';
        System.out.print(">  Introduce fila (NUMERO): ");
        row = Integer.parseInt(sc.nextLine()) - 1;
        if (players[actualPlayer].shot(row, col)) {
            System.out.println("¡Impacto!");
            scoresArr[actualPlayer]--;
        } else {
            System.out.println("Agua...");
        }
    }

    public void play() {
        putAllBoats();
        while (loop) {
            menu();
        }
        System.out.println("Fin del juego.");

    }
}
