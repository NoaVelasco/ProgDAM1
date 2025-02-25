package Animales;

public class Gato extends Felino {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
            System.out.println("Gato nada");
    }

    @Override
    public void caminar() {
        System.out.println("Gato camina");
    }

}
