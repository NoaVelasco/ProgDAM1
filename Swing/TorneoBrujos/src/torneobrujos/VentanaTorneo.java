package torneobrujos;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class VentanaTorneo extends JFrame {
    
    private ArrayList<Brujo> brujos;
    private ArrayList<Demonio> demonios;
    private JButton[] botonesDetalle;
    private JButton[] botonesGanar;
    private JPanel[] panelesBrujos;
    private JButton botonSiguienteRonda;
    private int rondaActual;
    private ArrayList<Brujo> ganadores;
    private ArrayList<Demonio> bestDemons;
    

    public VentanaTorneo(ArrayList<Brujo> brujos, ArrayList<Demonio> demonios, ArrayList<Demonio> bestDemons) {
        this.brujos = brujos;
        this.demonios = demonios;
        this.bestDemons = bestDemons;
        this.rondaActual = 1;
        this.ganadores = new ArrayList<>();
        
        inicializarComponentes();
        configurarVentana();
    }
    

    private void inicializarComponentes() {
        setLayout(new BorderLayout());
        
        JPanel panelBrujos = new JPanel(new GridLayout(2, 2, 10, 10));
        
        botonesDetalle = new JButton[4];
        botonesGanar = new JButton[4];
        panelesBrujos = new JPanel[4];
        for (int i = 0; i < 4; i++) {
            Brujo brujo = brujos.get(i);
            
            JPanel panelBrujo = new JPanel(new BorderLayout());
            
            JPanel panelBotones = new JPanel(new BorderLayout(5, 0));
            
            JButton botonDetalle = new JButton(brujo.getNombre());
            botonDetalle.addActionListener((ActionEvent e) -> {
                mostrarDetalleBrujo(brujo);
            });
            botonesDetalle[i] = botonDetalle;
            
            JButton botonGanar = new JButton("¡Gana!");
            final int indice = i;
            botonGanar.addActionListener((ActionEvent e) -> {
                declararGanador(indice);
            });
            botonesGanar[i] = botonGanar;
            
            JPanel pnlBtnGanar = new JPanel(new BorderLayout());
            pnlBtnGanar.add(botonGanar, BorderLayout.SOUTH);
            panelBotones.add(botonDetalle, BorderLayout.CENTER);
            panelBotones.add(pnlBtnGanar, BorderLayout.EAST);
            
            panelBrujo.add(panelBotones, BorderLayout.CENTER);
            
            panelesBrujos[i] = panelBrujo;
            panelBrujos.add(panelBrujo);
        }
        
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        botonSiguienteRonda = new JButton("Siguiente Ronda");
        botonSiguienteRonda.setEnabled(false);
        botonSiguienteRonda.addActionListener((ActionEvent e) -> {
            pasarSiguienteRonda();
        });
        panelInferior.add(botonSiguienteRonda);
        
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelRonda = new JLabel("RONDA 1: SEMIFINAL");
        panelSuperior.add(labelRonda);
        
        add(panelSuperior, BorderLayout.NORTH);
        add(panelBrujos, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
    }
    

    private void configurarVentana() {
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    

    private void mostrarDetalleBrujo(Brujo brujo) {
        new VentanaDetalleBrujo(brujo);
    }

    
    private void declararGanador(int indice) {
        int fila = indice / 2;
        int inicioFila = fila * 2;
        int finFila = inicioFila + 1;
        
        brujos.get(indice).setHaGanado(true);
        ganadores.add(brujos.get(indice));
        
        for (int i = inicioFila; i <= finFila; i++) {
            botonesGanar[i].setEnabled(false);
            
            if (i != indice) {
                botonesDetalle[i].setBackground(new Color(200, 200, 200));
                botonesDetalle[i].setForeground(Color.GRAY);
                botonesDetalle[i].setOpaque(true);
            } else {
                botonesDetalle[i].setBackground(new Color(220, 255, 220));
                botonesDetalle[i].setOpaque(true);
                botonesDetalle[i].setBorderPainted(true);
            }
        }
        
        if (ganadores.size() == 2) {
            botonSiguienteRonda.setEnabled(true);
        }
    }
    

    
    private void pasarSiguienteRonda() {
        rondaActual++;
        
        if (rondaActual == 2) {
            JOptionPane.showMessageDialog(this, 
                    "¡Pasamos a la ronda final!\n\n" + 
                    ganadores.get(0).getNombre() + " vs " + ganadores.get(1).getNombre(),
                    "Final del Torneo", 
                    JOptionPane.INFORMATION_MESSAGE);
            
            new VentanaFinal(ganadores.get(0), ganadores.get(1), bestDemons);
            
            dispose();
        }
    }
}
