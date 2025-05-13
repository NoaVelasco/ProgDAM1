/*
 * Clase principal del Torneo de Brujos
 */
package torneobrujos;

import javax.swing.*;

/**
 * Clase principal para iniciar el torneo de brujos
 */
public class TorneoBrujos {

    /**
     * Método principal
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                iniciarAplicacion();
            }
        });
    }      /**
     * Inicia la aplicación cargando los datos y mostrando la interfaz gráfica
     */
    private static void iniciarAplicacion() {
        // Crear el controlador y cargar datos
        Controlador controlador = new Controlador();
        controlador.inicializar();
        
        
        // Crear brujos y asignar demonios
        controlador.crearBrujos();
        controlador.asignarDemonios();
        
        // Iniciar la interfaz gráfica
        new VentanaTorneo(controlador.getBrujos(), controlador.getDemonios(), controlador.ordenaDemonios());
    }
}
