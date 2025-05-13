/*
 * Clase Brujo para el Torneo de Brujos
 */
package torneobrujos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que representa a un brujo en el juego
 */
public class Brujo implements Serializable {
    private String nombre;
    private ArrayList<Demonio> equipo;
    private boolean haGanado;
    
    /**
     * Constructor de la clase Brujo
     * 
     * @param nombre Nombre del brujo
     */
    public Brujo(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
        this.haGanado = false;
    }
    
    /**
     * Añade un demonio al equipo del brujo
     * 
     * @param demonio Demonio a añadir
     */
    public void añadirDemonio(Demonio demonio) {
        if (equipo.size() < 10) {
            equipo.add(demonio);
        }
    }
      // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Demonio> getEquipo() {
        return equipo;
    }
    
    public boolean isHaGanado() {
        return haGanado;
    }

    public void setHaGanado(boolean haGanado) {
        this.haGanado = haGanado;
    }
      @Override
    public String toString() {
        return nombre;
    }
}
