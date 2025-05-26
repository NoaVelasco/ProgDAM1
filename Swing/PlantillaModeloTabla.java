/*
 * Modelo de tabla personalizado para aplicaciones Swing
 */
package miAplicacion;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Modelo de tabla personalizado para mostrar datos en una JTable
 * Debes personalizar este modelo según las necesidades específicas de tu aplicación
 */
public class ModeloTabla extends AbstractTableModel {
    
    // Lista de objetos a mostrar
    private ArrayList<?> datos;
    
    // Nombres de las columnas
    private String[] nombreColumnas = {"ID", "Nombre", "Descripción", "Valor"};
    
    /**
     * Constructor del modelo de tabla
     * 
     * @param datos Lista de datos a mostrar
     */
    public ModeloTabla(ArrayList<?> datos) {
        this.datos = datos;
    }
    
    @Override
    public int getRowCount() {
        return datos.size();
    }
    
    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }
    
    @Override
    public String getColumnName(int columna) {
        return nombreColumnas[columna];
    }
    
    @Override
    public Object getValueAt(int fila, int columna) {
        // Aquí debes personalizar la obtención de valores según tu modelo de datos
        // Ejemplo con un objeto genérico
        Object obj = datos.get(fila);
        
        switch (columna) {
            case 0: // ID
                return fila + 1; // Un simple ID basado en la posición
            case 1: // Nombre
                // Ejemplo: return ((MiObjeto)obj).getNombre();
                return "Nombre " + fila;
            case 2: // Descripción
                // Ejemplo: return ((MiObjeto)obj).getDescripcion();
                return "Descripción del elemento " + fila;
            case 3: // Valor
                // Ejemplo: return ((MiObjeto)obj).getValor();
                return Math.random() * 100;
            default:
                return "N/A";
        }
    }
    
    @Override
    public boolean isCellEditable(int fila, int columna) {
        // Determina qué celdas son editables
        // Por defecto, ninguna es editable
        return false;
    }
    
    @Override
    public void setValueAt(Object valor, int fila, int columna) {
        // Implementar si hay celdas editables
        // Ejemplo:
        /*
        Object obj = datos.get(fila);
        switch (columna) {
            case 1: // Nombre
                ((MiObjeto)obj).setNombre((String)valor);
                break;
            case 2: // Descripción
                ((MiObjeto)obj).setDescripcion((String)valor);
                break;
            case 3: // Valor
                ((MiObjeto)obj).setValor((Double)valor);
                break;
        }
        */
        
        // Notificar cambio
        fireTableCellUpdated(fila, columna);
    }
    
    /**
     * Obtiene el objeto de una fila específica
     * 
     * @param fila Índice de la fila
     * @return Objeto en esa fila
     */
    public Object getElementoAt(int fila) {
        if (fila >= 0 && fila < datos.size()) {
            return datos.get(fila);
        }
        return null;
    }
    
    /**
     * Actualiza los datos del modelo
     * 
     * @param nuevosDatos Nuevos datos a mostrar
     */
    public void actualizarDatos(ArrayList<?> nuevosDatos) {
        this.datos = nuevosDatos;
        fireTableDataChanged();
    }
}
