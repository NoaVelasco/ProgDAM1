/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author noave
 */
public class Vistas {

}

class TFrame extends JFrame {

    JPanel jPanelArriba = new JPanel();
    JButton jButtonFase = new JButton("Siguiente fase");
    JPanel jPanelTorneo = new JPanel();
    static int fase = 2;
    static int duelos = 0;

    Data datos;

    public TFrame(Data data) {
        this.datos = data;

//        GroupLayout jPanelArribaLayout = new GroupLayout(jPanelArriba);
//        jPanelArriba.setLayout(jPanelArribaLayout);
        add(jPanelArriba, BorderLayout.PAGE_START);
        jButtonFase.setEnabled(false);
        jPanelArriba.add(jButtonFase);

        createWarlocksPnls();
        fillPanels();
    }

    
    private void createWarlocksPnls(){
        for (Brujo brujo : datos.clasifBrujos) {
            JButton btnBrujo = new JButton(brujo.getNombre());
            JButton btnGana = new JButton("Gana");
            JPanel pnlBrujo = new JPanel();
            
            
            btnGana.addActionListener((ActionEvent e) -> {
                switch (fase) {
                    case 2:
                        brujo.setSemifinalista(true);
                        btnGana.setEnabled(false);
                        pnlBrujo.setBackground(Color.GREEN);
                        duelos++;
                        break;
                    case 1:
                        brujo.setFinalista(true);
                        btnGana.setEnabled(false);
                        pnlBrujo.setBackground(Color.GREEN);
                        duelos++;
                        break;
                    default:
                        throw new AssertionError();
                }

                checkMatch();

            });
            pnlBrujo.add(btnBrujo);
            pnlBrujo.add(btnGana);
        }
    }
    
    void checkMatch() {
        
    }
    
    private void fillPanels() {
        if (fase != 0) {

            GridLayout lytBrujos = new GridLayout(1, 2);

            for (int i = 0; i < datos.clasifBrujos.size(); i++) {

                JPanel pnlBrujo = new JPanel();
                JLabel lblBrujo = new JLabel(datos.clasifBrujos.get(i).getNombre());
                // crear boton y añadirlo al arraylist btnGanaBrujo
            }

            for (int i = 0; i < datos.clasifBrujos.size() / 2; i++) {
                JPanel panelBrujos = new JPanel();
                panelBrujos.setLayout(lytBrujos);

            }
        }
    }
}
