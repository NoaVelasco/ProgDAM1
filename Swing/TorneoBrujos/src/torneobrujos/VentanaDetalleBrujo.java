/*
 * Ventana para mostrar los detalles de un brujo y sus demonios
 */
package torneobrujos;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana para mostrar los demonios de un brujo
 */
public class VentanaDetalleBrujo extends JFrame {
    
    private Brujo brujo;
    
    /**
     * Constructor de la ventana de detalle
     * 
     * @param brujo Brujo del que mostrar detalles
     */
    public VentanaDetalleBrujo(Brujo brujo) {
        this.brujo = brujo;
        
        inicializarComponentes();
        configurarVentana();
    }
    
    /**
     * Inicializa los componentes de la interfaz
     */
    private void inicializarComponentes() {
        // Configuración del layout
        setLayout(new BorderLayout());
          // Panel superior con información del brujo
        JPanel panelInfo = new JPanel(new GridLayout(1, 1, 5, 5));
        panelInfo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelInfo.add(new JLabel("Nombre: " + brujo.getNombre()));
          // Tabla para mostrar los demonios
        String[] columnas = {"Nombre", "Tipo", "Vida", "Ataque"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
        for (Demonio demonio : brujo.getEquipo()) {
            Object[] fila = {
                demonio.getNombre(),
                demonio.getTipo(),
                demonio.getVida(),
                demonio.getAtaque()
            };
            modelo.addRow(fila);
        }
        
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        
        // Añadir componentes al frame
        add(panelInfo, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    /**
     * Configura las propiedades de la ventana
     */
    private void configurarVentana() {
        setTitle("Demonios de " + brujo.getNombre());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
