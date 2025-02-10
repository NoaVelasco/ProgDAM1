/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirFlota;

/**
 *
 * @author dam1
 */
public class Ship {
    private int casillas;
    private boolean sinked = false;
    private int[][] position;

    public Ship(int casillas) {
        this.casillas = casillas;
        position = new int[casillas][2];
    }

    public boolean isSinked() {
        return sinked;
    }

    public void setSinked(boolean sinked) {
        this.sinked = sinked;
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }
    
    
    
    
}
