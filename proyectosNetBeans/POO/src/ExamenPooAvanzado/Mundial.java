/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPooAvanzado;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dam1
 */
public class Mundial {

    Random rnd = new Random();

    public ArrayList<Seleccion> selecciones = new ArrayList<>();
    public ArrayList<Seleccion> clasificados = new ArrayList<>();
    public final int NUM_EQUIPOS = 8;
    public String[] paises = {"Argentina",
        "Australia",
        "Brasil",
        "Canadá",
        "China",
        "Corea del Sur",
        "España",
        "Estados Unidos",
        "Francia",
        "Alemania",
        "India",
        "Italia",
        "Japón",
        "México",
        "Países Bajos",
        "Polonia",
        "Portugal",
        "Reino Unido",
        "Rusia",
        "Suecia"
    };
//    ArrayList<String> apodos = new ArrayList<>(); 
//    ArrayList<String> paises = new ArrayList<>(); 

    public Mundial() {
        prepararSelecciones();
        clasificacion();
        faseFinal();
    }

    public void prepararSelecciones() {

        System.out.println("Vamos a seleccionar jugadores para cada selección participante.");
        Random rnd = new Random();
        for (int i = 0; i < NUM_EQUIPOS; i++) {
            int anio = 1970 + rnd.nextInt(55);
            String apodo = Metodos.genString(rnd.nextInt(12) + 1);
//            String pais = Metodos.genString(rnd.nextInt(12) + 1);
            Seleccion x = new Seleccion(i, anio, 0, apodo, paises[i]);
            selecciones.add(i, x);
//            System.out.println(selecciones.get(i));

        }

        for (int j = 0; j < selecciones.size(); j++) {
            selecciones.get(j).convocacion();
//            for (int k = 0; k < 12; k++) {
//                for (int i = 0; i < selecciones.get(i).seleccionados.size(); i++) {
//                    System.out.println(selecciones.get(i).seleccionados.toString());
//                }
//            }
            System.out.println(selecciones.get(j));
            System.out.println(selecciones.get(j).getSeleccionados());
            System.out.println(selecciones.get(j).componentes);
            System.out.println("-----------------------------------------------------------------\n");
        }

//        System.out.println(selecciones.get(0).getJugadores());
//        System.out.println(selecciones.get(0).getSeleccionados());
    }

    public void clasificacion() {
        for (int i = 0; i < 4; i++) {
            int equipoGana = rnd.nextInt(2);
            if (equipoGana == 1) {
                ganar(selecciones, i);
                perder(selecciones, (i + 4));
                System.out.println("Gana esta ronda: " + selecciones.get(i).getPais());
                clasificados.add(selecciones.get(i));
            } else {
                perder(selecciones, i);
                ganar(selecciones, (i + 4));
                System.out.println("Gana esta ronda: " + selecciones.get(i + 4).getPais());
                clasificados.add(selecciones.get(i + 4));

            }
        }
        System.out.println("Se han clasificado ");
        System.out.println("Del grupo 1");
        for (int i = 0; i < 2; i++) {
            System.out.println(clasificados.get(i));
            System.out.println("");
        }
        System.out.println("Del grupo 2");
        for (int i = 2; i < 4; i++) {
            System.out.println(clasificados.get(i));
            System.out.println("");
        }
    }

    public void ganar(ArrayList<Seleccion> selecciones, int equipo) {
        selecciones.get(equipo).setPuntos(selecciones.get(equipo).getPuntos() + 3);
    }

    public void perder(ArrayList<Seleccion> selecciones, int equipo) {
        selecciones.get(equipo).setPuntos(selecciones.get(equipo).getPuntos() + 1);
    }

    public void faseFinal() {
        pasaRonda();
        esCampeon();
    }

    public void pasaRonda() {
        for (int i = 0; i < 2; i++) {
            int equipoGana = rnd.nextInt(2);
            if (equipoGana == 1) {
                ganar(clasificados, i);
                perder(clasificados, (i + 2));
                System.out.println("Gana esta ronda: " + clasificados.get(i).getPais());
                clasificados.add(clasificados.get(i));
            } else {
                perder(clasificados, i);
                ganar(clasificados, (i + 2));
                System.out.println("Gana esta ronda: " + clasificados.get(i + 2).getPais());
                clasificados.add(clasificados.get(i + 2));
            }
        }
        System.out.println("--------------------------------\n");
    }

    public void esCampeon() {
        ordenar();
        System.out.println("El ganador del mundial eeeeeeeeeees...");
        System.out.println(clasificados.get(0));
        System.out.println("Con " + clasificados.get(0).getPuntos() + " puntos!");
        
    }

        public void ordenar() {

        int menor;

        for (int i = 0; i < clasificados.size(); i++) {
            for (int j = i + 1; j < clasificados.size(); j++) {
                int a = clasificados.get(i).getPuntos();
                int b = clasificados.get(j).getPuntos();
                if (a < b) {
                    menor = b;
                    clasificados.get(j).setPuntos(a);
                    clasificados.get(i).setPuntos(menor);

                }
            }
        }
    }
    
    
}
