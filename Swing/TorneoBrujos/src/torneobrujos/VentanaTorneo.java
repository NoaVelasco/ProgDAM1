/*
 * Interfaz principal para mostrar la ronda actual del torneo
 */
package torneobrujos;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Frame principal del torneo de brujos
 */
public class VentanaTorneo extends JFrame {
    
    private ArrayList<Brujo> brujos;
    private ArrayList<Demonio> demonios;
    private JButton[] botonesDetalle;
    private JButton[] botonesGanar;
    private JPanel[] panelesBrujos;
    private JButton botonSiguienteRonda;
    private int rondaActual;
    private ArrayList<Brujo> ganadores;
    
    /**
     * Constructor de la ventana principal
     * 
     * @param brujos Lista de brujos del torneo
     * @param demonios Lista de demonios
     */
    public VentanaTorneo(ArrayList<Brujo> brujos, ArrayList<Demonio> demonios) {
        this.brujos = brujos;
        this.demonios = demonios;
        this.rondaActual = 1;
        this.ganadores = new ArrayList<>();
        
        inicializarComponentes();
        configurarVentana();
    }
    
    /**
     * Inicializa los componentes de la interfaz
     */
    private void inicializarComponentes() {
        // Configuración del layout principal
        setLayout(new BorderLayout());
        
        // Panel para los brujos
        JPanel panelBrujos = new JPanel(new GridLayout(2, 2, 10, 10));
        
        // Inicializar arrays
        botonesDetalle = new JButton[4];
        botonesGanar = new JButton[4];
        panelesBrujos = new JPanel[4];
          // Crear los paneles para cada brujo
        for (int i = 0; i < 4; i++) {
            Brujo brujo = brujos.get(i);
            
            // Panel para el brujo actual
            JPanel panelBrujo = new JPanel(new BorderLayout());
            
            // Panel para los botones
            JPanel panelBotones = new JPanel(new BorderLayout(5, 0));
            
            // Botón para ver detalles 
            JButton botonDetalle = new JButton(brujo.getNombre());
            botonDetalle.addActionListener((ActionEvent e) -> {
                mostrarDetalleBrujo(brujo);
            });
            botonesDetalle[i] = botonDetalle;
            
            // Botón para declarar ganador
            JButton botonGanar = new JButton("¡Gana!");
            final int indice = i;
            botonGanar.addActionListener((ActionEvent e) -> {
                declararGanador(indice);
            });
            botonesGanar[i] = botonGanar;
            
            JPanel pnlBtnGanar = new JPanel(new BorderLayout());
            pnlBtnGanar.add(botonGanar, BorderLayout.SOUTH);
            // Añadir botones al panel
            panelBotones.add(botonDetalle, BorderLayout.CENTER);
            panelBotones.add(pnlBtnGanar, BorderLayout.EAST);
            
            // Añadir componentes al panel del brujo
            panelBrujo.add(panelBotones, BorderLayout.CENTER);
            
            panelesBrujos[i] = panelBrujo;
            panelBrujos.add(panelBrujo);
        }
        
        // Panel para el botón de siguiente ronda
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        botonSiguienteRonda = new JButton("Siguiente Ronda");
        botonSiguienteRonda.setEnabled(false);
        botonSiguienteRonda.addActionListener((ActionEvent e) -> {
            pasarSiguienteRonda();
        });
        panelInferior.add(botonSiguienteRonda);
        
        // Título de la ronda actual
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelRonda = new JLabel("RONDA 1: SEMIFINAL");
        panelSuperior.add(labelRonda);
        
        // Añadir paneles al frame
        add(panelSuperior, BorderLayout.NORTH);
        add(panelBrujos, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
    }
    
    /**
     * Configura las propiedades de la ventana
     */
    private void configurarVentana() {
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    /**
     * Muestra los detalles de un brujo en otra ventana
     * 
     * @param brujo Brujo del que mostrar detalles
     */
    private void mostrarDetalleBrujo(Brujo brujo) {
        new VentanaDetalleBrujo(brujo);
    }
      /**
     * Declara ganador a un brujo en su respectiva fila
     * 
     * @param indice Índice del brujo ganador
     */
    private void declararGanador(int indice) {
        // Determinar qué fila es (0-1 primera fila, 2-3 segunda fila)
        int fila = indice / 2;
        int inicioFila = fila * 2;
        int finFila = inicioFila + 1;
        
        // Marcar ganador y perdedor
        brujos.get(indice).setHaGanado(true);
        ganadores.add(brujos.get(indice));
        
        // Deshabilitar botones de esta fila
        for (int i = inicioFila; i <= finFila; i++) {
            botonesGanar[i].setEnabled(false);
            
            // Cambiar apariencia del perdedor/ganador
            if (i != indice) {
                // Perdedor: gris y opaco
                botonesDetalle[i].setBackground(new Color(200, 200, 200));
                botonesDetalle[i].setForeground(Color.GRAY);
                botonesDetalle[i].setOpaque(true);
            } else {
                // Ganador: verde claro y brillante
                botonesDetalle[i].setBackground(new Color(220, 255, 220));
                botonesDetalle[i].setOpaque(true);
                botonesDetalle[i].setBorderPainted(true);
            }
        }
        
        // Si ya hay dos ganadores, habilitar el botón de siguiente ronda
        if (ganadores.size() == 2) {
            botonSiguienteRonda.setEnabled(true);
        }
    }
    
    /**
     * Pasa a la siguiente ronda del torneo
     */
    private void pasarSiguienteRonda() {
        rondaActual++;
        
        if (rondaActual == 2) {
            // Mostrar la final
            JOptionPane.showMessageDialog(this, 
                    "¡Pasamos a la ronda final!\n\n" + 
                    ganadores.get(0).getNombre() + " vs " + ganadores.get(1).getNombre(),
                    "Final del Torneo", 
                    JOptionPane.INFORMATION_MESSAGE);
            
            // Crear nueva ventana para la final
            new VentanaFinal(ganadores.get(0), ganadores.get(1));
            
            // Cerrar esta ventana
            dispose();
        }
    }
}
