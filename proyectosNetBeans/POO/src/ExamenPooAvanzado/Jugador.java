/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPooAvanzado;

import java.util.Random;

/**
 *
 * @author dam1
 */
public class Jugador extends Componente{
    private int dorsal, rendimiento;
    private String posicion;

    public Jugador(int dorsal, int rendimiento, String posicion) {
        this.dorsal = dorsal;
        this.rendimiento = rendimiento;
        this.posicion = posicion;
    }

    public Jugador(int dorsal, int rendimiento, String posicion, int id, int edad, String nombre, String apellidos, String seleccion) {
        super(id, edad, nombre, apellidos, seleccion);
        this.dorsal = dorsal;
        this.rendimiento = rendimiento;
        this.posicion = posicion;
        comprobarRendimiento();
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public int concentrarse() {
        return 12;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int entrenar() {
        return 15;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int viajar() {
        return 5;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int jugarPartido() {
        return 27;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void comprobarRendimiento(){
        Random rnd = new Random();
        int mejoras = rnd.nextInt(6);
            for (int j = 0; j < mejoras; j++) {
                int accion = rnd.nextInt(4);
                switch (accion) {
                    case 0 -> setRendimiento(getRendimiento() + concentrarse());
                    case 1 -> setRendimiento(getRendimiento() + entrenar());
                    case 2 -> setRendimiento(getRendimiento() + viajar());
                    case 3 -> setRendimiento(getRendimiento() + jugarPartido());
                    default -> throw new AssertionError();
                }
            }
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" dorsal=").append(dorsal);
        sb.append(" rendimiento=").append(rendimiento);
        sb.append(" posicion=").append(posicion);
        sb.append("\n");
        return sb.toString();
    }
    
    
    
}
