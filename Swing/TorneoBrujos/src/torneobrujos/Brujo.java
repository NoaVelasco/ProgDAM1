package torneobrujos;

import java.io.Serializable;
import java.util.ArrayList;


public class Brujo implements Serializable {
    private String nombre;
    private ArrayList<Demonio> equipo;
    private boolean haGanado;
    

    public Brujo(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
        this.haGanado = false;
    }
    

    public void añadirDemonio(Demonio demonio) {
        if (equipo.size() < 10) {
            equipo.add(demonio);
        }
    }
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
