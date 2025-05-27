package torneobrujos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;


public class VentanaDetalleBrujo extends JFrame {
    
    private Brujo brujo;
    private JButton[] btnsDesconvoca;
    private ArrayList<Demonio> demonios;
    

    public VentanaDetalleBrujo(Brujo brujo) {
        this.brujo = brujo;
        
        inicializarComponentes();
        configurarVentana();
    }
    
 
    private void inicializarComponentes() {
        setLayout(new BorderLayout());
        
        JPanel panelInfo = new JPanel(new GridLayout(1, 1, 5, 5));
        panelInfo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelInfo.add(new JLabel("Nombre: " + brujo.getNombre()));
        
        demonios = brujo.getEquipo();
        int numDemonios = demonios.size();
        btnsDesconvoca = new JButton[numDemonios];
        
        JPanel panelDemonios = new JPanel(new BorderLayout());
        
        JPanel panelCabecera = new JPanel(new GridLayout(1, 6));
        panelCabecera.add(new JLabel("Nombre", JLabel.CENTER));
        panelCabecera.add(new JLabel("Tipo", JLabel.CENTER));
        panelCabecera.add(new JLabel("Vida", JLabel.CENTER));
        panelCabecera.add(new JLabel("Ataque", JLabel.CENTER));
        panelCabecera.add(new JLabel("Puntos", JLabel.CENTER));
        panelCabecera.add(new JLabel("Desconvocar", JLabel.CENTER));
        
        JPanel panelDatos = new JPanel(new GridLayout(numDemonios, 5, 5, 5));
        
        for (int i = 0; i < numDemonios; i++) {
            Demonio demonio = demonios.get(i);
            
            panelDatos.add(new JLabel(demonio.getNombre(), JLabel.CENTER));
            panelDatos.add(new JLabel(demonio.getTipo(), JLabel.CENTER));
            panelDatos.add(new JLabel(String.valueOf(demonio.getVida()), JLabel.CENTER));
            panelDatos.add(new JLabel(String.valueOf(demonio.getAtaque()), JLabel.CENTER));
            panelDatos.add(new JLabel(String.valueOf(demonio.getPuntos()), JLabel.CENTER));
            
            JButton btnFuera = new JButton("Despedir");
            final int indice = i;
            btnFuera.addActionListener((ActionEvent e) -> {
                desconvocaDemon(indice);
                actualizarPanel();
            });
            btnsDesconvoca[i] = btnFuera;
            panelDatos.add(btnFuera);
        }
        
        panelDemonios.add(panelCabecera, BorderLayout.NORTH);
        panelDemonios.add(panelDatos, BorderLayout.CENTER);
        
        JScrollPane scrollPane = new JScrollPane(panelDemonios);
        
        add(panelInfo, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    private void actualizarPanel() {
        dispose();
        new VentanaDetalleBrujo(brujo);
    }
    
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
