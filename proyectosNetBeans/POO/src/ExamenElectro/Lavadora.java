package ExamenElectro;

import java.util.Objects;

public class Lavadora extends Electrodomestico{
    double carga;
    final double CARGA_DEF = 5;

    public Lavadora() {
        super();
        this.carga = CARGA_DEF;
    }

    public Lavadora(double precio, double peso) {
        super(precio, peso);
        this.color = COLOR_DEF;
        this.consumoEnerg = ENER_DEF;
        this.carga = CARGA_DEF;
    }

    public Lavadora(double precio, double peso, String color, char consumoEnerg, double carga) {
        super(precio, peso, color, consumoEnerg);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {precio += 50;}
    }


}
