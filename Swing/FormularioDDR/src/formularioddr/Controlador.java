package formularioddr;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Controlador {

    // Rutas a archivos de datos persistentes
    public final String RUTA_DATOS = "datos";
    // Colecciones para los modelos de datos
    private ArrayList<Object> datos;

    static Scanner sc = new Scanner(System.in);

    // Constructor del controlador
    public Controlador() {
        datos = new ArrayList<>();
    }

    public void inicializar() {

        if (preguntarSiNo("Quieres introducir datos? \n(Si no, generamos una lista predefinida)")) {
            setList(RUTA_DATOS);
        } else {
            cargarDatos(RUTA_DATOS);
        }

        // Añado aquí el resto de lógica
        // ...
        for (Object dato : datos) {
            System.out.println(dato.toString());
        }
    }

    public void setList(String ruta) {
        String respuesta;

        while (preguntarSiNo("introducir un dato__")) {
            System.out.println("Introduce nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce dni: ");
            String dni = sc.nextLine();
            System.out.println("Introduce salario: ");
            String salario = sc.nextLine();
            System.out.println("Fijo? S/N ");
            String fijo = sc.nextLine();

            datos.add(new Profesor(Integer.parseInt(salario), fijo.equalsIgnoreCase("s"), dni, nombre));
            try (
                    FileWriter fw = new FileWriter(ruta + ".txt", true); BufferedWriter bw = new BufferedWriter(fw);) {

                bw.write(
                        nombre + ";"
                        + dni + ";"
                        + salario + ";"
                        + fijo + "\n"
                );
                bw.flush();
            } catch (Exception ex) {
                System.out.println("No se puede leer el fichero\n" + ex.toString());
            }

        }
    }

    public boolean preguntarSiNo(String pregunta) {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                pregunta,
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        return respuesta == JOptionPane.YES_OPTION;
    }

    private void cargarDatos(String ruta) {

        try (
                FileReader fr = new FileReader(ruta + ".txt"); BufferedReader br = new BufferedReader(fr);) {

            String line = br.readLine();
            while (line != null) {
                String[] datosLeidos = line.split(";");
                // LOGICA
                String nombre = datosLeidos[0];
                String dni = datosLeidos[1];
                String salario = datosLeidos[2];
                String fijo = datosLeidos[3];
                Profesor profe = new Profesor(Integer.parseInt(salario), fijo.equalsIgnoreCase("true"), dni, nombre);
                datos.add(profe);
                
                line = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero.");
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero.");
        }
    }

//    private void guardarDatos(String ruta) {
//
//        // Escritura de caracteres o de bytes modo sobrescribir
//        // Si es binario, añado con agregarElemento(objeto)
//    }

//    public void agregarElemento(Object elemento) {
//        datos.add(elemento);
//        guardarDatos(RUTA_DATOS);
//    }

//    // Si tengo que eliminar objetos + bytes:
//    public void eliminarElemento(int indice) {
//        if (indice >= 0 && indice < datos.size()) {
//            datos.remove(indice);
//            guardarDatos(RUTA_DATOS);
//        }
//    }

    public ArrayList<Object> getDatos() {
        return datos;
    }
}
