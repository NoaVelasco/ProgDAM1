/*
 * Ventana para mostrar los detalles de un brujo y sus demonios
 */
package torneobrujos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Ventana para mostrar los demonios de un brujo
 */
public class VentanaDetalleBrujo extends JFrame {
    
    private Brujo brujo;
    private JButton[] btnsDesconvoca;
    private ArrayList<Demonio> demonios;
    
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
        
        // Panel principal para los demonios con GridLayout
        demonios = brujo.getEquipo();
        int numDemonios = demonios.size();
        btnsDesconvoca = new JButton[numDemonios];
        
        // Panel con cabeceras
        JPanel panelDemonios = new JPanel(new BorderLayout());
        
        // Panel para las cabeceras
        JPanel panelCabecera = new JPanel(new GridLayout(1, 6));
        panelCabecera.add(new JLabel("Nombre", JLabel.CENTER));
        panelCabecera.add(new JLabel("Tipo", JLabel.CENTER));
        panelCabecera.add(new JLabel("Vida", JLabel.CENTER));
        panelCabecera.add(new JLabel("Ataque", JLabel.CENTER));
        panelCabecera.add(new JLabel("Puntos", JLabel.CENTER));
        panelCabecera.add(new JLabel("Desconvocar", JLabel.CENTER));
        
        // Panel para los datos de los demonios
        JPanel panelDatos = new JPanel(new GridLayout(numDemonios, 5, 5, 5));
        
        for (int i = 0; i < numDemonios; i++) {
            Demonio demonio = demonios.get(i);
            
            // Añadir datos del demonio
            panelDatos.add(new JLabel(demonio.getNombre(), JLabel.CENTER));
            panelDatos.add(new JLabel(demonio.getTipo(), JLabel.CENTER));
            panelDatos.add(new JLabel(String.valueOf(demonio.getVida()), JLabel.CENTER));
            panelDatos.add(new JLabel(String.valueOf(demonio.getAtaque()), JLabel.CENTER));
            panelDatos.add(new JLabel(String.valueOf(demonio.getPuntos()), JLabel.CENTER));
            
            // Botón para desconvocar
            JButton btnFuera = new JButton("Despedir");
            final int indice = i;
            btnFuera.addActionListener((ActionEvent e) -> {
                desconvocaDemon(indice);
                actualizarPanel();
            });
            btnsDesconvoca[i] = btnFuera;
            panelDatos.add(btnFuera);
        }
        
        // Añadir cabecera y datos al panel principal
        panelDemonios.add(panelCabecera, BorderLayout.NORTH);
        panelDemonios.add(panelDatos, BorderLayout.CENTER);
        
        // Scroll para el panel de demonios
        JScrollPane scrollPane = new JScrollPane(panelDemonios);
        
        // Añadir componentes al frame
        add(panelInfo, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    /**
     * Actualiza el panel de demonios después de una desconvocación
     */
    private void actualizarPanel() {
        // Recargar la ventana para reflejar los cambios
        dispose();
        new VentanaDetalleBrujo(brujo);
    }
    
    /**
     * Configura las propiedades de la ventana
     */
    private void configurarVentana() {
        setTitle("Demonios de " + brujo.getNombre());
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void desconvocaDemon(int index){
        brujo.getEquipo().remove(index);
        JOptionPane.showMessageDialog(this, 
            "Demonio desconvocado con éxito", 
            "Desconvocar", 
            JOptionPane.INFORMATION_MESSAGE);
    } 

    public JButton[] getBtnsDesconvoca() {
        return btnsDesconvoca;
    }

    public void setBtnsDesconvoca(JButton[] btnsDesconvoca) {
        this.btnsDesconvoca = btnsDesconvoca;
    }
    
}
