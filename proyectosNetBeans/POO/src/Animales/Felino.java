package Animales;

public class Felino extends Mamifero implements PuedeCaminar, PuedeNadar {
    public Felino(String nombre) {
        super(nombre);
    }

    @Override
    public void caminar() {
        System.out.println("Caminando felino");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando felino");
    }
}
