/*
 * Plantilla básica para una ventana principal en Swing
 */
package miAplicacion;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Frame principal de la aplicación
 */
public class VentanaPrincipal extends JFrame {
    
    // Referencia al controlador
    private Controlador controlador;
    
    // Componentes principales de la interfaz
    private JPanel panelPrincipal;
    private JPanel panelBotones;
    private JPanel panelDatos;
    private JButton btnNuevo;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnBuscar;
    private JTable tablaDatos;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    
    /**
     * Constructor de la ventana principal
     * 
     * @param controlador Controlador de la aplicación
     */
    public VentanaPrincipal(Controlador controlador) {
        this.controlador = controlador;
        
        inicializarComponentes();
        configurarVentana();
        cargarDatos();
    }
    
    /**
     * Inicializa los componentes de la interfaz
     */
    private void inicializarComponentes() {
        // Configuración del layout principal
        setLayout(new BorderLayout(10, 10));
        
        // Panel principal que contendrá toda la interfaz
        panelPrincipal = new JPanel(new BorderLayout(5, 5));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Panel para los botones
        panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        // Panel para los datos
        panelDatos = new JPanel(new BorderLayout(5, 5));
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos"));
        
        // Botones de acción
        btnNuevo = new JButton("Nuevo");
        btnNuevo.addActionListener(e -> accionNuevo());
        
        btnEditar = new JButton("Editar");
        btnEditar.addActionListener(e -> accionEditar());
        
        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(e -> accionEliminar());
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(e -> accionBuscar());
        
        // Añadir botones al panel
        panelBotones.add(btnNuevo);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnBuscar);
        
        // Tabla para mostrar datos (sin modelo aún)
        tablaDatos = new JTable();
        scrollPane = new JScrollPane(tablaDatos);
        
        // Añadir tabla al panel de datos
        panelDatos.add(scrollPane, BorderLayout.CENTER);
        
        // Crear menú
        crearMenu();
        
        // Añadir componentes al panel principal
        panelPrincipal.add(panelBotones, BorderLayout.NORTH);
        panelPrincipal.add(panelDatos, BorderLayout.CENTER);
        
        // Añadir el panel principal al frame
        add(panelPrincipal);
    }
    
    /**
     * Crea la barra de menús
     */
    private void crearMenu() {
        // Barra de menú
        menuBar = new JMenuBar();
        
        // Menú Archivo
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        JMenuItem itemSalir = new JMenuItem("Salir");
        
        itemNuevo.addActionListener(e -> accionNuevo());
        itemAbrir.addActionListener(e -> accionAbrir());
        itemGuardar.addActionListener(e -> accionGuardar());
        itemSalir.addActionListener(e -> accionSalir());
        
        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);
        
        // Menú Editar
        JMenu menuEditar = new JMenu("Editar");
        JMenuItem itemCortar = new JMenuItem("Cortar");
        JMenuItem itemCopiar = new JMenuItem("Copiar");
        JMenuItem itemPegar = new JMenuItem("Pegar");
        
        menuEditar.add(itemCortar);
        menuEditar.add(itemCopiar);
        menuEditar.add(itemPegar);
        
        // Menú Ayuda
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemAcercaDe = new JMenuItem("Acerca de");
        
        itemAcercaDe.addActionListener(e -> mostrarAcercaDe());
        
        menuAyuda.add(itemAcercaDe);
        
        // Añadir menús a la barra
        menuBar.add(menuArchivo);
        menuBar.add(menuEditar);
        menuBar.add(menuAyuda);
        
        // Asignar la barra de menú al frame
        setJMenuBar(menuBar);
    }
    
    /**
     * Configura las propiedades de la ventana
     */
    private void configurarVentana() {
        setTitle("Mi Aplicación");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Añadir listener para confirmar cierre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmarSalida();
            }
        });
    }
    
    /**
     * Carga los datos en la interfaz
     */
    private void cargarDatos() {
        // Implementar para cargar datos desde el controlador
        // Por ejemplo, usando un TableModel personalizado:
        // tablaDatos.setModel(new MiTableModel(controlador.getDatos()));
    }
    
    /**
     * Acción para crear un nuevo elemento
     */
    private void accionNuevo() {
        // Mostrar diálogo para crear nuevo elemento
        // Por ejemplo: new DialogoNuevoElemento(this, controlador);
        JOptionPane.showMessageDialog(this, "Funcionalidad 'Nuevo' no implementada");
    }
    
    /**
     * Acción para editar un elemento seleccionado
     */
    private void accionEditar() {
        int filaSeleccionada = tablaDatos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            // Obtener elemento seleccionado y mostrar diálogo de edición
            // Por ejemplo: new DialogoEditarElemento(this, controlador, filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, 
                "Por favor, seleccione un elemento para editar", 
                "Editar", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     * Acción para eliminar un elemento seleccionado
     */
    private void accionEliminar() {
        int filaSeleccionada = tablaDatos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(this, 
                    "¿Está seguro de que desea eliminar este elemento?", 
                    "Confirmar eliminación", 
                    JOptionPane.YES_NO_OPTION);
            
            if (confirmacion == JOptionPane.YES_OPTION) {
                // Eliminar el elemento
                // controlador.eliminarElemento(filaSeleccionada);
                // cargarDatos(); // Recargar para reflejar cambios
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                "Por favor, seleccione un elemento para eliminar", 
                "Eliminar", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     * Acción para buscar elementos
     */
    private void accionBuscar() {
        String criterioBusqueda = JOptionPane.showInputDialog(this, 
                "Introduzca el criterio de búsqueda:", 
                "Buscar", 
                JOptionPane.QUESTION_MESSAGE);
        
        if (criterioBusqueda != null && !criterioBusqueda.isEmpty()) {
            // Realizar la búsqueda
            // ArrayList<Object> resultados = controlador.buscar(criterioBusqueda);
            // Mostrar resultados
            // tablaDatos.setModel(new MiTableModel(resultados));
        }
    }
    
    /**
     * Acción para abrir un archivo
     */
    private void accionAbrir() {
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);
        
        if (resultado == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            // File archivo = fileChooser.getSelectedFile();
            // controlador.cargarDesdeArchivo(archivo);
            // cargarDatos();
        }
    }
    
    /**
     * Acción para guardar datos
     */
    private void accionGuardar() {
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showSaveDialog(this);
        
        if (resultado == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            // File archivo = fileChooser.getSelectedFile();
            // controlador.guardarEnArchivo(archivo);
        }
    }
    
    /**
     * Acción para salir de la aplicación
     */
    private void accionSalir() {
        confirmarSalida();
    }
    
    /**
     * Confirma la salida de la aplicación
     */
    private void confirmarSalida() {
        int confirmacion = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea salir?", 
                "Confirmar salida", 
                JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Guardar datos si es necesario
            // controlador.guardarDatos();
            System.exit(0);
        }
    }
    
    /**
     * Muestra información sobre la aplicación
     */
    private void mostrarAcercaDe() {
        JOptionPane.showMessageDialog(this, 
                "Mi Aplicación\nVersión 1.0\n\nDesarrollado por: Tu nombre", 
                "Acerca de", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Muestra un mensaje de información
     * 
     * @param mensaje Mensaje a mostrar
     * @param titulo Título de la ventana
     */
    public void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Muestra un mensaje de error
     * 
     * @param mensaje Mensaje a mostrar
     * @param titulo Título de la ventana
     */
    public void mostrarError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
}
