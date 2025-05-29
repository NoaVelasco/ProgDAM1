/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3eva;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class VentanaPrincipal extends JFrame {

    // Referencia al controlador
    private Controlador controlador;

    // Componentes principales de la interfaz
    private JPanel panelPrincipal;
    private JPanel panelBotones;
    private JPanel panelEncabezados;

    ArrayList<Empleado> listEmp;

    public VentanaPrincipal(Controlador controlador) {
        this.controlador = controlador;
        this.listEmp = controlador.getDatos();
        inicializarComponentes();
        configurarVentana();

    }

    private void inicializarComponentes() {
        // Configuración del layout principal
        // BorderLayout acepta parámetros: gap hor, gap ver
        BorderLayout lytMain = new BorderLayout(10, 10);
        setLayout(lytMain);

        GridLayout grdEnc = new GridLayout(1, 5, 10, 10);
        panelEncabezados = new JPanel(grdEnc);
        Font headerFont = new Font("Arial", Font.BOLD, 14);

        JLabel empNom = new JLabel("NOMBRE");
        JLabel empApe = new JLabel("APELLIDO");
        JLabel empDni = new JLabel("DNI");
        JLabel empNac = new JLabel("AÑO DE NAC");
        JLabel empVac = new JLabel("");

        empNom.setFont(headerFont);
        empApe.setFont(headerFont);
        empDni.setFont(headerFont);
        empNac.setFont(headerFont);

        panelEncabezados.add(empNom);
        panelEncabezados.add(empApe);
        panelEncabezados.add(empDni);
        panelEncabezados.add(empNac);
        panelEncabezados.add(empVac);

        panelBotones = new JPanel();

        GridLayout grdEmp = new GridLayout(controlador.getDatos().size(), 5, 10, 10);
        panelPrincipal = new JPanel(grdEmp);
        // -----------------------------------------------------------

        for (int i = 0; i < listEmp.size(); i++) {
            JLabel nombre = new JLabel(listEmp.get(i).getNombre());
            JLabel ape = new JLabel(listEmp.get(i).getApe());
            JLabel dni = new JLabel(listEmp.get(i).getDni());
            JLabel nac = new JLabel(listEmp.get(i).getAnio() + "");

            panelPrincipal.add(nombre);
            panelPrincipal.add(ape);
            panelPrincipal.add(dni);
            panelPrincipal.add(nac);

            JButton calcTotal = new JButton("C.TOTAL");

            final int INDEX = i;
            calcTotal.addActionListener((ActionEvent e) -> {
                listEmp.get(INDEX).calcTotal();
                System.out.println(listEmp.get(INDEX).toString());
            });
            panelPrincipal.add(calcTotal);

        }
        JButton sortDni = new JButton("ORDENAR POR DNI");
        JButton sortNac = new JButton("ORDENAR POR NAC");

        panelBotones.add(sortDni);
        panelBotones.add(sortNac);

        // -----------------------------------------------------------
        add(panelEncabezados, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.SOUTH);
        add(panelPrincipal, BorderLayout.CENTER);

//        add(panelPrincipal);
        // Añadir el panel principal al frame
        // Botones de acción
//        btnNuevo = new JButton("Nuevo");
//        
//        btnEditar = new JButton("Editar");
//        
//        btnEliminar = new JButton("Eliminar");
//        
//        btnBuscar = new JButton("Buscar");
//        btnNuevo.addActionListener(e -> accionNuevo());
//        btnEditar.addActionListener(e -> accionEditar());
//        btnEliminar.addActionListener(e -> accionEliminar());
//        btnBuscar.addActionListener(e -> accionBuscar());
        // Añadir botones al panel
//        panelBotones.add(btnNuevo);
//        panelBotones.add(btnEditar);
//        panelBotones.add(btnEliminar);
//        panelBotones.add(btnBuscar);
        // Tabla para mostrar datos (sin modelo aún)
//        tablaDatos = new JTable();
//        scrollPane = new JScrollPane(tablaDatos);
        // Añadir tabla al panel de datos
//        panelEncabezados.add(scrollPane, BorderLayout.CENTER);
    }

    private void configurarVentana() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
}
