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
//    private int toWinP1 = Arrays.stream(boatsToPut).sum();
//    private int toWinP2 = Arrays.stream(boatsToPut).sum();
    private int toWinP1 = 3;
    private int toWinP2 = 3;
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
        boardP2.updateBoard(false);
boardP2.fakeBoard();
//        putBoats(boardP2);
        boardP2.updateBoard(false);
        System.out.println("");
        System.out.println("Es el turno del jugador 2");
        boardP1.updateBoard(false);
//        putBoats(boardP1);
boardP1.fakeBoard();
        boardP1.updateBoard(false);
    }

    public void changePlayer() {
        turn++;
        actualPlayer = (turn % 2);
//        System.out.printf("Es el turno del jugador %d", actualPlayer +1);
    }
    
    public boolean ckWin(int player){
        System.out.println(scoresArr[player] );
        return scoresArr[player] == 0;
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int col, row;
        System.out.println("-----------------------------------");
        System.out.println("Turno del jugador " + (actualPlayer + 1));
        System.out.println("-----------------------------------");
        players[actualPlayer].updateBoard(true);

        if (players[actualPlayer].shot()) {
            System.out.println("¡Impacto!");
            players[actualPlayer].isHit(true);
            scoresArr[actualPlayer]--;
        } else {
            System.out.println("Agua...");
            players[actualPlayer].isHit(false);
        }
        if (ckWin(actualPlayer)) {
            loop = false;
            System.out.printf("------ HA GANADO EL JUGADOR %d -----%n", actualPlayer);
        }
        changePlayer();
    }

    public void play() {
        putAllBoats();
        while (loop) {
            menu();
        }
        System.out.println("Fin del juego.");

    }
}
