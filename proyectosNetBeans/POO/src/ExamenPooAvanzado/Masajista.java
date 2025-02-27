/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPooAvanzado;

/**
 *
 * @author dam1
 */
public class Masajista extends Componente{
    private String titulacion;
    private int aniosExp;

    public Masajista(String titulacion, int aniosExp) {
        this.titulacion = titulacion;
        this.aniosExp = aniosExp;
    }

    public Masajista(String titulacion, int aniosExp, int id, int edad, String nombre, String apellidos, String seleccion) {
        super(id, edad, nombre, apellidos, seleccion);
        this.titulacion = titulacion;
        this.aniosExp = aniosExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
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
        sb.append("Masajista. ");
        sb.append(super.toString());
        sb.append(" titulacion=").append(titulacion);
        sb.append(" aniosExp=").append(aniosExp);
        sb.append("\n");
        return sb.toString();
    }

    
}
