package torneobrujos;

import javax.swing.*;


public class TorneoBrujos {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                iniciarAplicacion();
            }
        });
    }      
    
    private static void iniciarAplicacion() {
        Controlador controlador = new Controlador();
        controlador.inicializar();
        
        
        controlador.crearBrujos();
        controlador.asignarDemonios();
        
        new VentanaTorneo(controlador.getBrujos(), controlador.getDemonios(), controlador.ordenaDemonios());
    }
}
