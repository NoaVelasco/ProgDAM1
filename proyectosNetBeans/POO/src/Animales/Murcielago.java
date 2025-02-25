package Animales;

public class Murcielago extends Mamifero implements PuedeVolar, PuedeCaminar{
    public Murcielago(String nombre) {
        super(nombre);
    }

    @Override
    public void caminar() {
        System.out.println("Murcielago caminando");
    }

    @Override
    public void volar() {
        System.out.println("Murcielago volando");
    }
}
