/*
 * Ventana para mostrar la final del torneo
 */
package torneobrujos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ventana para la final del torneo
 */
public class VentanaFinal extends JFrame {
    
    private Brujo brujo1;
    private Brujo brujo2;
    private JPanel panelBrujo1;
    private JPanel panelBrujo2;
    private JButton botonGanar1;
    private JButton botonGanar2;
    
    /**
     * Constructor para la ventana de la final
     * 
     * @param brujo1 Primer brujo finalista
     * @param brujo2 Segundo brujo finalista
     */
    public VentanaFinal(Brujo brujo1, Brujo brujo2) {
        this.brujo1 = brujo1;
        this.brujo2 = brujo2;
        
        inicializarComponentes();
        configurarVentana();
    }
    
    /**
     * Inicializa los componentes de la interfaz
     */
    private void inicializarComponentes() {
        // Configuración del layout
        setLayout(new BorderLayout());
        
        // Panel superior con título
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel("GRAN FINAL DEL TORNEO DE BRUJOS");
        panelSuperior.add(labelTitulo);
        
        // Panel central para los brujos
        JPanel panelCentral = new JPanel(new GridLayout(1, 2, 20, 0));
          // Panel para brujo 1
        panelBrujo1 = new JPanel(new BorderLayout());
        
        JPanel panelBotones1 = new JPanel(new BorderLayout(5, 0));
        
        // Botón grande con el nombre del brujo
        JButton botonDetalle1 = new JButton(brujo1.getNombre());
        botonDetalle1.addActionListener((ActionEvent e) -> {
            mostrarDetalleBrujo(brujo1);
        });
        
        botonGanar1 = new JButton("¡GANA!");
        botonGanar1.setBackground(new Color(255, 215, 0));
        botonGanar1.addActionListener((ActionEvent e) -> {
            declararCampeon(brujo1);
        });
        
        JPanel pnlBtnGanar = new JPanel(new BorderLayout());
        pnlBtnGanar.add(botonGanar1, BorderLayout.SOUTH);
        panelBotones1.add(botonDetalle1, BorderLayout.CENTER);
        panelBotones1.add(pnlBtnGanar, BorderLayout.EAST);
        
        panelBrujo1.add(panelBotones1, BorderLayout.CENTER);
          // Panel para brujo 2
        panelBrujo2 = new JPanel(new BorderLayout());
        
        JPanel panelBotones2 = new JPanel(new BorderLayout(5, 0));
        
        // Botón grande con el nombre del brujo
        JButton botonDetalle2 = new JButton(brujo2.getNombre());
        botonDetalle2.addActionListener((ActionEvent e) -> {
            mostrarDetalleBrujo(brujo2);
        });
        
        botonGanar2 = new JButton("¡GANA!");
        botonGanar2.setBackground(new Color(255, 215, 0));
        botonGanar2.addActionListener((ActionEvent e) -> {
            declararCampeon(brujo2);
        });
          panelBotones2.add(botonDetalle2, BorderLayout.CENTER);
        panelBotones2.add(botonGanar2, BorderLayout.EAST);
        
        panelBrujo2.add(panelBotones2, BorderLayout.CENTER);
        
        // Añadir paneles de brujos al panel central
        panelCentral.add(panelBrujo1);
        panelCentral.add(panelBrujo2);
        
        // Añadir componentes al frame
        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
    }
    
    /**
     * Configura las propiedades de la ventana
     */
    private void configurarVentana() {
        setTitle("Final del Torneo de Brujos");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /**
     * Muestra los detalles de un brujo
     * 
     * @param brujo Brujo a mostrar
     */
    private void mostrarDetalleBrujo(Brujo brujo) {
        new VentanaDetalleBrujo(brujo);
    }
    
    /**
     * Declara campeón a un brujo
     * 
     * @param brujo Brujo ganador
     */    private void declararCampeon(Brujo brujo) {
        // Desactivar botones
        botonGanar1.setEnabled(false);
        botonGanar2.setEnabled(false);
        
        // Obtenemos los botones de detalle (son el primer componente de cada panel de botones)
        Component[] componentesBrujo1 = ((JPanel)panelBrujo1.getComponent(0)).getComponents();
        Component[] componentesBrujo2 = ((JPanel)panelBrujo2.getComponent(0)).getComponents();
        
        JButton botonDetalle1 = (JButton)componentesBrujo1[0];
        JButton botonDetalle2 = (JButton)componentesBrujo2[0];
        
        // Cambiar apariencia según el ganador
        if (brujo == brujo1) {
            botonDetalle1.setBackground(new Color(255, 255, 200));
            botonDetalle1.setOpaque(true);
            botonDetalle1.setBorderPainted(true);
            
            botonDetalle2.setBackground(new Color(200, 200, 200));
            botonDetalle2.setForeground(Color.GRAY);
            botonDetalle2.setOpaque(true);
        } else {
            botonDetalle2.setBackground(new Color(255, 255, 200));
            botonDetalle2.setOpaque(true);
            botonDetalle2.setBorderPainted(true);
            
            botonDetalle1.setBackground(new Color(200, 200, 200));
            botonDetalle1.setForeground(Color.GRAY);
            botonDetalle1.setOpaque(true);
        }
        
        // Mostrar mensaje
        JOptionPane.showMessageDialog(this, 
                "¡" + brujo.getNombre() + " es el campeón del torneo!\n\n" +
                "¡Felicidades!",
                "Fin del Torneo", 
                JOptionPane.INFORMATION_MESSAGE);
    }
}
