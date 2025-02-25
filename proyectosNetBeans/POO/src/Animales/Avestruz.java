package Animales;

public class Avestruz extends Ave implements PuedeCaminar{

    public Avestruz(String nombre) {
        super(nombre);
    }

    @Override
    public void caminar() {
        System.out.println("Avesturz Caminando...");
    }
}
