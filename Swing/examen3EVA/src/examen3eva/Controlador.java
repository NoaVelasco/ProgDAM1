/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3eva;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class Controlador {

    public final String RUTA_DATOS = "datos";
    private ArrayList<Object> datos;

    // Constructor del controlador
    public Controlador() {
        datos = new ArrayList<>();
    }

    public void inicializar() {
        cargarDatos(RUTA_DATOS);

        // Añado aquí el resto de lógica
        // ...
    }

    private void cargarDatos(String ruta) {

        try (
                FileReader fr = new FileReader(ruta + ".txt"); BufferedReader br = new BufferedReader(fr);) {

            String line = br.readLine();
            while (line != null) {
                String[] extraction = line.split("#");
//                ### dni # nombre # ape1 # anyonac ###fijo # factura # percent
                String dni = extraction[1];
                String nombre = extraction[2];
                String ape = extraction[3];
//                extraction[4].trim();
                String[] datoDoble = extraction[4].trim().split(" ");
                System.out.println(datoDoble[0] + " - " + datoDoble[1]);
                int anio = Integer.parseInt(datoDoble[0]);
                Double fijo = Double.parseDouble(datoDoble[1]);
                Double factura = Double.parseDouble(extraction[5]);
                Double porcentaje = Double.parseDouble(extraction[6]);

                Empleado e = new Empleado(dni, nombre, ape, anio, fijo, factura, porcentaje);
                System.out.println(e.toString());
                System.out.println((int) (1500 + 10000 * 3.0 * 0.01));
                
                datos.add(e);
                
                
                // 🐞🐞🐞 DEPURAR
//                for (int i = 0; i < datos.length; i++) {
//
//                    System.out.println(i + " - " + datos[i]);
//                }

                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero.");
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero.");
        }

    }

    private void guardarDatos(String ruta) {

        // Escritura de caracteres o de bytes modo sobrescribir
        // Si es binario, añado con agregarElemento(objeto)
    }

    public void agregarElemento(Object elemento) {
        datos.add(elemento);
        guardarDatos(RUTA_DATOS);
    }

    // Si tengo que eliminar objetos + bytes:
    public void eliminarElemento(int indice) {
        if (indice >= 0 && indice < datos.size()) {
            datos.remove(indice);
            guardarDatos(RUTA_DATOS);
        }
    }

    public ArrayList<Object> getDatos() {
        return datos;
    }
}
