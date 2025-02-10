/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirFlota;

import java.util.Arrays;

/**
 *
 * @author dam1
 */
public class Game {

    private boolean loop = true;
    private final int[] boatsToPut = {5, 4, 3, 3, 2, 2, 2};
    private int toWinP1 = Arrays.stream(boatsToPut).sum();
    private int toWinP2 = Arrays.stream(boatsToPut).sum();
//    private int toWinP2 = 5 + 4 + 3 + 3 + 2 + 2 + 2;
    private Board boardP1;
    private Board boardP2;
    private int boardSizeW, boardSizeH;

    public Game(int boardWidth, int boardHeight) {
        this.boardSizeW = boardWidth;
        this.boardSizeH = boardHeight;
        boardP1 = new Board(boardSizeW, boardSizeH);
        boardP2 = new Board(boardSizeW, boardSizeH);
    }

    private void putBoats(Board player){
        for (var boat: boatsToPut) {
            player.putBoat(boat);
        }
    }
    
    public void putAllBoats(){
        System.out.println("Es el turno del jugador 1");
        boardP1.updateBoard();
        putBoats(boardP1);
        boardP1.updateBoard();
        System.out.println("Es el turno del jugador 2");
        boardP2.updateBoard();
        putBoats(boardP2);
        boardP2.updateBoard();
    }
    
    public void play(){
        putAllBoats();
        
    }
}
