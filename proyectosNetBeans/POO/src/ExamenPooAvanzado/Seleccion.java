/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPooAvanzado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author dam1
 */
public class Seleccion {

    private int id, anioFundacion, puntos;
    private String apodo, pais;
    public ArrayList<Componente> componentes = new ArrayList<>();
    public ArrayList<Jugador> jugadores = new ArrayList<>();
    public ArrayList<Jugador> seleccionados = new ArrayList<>();

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public final int NUM_COMPONENTES = 12;
    public String[] posiciones = {"pivot", "alero", "defensa", "groguenawer", "janderclander"};
    Random rnd = new Random();

    public Seleccion(int id, int anioFundacion, int puntos, String apodo, String pais) {
        this.id = id;
        this.anioFundacion = anioFundacion;
        this.puntos = puntos;
        this.apodo = apodo;
        this.pais = pais;
        crearSeleccion();
    }

    public ArrayList<Jugador> getSeleccionados() {
        return seleccionados;
    }

    public void setSeleccionados(ArrayList<Jugador> seleccionados) {
        this.seleccionados = seleccionados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void crearSeleccion() {
        Random rnd = new Random();
        ArrayList<Integer> dorsales = new ArrayList<>();
        for (int i = 0; i < NUM_COMPONENTES + 2; i++) {
            int edad = 18 + rnd.nextInt(20);
            String nombre = Metodos.genString(rnd.nextInt(12) + 1);
            String apellidos = Metodos.genString(rnd.nextInt(12) + 1);
            String pais = Metodos.genString(rnd.nextInt(12) + 1);

            if (i < NUM_COMPONENTES) {
                int dorsal;
                do {
                    dorsal = rnd.nextInt(100);
                } while (dorsales.contains(dorsal));
                dorsales.add(dorsal);
                Jugador x = new Jugador(dorsal, 0, posiciones[i % 5], i, edad, nombre, apellidos, getPais());
                jugadores.add(i, x);
//                System.out.println(jugadores.get(i));
            } else if (i < NUM_COMPONENTES + 1) {

                int anios = rnd.nextInt(40);
                Masajista x = new Masajista("pistolero", anios, i, edad, nombre, apellidos, getPais());
                componentes.add(x);
//                System.out.println(componentes.get(i - NUM_COMPONENTES));
            } else {
                int numFed = rnd.nextInt(9999);
                Entrenador x = new Entrenador(numFed, 1, i, edad, nombre, apellidos, apellidos);
                componentes.add(x);
//                System.out.println(componentes.get(i - NUM_COMPONENTES - 1));
            }
        }
    }

    public void convocacion() {

        for (int i = 0; i < NUM_COMPONENTES; i++) {
            jugadores.get(i).comprobarRendimiento();
        }


        ordenar();
        for (int i = 0; i < 7; i++) {
            seleccionados.add(jugadores.get(i));
        }
//        return seleccionados;

    }

    public void ordenar() {

        int menor;

        for (int i = 0; i < jugadores.size(); i++) {
            for (int j = i + 1; j < jugadores.size(); j++) {
                int a = jugadores.get(i).getRendimiento();
                int b = jugadores.get(j).getRendimiento();
                if (a < b) {
                    menor = b;
                    jugadores.get(j).setRendimiento(a);
                    jugadores.get(i).setRendimiento(menor);

                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seleccion{");
        sb.append("id=").append(id + 1);
        sb.append(", anioFundacion=").append(anioFundacion);
        sb.append(", puntos=").append(puntos);
        sb.append(", apodo=").append(apodo);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    }

}
