package torneobrujos;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.*;


public class VentanaFinal extends JFrame {

    private Brujo brujo1;
    private Brujo brujo2;
    private JPanel panelBrujo1;
    private JPanel panelBrujo2;
    private JButton botonGanar1;
    private JButton botonGanar2;
    private ArrayList<Demonio> bestDemons;


    
    public VentanaFinal(Brujo brujo1, Brujo brujo2, ArrayList<Demonio> bestDemons) {
        this.bestDemons = bestDemons;
        this.brujo1 = brujo1;
        this.brujo2 = brujo2;

        inicializarComponentes();
        configurarVentana();
    }

    
    private void inicializarComponentes() {
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel("GRAN FINAL DEL TORNEO DE BRUJOS");
        panelSuperior.add(labelTitulo);

        JPanel panelCentral = new JPanel(new GridLayout(1, 2, 20, 0));
        panelBrujo1 = new JPanel(new BorderLayout());

        JPanel panelBotones1 = new JPanel(new BorderLayout(5, 0));

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
        panelBrujo2 = new JPanel(new BorderLayout());

        JPanel panelBotones2 = new JPanel(new BorderLayout(5, 0));

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

        panelCentral.add(panelBrujo1);
        panelCentral.add(panelBrujo2);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
    }

 
    private void configurarVentana() {
        setTitle("Final del Torneo de Brujos");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                escribeTablaHTML();
                System.exit(0);
            }
        });
    }


    private void mostrarDetalleBrujo(Brujo brujo) {
        new VentanaDetalleBrujo(brujo);
    }


    private void declararCampeon(Brujo brujo) {
        botonGanar1.setEnabled(false);
        botonGanar2.setEnabled(false);

        Component[] componentesBrujo1 = ((JPanel) panelBrujo1.getComponent(0)).getComponents();
        Component[] componentesBrujo2 = ((JPanel) panelBrujo2.getComponent(0)).getComponents();

        JButton botonDetalle1 = (JButton) componentesBrujo1[0];
        JButton botonDetalle2 = (JButton) componentesBrujo2[0];

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
                "¡" + brujo.getNombre() + " es el campeón del torneo!\n\n"
                + "¡Felicidades!",
                "Fin del Torneo",
                JOptionPane.INFORMATION_MESSAGE);
    }

    void escribeTablaHTML() {
        
        try (
                FileWriter fw = new FileWriter("best.html", false); BufferedWriter bw = new BufferedWriter(fw);) {
            int pos = 1;
            bw.write("""
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Top Demonios</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            font-family: Arial, Helvetica, sans-serif;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>Posición</th>
            <th>Nombre</th>
            <th>Tipo</th>
            <th>Brujo</th>
            <th>Puntos</th>
        </tr>
        <tr>
                     """);
            for (Demonio demonio : bestDemons) {
                bw.write("<tr>");
                bw.write("<td>" + pos + "</td>");
                bw.write("<td>" + demonio.getNombre() + "</td>");
                bw.write("<td>" + demonio.getTipo() + "</td>");
                bw.write("<td>" + demonio.getDeBrujo() + "</td>");
                bw.write("<td>" + demonio.getPuntos() + "</td>");
                bw.write("</tr>");
                bw.flush();
                pos++;
            }
            bw.write("""
                             </tr>
                         </table>
                     </body>
                     </html>
                     """);
        } catch (Exception ex) {
            System.out.println("No se puede leer el fichero\n" + ex);
        }

    }
}
