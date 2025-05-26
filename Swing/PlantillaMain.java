/*
 * Clase principal para iniciar la aplicación
 */
package miAplicacion;

import javax.swing.*;

/**
 * Clase principal que inicia la aplicación
 */
public class MiAplicacion {

    /**
     * Método principal
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejecutar la aplicación en el Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                iniciarAplicacion();
            }
        });
    }
    
    /**
     * Inicia la aplicación cargando los datos y mostrando la interfaz gráfica
     */
    private static void iniciarAplicacion() {
        // Configurar look and feel
        configurarLookAndFeel();
        
        // Crear el controlador y cargar datos
        Controlador controlador = new Controlador();
        controlador.inicializar();
        
        // Iniciar la interfaz gráfica
        new VentanaPrincipal(controlador);
    }
    
    /**
     * Configura el Look and Feel de la aplicación
     */
    private static void configurarLookAndFeel() {
        try {
            // Intentar usar el look and feel del sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            // Alternativa: Usar Nimbus look and feel
            /*
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            */
        } catch (Exception e) {
            // En caso de error, usar el look and feel por defecto
            System.out.println("No se pudo configurar el look and feel: " + e);
        }
    }
}
