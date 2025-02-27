/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPooAvanzado;

/**
 *
 * @author dam1
 */
public class Entrenador extends Componente {

    private int numFederacion, puesto;

    public Entrenador(int numFederacion, int puesto) {
        this.numFederacion = numFederacion;
        this.puesto = puesto;
    }

    public Entrenador(int numFederacion, int puesto, int id, int edad, String nombre, String apellidos, String seleccion) {
        super(id, edad, nombre, apellidos, seleccion);
        this.numFederacion = numFederacion;
        this.puesto = puesto;
    }

    public int getNumFederacion() {
        return numFederacion;
    }

    public void setNumFederacion(int numFederacion) {
        this.numFederacion = numFederacion;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    @Override
    public int concentrarse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int viajar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int jugarPartido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
                sb.append("Entrenador. ");
        sb.append(super.toString());
        sb.append(" numFederacion=").append(numFederacion);
        sb.append(" puesto=").append(puesto);
                sb.append("\n ");
        return sb.toString();
    }

}
