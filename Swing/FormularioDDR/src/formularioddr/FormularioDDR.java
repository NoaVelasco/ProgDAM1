
package formularioddr;

import javax.swing.*;


public class FormularioDDR {


    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            iniciarAplicacion();
        });
    }
    
    private static void iniciarAplicacion() {
        
        // Crear el controlador y cargar datos
        Controlador controlador = new Controlador();
        controlador.inicializar();
        
        // Iniciar la interfaz gráfica
        new VentanaPrincipal(controlador);
    }
}

