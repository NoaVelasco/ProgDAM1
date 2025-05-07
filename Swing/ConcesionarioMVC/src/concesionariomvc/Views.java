/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionariomvc;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author noave
 */
public class Views {
}

class GUIClientes extends javax.swing.JFrame {

    // Podría usar directamente el ArrayList de DataMng, pero me parece más fácil de ver así.
    ArrayList<Clientes> clientes;
    JButton comprar = new JButton("Comprar");
    JButton abril = new JButton("Cerral");

    public GUIClientes(DataMng data) {
//        initComponents(); // ESTO YA NO LO USO
        this.clientes = data.getClientes();

        
        // En lugar de crear un JFrame, ya estamos en uno (extends).
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Ahora creamos un panel superior que añadiremos cuando terminemos de configurarlo
        JPanel pnlClientes = new JPanel();
        GridLayout lytPanel = new GridLayout(clientes.size() + 1, 4);
        pnlClientes.setLayout(lytPanel);

        pnlClientes.setBackground(new Color(200, 220, 235)); // Añadir un fondo azul claro
        pnlClientes.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10)); // Espacio alrededor

        // Crear fuente en negrita para los encabezados
        Font headerFont = new Font("Times New Roman", Font.BOLD, 14);

        JLabel cliNom = new JLabel("NOMBRE");
        JLabel cliApe = new JLabel("APELLIDO");
        JLabel cliDni = new JLabel("DNI");
        JLabel cliTel = new JLabel("TELEFONO");

        cliNom.setFont(headerFont);
        cliApe.setFont(headerFont);
        cliDni.setFont(headerFont);
        cliTel.setFont(headerFont);

        pnlClientes.add(cliNom);
        pnlClientes.add(cliApe);
        pnlClientes.add(cliDni);
        pnlClientes.add(cliTel);

        // Añadir los clientes al panel
        for (int i = 0; i < clientes.size(); i++) {
            JLabel lblNombre = new JLabel(clientes.get(i).getNombre());
            pnlClientes.add(lblNombre);

            JLabel lblApellido = new JLabel(clientes.get(i).getApellido());
            pnlClientes.add(lblApellido);

            JLabel lblDni = new JLabel(clientes.get(i).getDni());
            pnlClientes.add(lblDni);

            JLabel lblTelefono = new JLabel(Long.toString(clientes.get(i).getTelefono()));
            pnlClientes.add(lblTelefono);
        }

        // Esto es configuración de GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.9;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;

        add(pnlClientes, gbc);

        JPanel pnlBtns = new JPanel();

        pnlBtns.add(comprar);
        pnlBtns.add(abril);

        gbc.gridy = 1;
        gbc.weighty = 0.1;
        add(pnlBtns, gbc);

    }
}

class GUICoches extends javax.swing.JFrame {

    ArrayList<Coches> coches;
    private ArrayList<JButton> btnsCompra;

    public GUICoches(DataMng data) {
        this.coches = data.getCoches();
        btnsCompra = new ArrayList<>();

        setBounds(600, 100, 700, 700);
        JPanel cochesPanel = new JPanel();
        cochesPanel.setLayout(new GridLayout(coches.size() + 1, 5));

        cochesPanel.setBackground(new Color(240, 248, 255));
        cochesPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] headers = {"MARCA", "MODELO", "COLOR", "MATRICULA", "COMPRAR"};

        for (String header : headers) {
            JLabel headerLabel = new JLabel(header);
            headerLabel.setHorizontalAlignment(JLabel.CENTER);
            cochesPanel.add(headerLabel);
        }

        for (int i = 0; i < coches.size(); i++) {
            cochesPanel.add(new JLabel(coches.get(i).getMarca(), JLabel.CENTER));
            cochesPanel.add(new JLabel(coches.get(i).getModelo(), JLabel.CENTER));
            cochesPanel.add(new JLabel(coches.get(i).getColor(), JLabel.CENTER));
            cochesPanel.add(new JLabel(coches.get(i).getMatricula(), JLabel.CENTER));

            JButton btn = new JButton("compra");
            btnsCompra.add(btn);  // añadir al arraylist para referenciar
            cochesPanel.add(btn);
        }
        add(cochesPanel);
    }

    public JButton getBtnCompra(int index) {
        // Devuelve el botón de compra en la posición index del arraylist btnsCompra
        // Si el índice está fuera de rango, devuelve null.
        if (index < btnsCompra.size() && index >= 0) {
            return btnsCompra.get(index);
        }
        return null;
    }

}
