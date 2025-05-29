package formularioddr;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame {

    // Referencia al controlador
    private Controlador controlador;

    // Componentes principales de la interfaz
    private JPanel panelPrincipal;
    private JPanel panelBotones;
    private JPanel panelDatos;
    private JButton btnNuevo;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JButton btnBuscar;
    private JTable tablaDatos;
    private JScrollPane scrollPane;

    public VentanaPrincipal(Controlador controlador) {
        this.controlador = controlador;

        inicializarComponentes();
        configurarVentana();

    }

    private void inicializarComponentes() {
        // Configuración del layout principal
        // BorderLayout acepta parámetros: gap hor, gap ver
        setLayout(new BorderLayout(10, 10));

        // Panel principal que contendrá toda la interfaz
        panelPrincipal = new JPanel(new BorderLayout(5, 5));

        // Panel para los botones
        panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Panel para los datos
        panelDatos = new JPanel(new BorderLayout(5, 5));
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos"));

        // Botones de acción
        btnNuevo = new JButton("Añadir");
        btnLimpiar = new JButton("Limpiar");
        btnBuscar = new JButton("Buscar");
        btnSalir = new JButton("Salir");

//        btnNuevo.addActionListener(e -> accionNuevo());
//        btnEditar.addActionListener(e -> accionLimpiar());
//        btnBuscar.addActionListener(e -> accionBuscar());
//        btnEliminar.addActionListener(e -> accionSalir());

        // Añadir botones al panel
        panelBotones.add(btnNuevo);
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnSalir);
        panelBotones.add(btnBuscar);

        // Tabla para mostrar datos (sin modelo aún)
        tablaDatos = new JTable();
        scrollPane = new JScrollPane(tablaDatos);

        // Añadir tabla al panel de datos
        panelDatos.add(scrollPane, BorderLayout.CENTER);

        // Añadir componentes al panel principal
        panelPrincipal.add(panelBotones, BorderLayout.NORTH);
        panelPrincipal.add(panelDatos, BorderLayout.CENTER);

        // Añadir el panel principal al frame
        add(panelPrincipal);

        GridLayout grShow = new GridLayout(2, 1, 20, 20);
        GridLayout grShow3 = new GridLayout(3, 2, 20, 20);
        GridLayout grShow1 = new GridLayout(3, 1);
        JPanel muestraDatos = new JPanel(grShow);
        JPanel muestra3 = new JPanel(grShow3);
        JPanel muestra1 = new JPanel(grShow1);

        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblDni = new JLabel("DNI");
        JLabel lblSalario = new JLabel("Salario");

        JTextField txtNombre = new JTextField();
        JTextField txtDni = new JTextField();
        JTextField txtSalario = new JTextField();

        muestra3.add(lblNombre);
        muestra3.add(txtNombre);
        muestra3.add(lblDni);
        muestra3.add(txtDni);
        muestra3.add(lblSalario);
        muestra3.add(txtSalario);

        muestraDatos.add(muestra3);

        ButtonGroup buttonGroup1 = new ButtonGroup();

        JLabel contrato = new JLabel("Tipo de contrato");
        JRadioButton jRadioButton1 = new JRadioButton();
        JRadioButton jRadioButton2 = new JRadioButton();

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Fijo");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No fijo");

        muestra1.add(contrato);
        muestra1.add(jRadioButton1);
        muestra1.add(jRadioButton2);
        muestraDatos.add(muestra1);
        panelDatos.add(muestraDatos);

    }

    private void configurarVentana() {
        setTitle("Aplicación__");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
