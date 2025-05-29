/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formularioddr;




public class Profesor extends Persona {
    double salario;
    boolean fijo;

    
    public Profesor() {
    }

    public Profesor(double salario, boolean fijo, String dni, String nombre) {
        super(dni, nombre);
        this.salario = salario;
        this.fijo = fijo;
    }

    public double calcSalarioFinal(int retencionIRPF, int antiguedad){
        return salario - (salario * retencionIRPF/100) + (antiguedad*50);
    }
    
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFijo() {
        return fijo;
    }

    public void setFijo(boolean fijo) {
        this.fijo = fijo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 29 * hash + (this.fijo ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        return this.fijo == other.fijo;
    }

    

    @Override
    public String toString() {
        return super.toString() + ", salario: " + salario + ", fijo: " + fijo;
    }
    
    
}
