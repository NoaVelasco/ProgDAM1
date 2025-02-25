package Animales;

public class Loro extends Ave implements PuedeCaminar, PuedeVolar{
    public Loro(String nombre) {
        super(nombre);
    }


    @Override
    public void caminar() {
        System.out.println("Loro camina");
    }

    @Override
    public void volar() {
        System.out.println("Loro vuela");
    }
}
