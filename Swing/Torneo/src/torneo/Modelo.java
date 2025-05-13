/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author dam1
 */
class Demonio implements Serializable {
    public static final int ID_DEMON = 0;
    private String nombre, clase;
    private int vida, ataque;
    private Brujo amo;
    private boolean convocado;
    JButton btnDesconvo;

    public Demonio(String nombre, String clase, int vida, int ataque) {
        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
        this.ataque = ataque;
        this.convocado = true;
    }

    public Demonio(String nombre, String clase, int vida, int ataque, Brujo amo) {
        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
        this.ataque = ataque;
        this.amo = amo;
        this.convocado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Brujo getAmo() {
        return amo;
    }

    public void setAmo(Brujo amo) {
        this.amo = amo;
    }

    public boolean isConvocado() {
        return convocado;
    }

    public void setConvocado(boolean convocado) {
        this.convocado = convocado;
    }

    public JButton getBtnDesconvo() {
        return btnDesconvo;
    }

    public void setBtnDesconvo(JButton btnDesconvo) {
        this.btnDesconvo = btnDesconvo;
    }

    
    
    @Override
    public String toString() {
        return "Demonio{" + "nombre=" + nombre + ", clase=" + clase + ", vida=" + vida + ", ataque=" + ataque + ", amo=" + amo + '}';
    }
    
}


class Brujo implements Serializable {
    public static final int ID_WARLOK = 0;
    private String nombre;
    private boolean semifinalista;
    private boolean finalista;
    private boolean activo = true;
    private JPanel panel;
    private JButton botonGana;
    
    
    public ArrayList<Demonio> misDemonios = new ArrayList<>();

    public Brujo(String nombre) {
        this.nombre = nombre;
    }

    void convocar(ArrayList<Demonio> demonios, int from, int to){
        for (int i = from; i < to; i++) {
            misDemonios.add(demonios.get(i));
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSemifinalista() {
        return semifinalista;
    }

    public void setSemifinalista(boolean semifinalista) {
        this.semifinalista = semifinalista;
    }

    public boolean isFinalista() {
        return finalista;
    }

    public void setFinalista(boolean finalista) {
        this.finalista = finalista;
    }

    
    @Override
    public String toString() {
        return "Brujo{" + "nombre=" + nombre + '}';
    }
    
    
}