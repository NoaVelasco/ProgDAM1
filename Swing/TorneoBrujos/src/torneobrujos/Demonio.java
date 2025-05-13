/*
 * Clase Demonio para el Torneo de Brujos
 */
package torneobrujos;

import java.io.Serializable;

/**
 * Clase que representa a un demonio en el juego
 */
public class Demonio implements Serializable {
    private String nombre, tipo, deBrujo;
    private int vida, ataque, puntos;
    
    /**
     * Constructor de la clase Demonio
     * 
     * @param nombre Nombre del demonio
     * @param tipo Tipo de demonio
     * @param vida Puntos de vida del demonio
     * @param ataque Puntos de ataque del demonio
     */
    public Demonio(String nombre, String tipo, int vida, int ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        puntos = (int) (Math.random() * 400) + 1;
    }
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getDeBrujo() {
        return deBrujo;
    }

    public void setDeBrujo(String deBrujo) {
        this.deBrujo = deBrujo;
    }
    
    
    
      @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Vida: " + vida + ", Ataque: " + ataque;
    }
}
