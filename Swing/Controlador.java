/*
 * Controlador base para aplicaciones Swing
 */
package miAplicacion;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase controlador para manejar la lógica de la aplicación.
 * El controlador actúa como intermediario entre el modelo y la vista.
 */
public class Controlador {

    // Rutas a archivos de datos persistentes
    public final String RUTA_DATOS = "datos";
    
    // Colecciones para los modelos de datos
    private ArrayList<Object> datos;
    
    /**
     * Constructor del controlador
     */
    public Controlador() {
        datos = new ArrayList<>();
    }
    
    /**
     * Inicializa el controlador cargando los datos
     */
    public void inicializar() {
        cargarDatos(RUTA_DATOS);
        
        // Mostrar información de los datos cargados (para depuración)
        if (!datos.isEmpty()) {
            System.out.println("Se han cargado " + datos.size() + " registros");
        } else {
            System.out.println("No se han podido cargar datos");
        }
    }
    
    /**
     * Carga datos desde archivos
     * 
     * @param ruta Ruta base del archivo
     */
    private void cargarDatos(String ruta) {
        // Limpiar la lista para evitar duplicados
        datos.clear();
        
        // Estrategia de carga: primero archivo binario, si no existe, usar texto
        if (!cargarDesdeBinario(ruta)) {
            cargarDesdeTexto(ruta);
        }
        
        // Si no hay datos, crear datos por defecto
        if (datos.isEmpty()) {
            crearDatosPorDefecto();
            guardarDatosEnBinario(ruta);
        }
    }
    
    /**
     * Carga datos desde un archivo de texto
     * 
     * @param ruta Ruta base del archivo
     * @return true si se cargaron correctamente, false en caso contrario
     */
    private boolean cargarDesdeTexto(String ruta) {
        boolean resultado = false;
        
        try (
                FileReader fr = new FileReader(ruta+".txt"); 
                BufferedReader br = new BufferedReader(fr);
            ) {
            String linea = br.readLine();
            while (linea != null) {
                // Procesar cada línea y crear objetos
                String[] campos = linea.split(";");
                if (campos.length > 0) {
                    // Crear objeto según los campos y añadir a la lista
                    // Ejemplo: datos.add(new MiObjeto(campos[0], campos[1], ...));
                }
                linea = br.readLine();
            }
            resultado = true;
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo: " + ruta + ".txt");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ruta + ".txt");
        }
        
        return resultado;
    }
    
    /**
     * Carga datos desde un archivo binario
     * 
     * @param ruta Ruta base del archivo
     * @return true si se cargaron correctamente, false en caso contrario
     */
    private boolean cargarDesdeBinario(String ruta) {
        boolean resultado = false;
        
        try (
                FileInputStream fis = new FileInputStream(ruta+".dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    datos.add(obj);
                } catch (EOFException e) {
                    System.out.println("Fin del archivo binario");
                    resultado = true;
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo binario: " + ruta + ".dat");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo binario: " + ruta + ".dat");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al convertir los objetos desde: " + ruta + ".dat");
        }
        
        return resultado;
    }
    
    /**
     * Guarda datos en un archivo binario
     * 
     * @param ruta Ruta base del archivo
     * @return true si se guardaron correctamente, false en caso contrario
     */
    private boolean guardarDatosEnBinario(String ruta) {
        boolean resultado = false;
        
        try (
                FileOutputStream fos = new FileOutputStream(ruta+".dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
            ) {
            for (Object obj : datos) {
                oos.writeObject(obj);
            }
            oos.flush();
            resultado = true;
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo: " + ruta + ".dat");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + ruta + ".dat");
        }
        
        return resultado;
    }
    
    /**
     * Crea datos por defecto cuando no existen archivos de datos
     */
    private void crearDatosPorDefecto() {
        // Crear objetos de ejemplo y añadirlos a la lista de datos
        // Ejemplo: datos.add(new MiObjeto("nombre", "descripción", 100));
    }
    
    /**
     * Filtra y ordena los datos según un criterio específico
     * 
     * @return Lista filtrada y ordenada
     */
    public ArrayList<Object> filtrarYOrdenar() {
        ArrayList<Object> resultado = new ArrayList<>();
        
        // Filtrar según criterios
        for (Object obj : datos) {
            // if (cumpleCriterio(obj)) {
            //     resultado.add(obj);
            // }
        }
        
        // Ordenar el resultado
        // resultado.sort((o1, o2) -> criterioComparacion(o1, o2));
        
        return resultado;
    }
    
    /**
     * Añade un nuevo elemento a los datos
     * 
     * @param elemento Elemento a añadir
     */
    public void agregarElemento(Object elemento) {
        datos.add(elemento);
        guardarDatosEnBinario(RUTA_DATOS);
    }
    
    /**
     * Elimina un elemento de los datos
     * 
     * @param indice Índice del elemento a eliminar
     */
    public void eliminarElemento(int indice) {
        if (indice >= 0 && indice < datos.size()) {
            datos.remove(indice);
            guardarDatosEnBinario(RUTA_DATOS);
        }
    }
    
    /**
     * Obtiene todos los datos
     * 
     * @return Lista completa de datos
     */
    public ArrayList<Object> getDatos() {
        return datos;
    }
}
