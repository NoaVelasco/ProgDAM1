package ExamenElectro;

import java.util.Objects;

public abstract class Electrodomestico implements Comprobaciones, Comparable<Electrodomestico> {
    double precio, peso;
    String color;
    char consumoEnerg;
    String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
    final double PRECIO_DEF = 100, PESO_DEF = 5;
    final String COLOR_DEF = "blanco";
    final char ENER_DEF = 'F';

    public Electrodomestico() {
        this.precio = PRECIO_DEF;
        this.peso = PESO_DEF;
        this.color = COLOR_DEF;
        this.consumoEnerg = ENER_DEF;
    }

    public Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumoEnerg = ENER_DEF;
    }

    public Electrodomestico(double precio, double peso, String color, char consumoEnerg) {
        this.precio = precio;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnerg = comprobarConsumoEnergetico(consumoEnerg);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(char consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    @Override
    public char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        return letra >= 'A' && letra <= 'F' ? letra : 'F';
    }

    @Override
    public String comprobarColor(String color) {
        for (String colorDisponible : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                return color;
            }
        }
        return COLOR_DEF;
    }

    @Override
    public void precioFinal() {
        double suma = 0;
        switch (consumoEnerg) {
            case 'F':
                suma += 10;
            case 'E':
                suma += 30;
            case 'D':
                suma += 50;
            case 'C':
                suma += 60;
            case 'B':
                suma += 80;
            case 'A':
                suma += 100;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + consumoEnerg);
        }

        if (peso >= 0 && peso <= 19) {
            suma += 10;
        } else if (peso >= 20 && peso <= 49) {
            suma += 50;
        } else if (peso >= 50 && peso <= 79) {
            suma += 80;
        } else {
            suma += 100;
        }
        precio += suma;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Electrodomestico that = (Electrodomestico) o;
        return Double.compare(precio, that.precio) == 0 && consumoEnerg == that.consumoEnerg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, consumoEnerg);
    }

    @Override
    public int compareTo(Electrodomestico o) {
        return Double.compare(this.peso, o.peso);
    }
}
