package ExamenElectro;

import java.util.Objects;

public class Television extends Electrodomestico{
    double resolucion;
    boolean sintonizadorTDT;
    final double RESOLUCION = 20;
    final boolean TDT = false;

    public Television() {
        super();
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = TDT;
    }

    public Television(double precio, double peso) {
        super(precio, peso);
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = TDT;
    }

    public Television(double precio, double peso, String color, char consumoEnerg, double resolucion, boolean sintonizadorTDT) {
        super(precio, peso, color, consumoEnerg);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void precioFinal() {
        super.precioFinal();
        if (sintonizadorTDT){precio += 50;}
        if (resolucion>40){precio *= 1.3;}
    }


}
