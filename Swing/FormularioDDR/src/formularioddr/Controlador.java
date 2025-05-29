package formularioddr;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Controlador {

    // Rutas a archivos de datos persistentes
    public final String RUTA_DATOS = "datos";
    // Colecciones para los modelos de datos
    private ArrayList<Profesor> datos;

    static Scanner sc = new Scanner(System.in);

    // Constructor del controlador
    public Controlador() {
        datos = new ArrayList<>();
    }

    public void inicializar() {

        if (preguntarSiNo("Quieres introducir datos? \n(Si no, generamos una lista predefinida)")) {
            setList(RUTA_DATOS);
        } else {
//            cargarDatos(RUTA_DATOS);  // texto plano
            cargarDatosBin(RUTA_DATOS);  // bytes
        }

        // Añado aquí el resto de lógica
        // ...
        for (Profesor dato : datos) {
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

            Profesor profe = new Profesor(Integer.parseInt(salario), fijo.equalsIgnoreCase("s"), dni, nombre);

            agregarElemento(profe);

        }
        guardarDatos(ruta);
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

                String nombre = datosLeidos[0];
                String dni = datosLeidos[1];
                String salario = datosLeidos[2];
                String fijo = datosLeidos[3];
                Profesor profe = new Profesor(Double.parseDouble(salario), fijo.equalsIgnoreCase("true"), dni, nombre);
                datos.add(profe);

                line = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero.");
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero.");
        }
    }

    private void guardarDatos(String ruta) {
        // IO texto plano ----------------------------------------------------
//        try (
//                FileWriter fw = new FileWriter(ruta + ".txt", true); BufferedWriter bw = new BufferedWriter(fw);) {
//
//            for (Profesor dato : datos) {
//                bw.write(
//                        dato.getNombre() + ";"
//                        + dato.getDni() + ";"
//                        + dato.getSalario() + ";"
//                        + dato.isFijo() + "\n"
//                );
//            }
//            bw.flush();
//
//        } catch (FileNotFoundException e) {
//            System.out.println("No se encontró el fichero");
//        } catch (IOException ioEx) {
//            System.out.println("No se pudo escribir en el fichero");
//        }
        // --------------------------------------------------------------------
        
        // IO bytes ----------------------------------------
        try (FileOutputStream fos = new FileOutputStream(ruta + ".dat"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Profesor dato : datos) {

                oos.writeObject(dato);
                oos.flush();
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el fichero");
        } catch (IOException ioEx) {
            System.out.println("No se pudo escribir en el fichero");
        }

    }

    public void agregarElemento(Profesor elemento) {
        datos.add(elemento);

    }

//    // Si tengo que eliminar objetos + bytes:
//    public void eliminarElemento(int indice) {
//        if (indice >= 0 && indice < datos.size()) {
//            datos.remove(indice);
//            guardarDatos(RUTA_DATOS);
//        }
//    }

    private void cargarDatosBin(String ruta) {

        try (
                FileInputStream fis = new FileInputStream(ruta + ".dat"); ObjectInputStream ois = new ObjectInputStream(fis);) {

            while (true) {
                try {
                    Profesor profe = (Profesor) ois.readObject();
                    datos.add(profe);
                } catch (EOFException e) {
                    System.out.println("Fin del archivo");
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra");
        } catch (IOException ex2) {
            System.out.println("No se pudo leer");
        } catch (ClassNotFoundException ex3) {
            System.out.println("No se pudo leer la clase");

        }
    }
    
    
    public ArrayList<Profesor> getDatos() {
        return datos;
    }
}
