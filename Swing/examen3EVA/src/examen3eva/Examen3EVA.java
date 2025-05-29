/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen3eva;

import javax.swing.SwingUtilities;

/**
 *
 * @author dam1
 */
public class Examen3EVA {

    /**
     * @param args the command line arguments
     */
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
//        new VentanaPrincipal(controlador);
    }

}
