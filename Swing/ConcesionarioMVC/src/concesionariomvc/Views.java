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

    /**
     * Creates new form GUIClientes
     */
//    static ArrayList<Clientes> clientes;
    ArrayList<Clientes> clientes;
    JButton comprar = new JButton("Comprar");
    JButton abril = new JButton("Cerral");

    public GUIClientes(DataMng data) {
//        initComponents();
        this.clientes = data.getClientes();

        // En lugar de crear un JFrame, ya estamos en uno (extends).
//        GridLayout gframe = new GridLayout(2, 1);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Ahora creamos un panel superior que añadiremos cuando terminemos de configurarlo
        JPanel pnlClientes = new JPanel();
        GridLayout lytPanel = new GridLayout(clientes.size() + 1, 4);
        pnlClientes.setLayout(lytPanel);

        // Añadir un fondo azul claro y borde con espacio alrededor
        pnlClientes.setBackground(new Color(200, 220, 235));
        pnlClientes.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10)); // Espacio alrededor

        // Crear fuente en negrita para los encabezados
        Font headerFont = new Font("Times New Roman", Font.BOLD, 14);

        JLabel cliNom = new JLabel("NOMBRE");
        JLabel cliApe = new JLabel("APELLIDO");
        JLabel cliDni = new JLabel("DNI");
        JLabel cliTel = new JLabel("TELEFONO");

        cliNom.setFont(headerFont);
//        cliNom.setHorizontalAlignment(JLabel.CENTER);
        cliApe.setFont(headerFont);
//        cliApe.setHorizontalAlignment(JLabel.CENTER);
        cliDni.setFont(headerFont);
//        cliDni.setHorizontalAlignment(JLabel.CENTER);
        cliTel.setFont(headerFont);
//        cliTel.setHorizontalAlignment(JLabel.CENTER);

        pnlClientes.add(cliNom);
        pnlClientes.add(cliApe);
        pnlClientes.add(cliDni);
        pnlClientes.add(cliTel);

        for (int i = 0; i < clientes.size(); i++) {
            JLabel lblNombre = new JLabel(clientes.get(i).getNombre());
//            lblNombre.setHorizontalAlignment(JLabel.CENTER);
            pnlClientes.add(lblNombre);

            JLabel lblApellido = new JLabel(clientes.get(i).getApellido());
//            lblApellido.setHorizontalAlignment(JLabel.CENTER);
            pnlClientes.add(lblApellido);

            JLabel lblDni = new JLabel(clientes.get(i).getDni());
//            lblDni.setHorizontalAlignment(JLabel.CENTER);
            pnlClientes.add(lblDni);

            JLabel lblTelefono = new JLabel(Long.toString(clientes.get(i).getTelefono()));
//            lblTelefono.setHorizontalAlignment(JLabel.CENTER);
            pnlClientes.add(lblTelefono);
        }

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.9;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;

        add(pnlClientes, gbc);

//        JButton comprar = new JButton("Comprar");
//        JButton abril = new JButton("Cerral");
        JPanel pnlBtns = new JPanel();
//        BorderLayout lytBtns = new BorderLayout();

//        pnlBtns.setLayout(lytBtns);
        pnlBtns.add(comprar);
        pnlBtns.add(abril);

        gbc.gridy = 1;
        gbc.weighty = 0.1;
        add(pnlBtns, gbc);

//        abril.addActionListener((ActionEvent e) -> {
//            if (Controlador.oneWindow) {
//                System.exit(0);
//            } else {
//                dispose();
//            }
//        });
//        comprar.addActionListener((ActionEvent e) -> {
//            JFrame coches = new JFrame();
//            coches.setVisible(true);
//        });
    }
}

class GUICoches extends javax.swing.JFrame {

    /**
     * Creates new form GUICoches
     */
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
        // Intento crear una tabla. SALE MAL
        /* Object[][] data = new Object[coches.size() + 1][5];

        for (int i = 0; i < coches.size(); i++) {
            data[i][0] = coches.get(i).marca;
            data[i][1] = coches.get(i).modelo;
            data[i][2] = coches.get(i).color;
            data[i][3] = coches.get(i).matricula;
            data[i][4] = new JButton("compra");
            System.out.println(coches.get(i).toString());
        }
        JTable cochesTabla = new JTable(data, headers);
        JScrollPane scrollPane = new JScrollPane(cochesTabla);
        cochesTabla.setFillsViewportHeight(true);
        cochesPanel.add(cochesTabla.getTableHeader());
        cochesPanel.add(cochesTabla); */
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
        if (index < btnsCompra.size() && index >= 0) {
            return btnsCompra.get(index);
        }
        return null;
    }

}
