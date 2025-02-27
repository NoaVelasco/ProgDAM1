/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPooAvanzado;

/**
 *
 * @author dam1
 */
public abstract  class Componente {
    private int id, edad;
    private String nombre, apellidos, seleccion;

    public Componente() {
    }

    public Componente(int id, int edad, String nombre, String apellidos, String seleccion) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.seleccion = seleccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    
    public abstract int concentrarse();
    public abstract int entrenar();
    public abstract int viajar();
    public abstract int jugarPartido();
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" nombre=").append(nombre);
        sb.append(" apellidos=").append(apellidos);
        sb.append(" id=").append(id);
        sb.append(" edad=").append(edad);
        sb.append(" seleccion=").append(seleccion);
        return sb.toString();
    }
    
    
}
