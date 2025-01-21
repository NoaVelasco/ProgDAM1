/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author dam1
 */
public class Persona {

    String nombre;
    String apellidos;
    int edad;
    double peso;
    double altura;

    int imc;
    boolean mayorDeEdad;

    final int IMCLOW = -1;
    final int IMCMED = 0;
    final int IMCHIGH = 1;

    Direccion[] direccion;

    public int calcularIMC() {
        int output;

        double formula = this.peso / Math.pow(this.altura, 2);

        if (formula < 20) {
            output = IMCLOW;
        } else if (formula > 25) {
            output = IMCHIGH;
        } else {
            output = IMCMED;
        }
        this.imc = output;
        return output;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    @Override
    public String toString() {
        String output;
        output = nombre + " " + "apellidos";
        if (mayorDeEdad) {
            output += " es mayor de edad";
        } else {
            output += " es menor de edad";
        }

        switch (imc) {
            case -1 -> {
                output += ". Está por debajo de su peso ideal.";
            }
            case 0 -> {
                output += ". Está en su peso ideal.";
            }
            case 1 -> {
                output += ". Está por encima de su peso ideal.";
            }
        }

        return output;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, int edad, double peso, double altura, Direccion[] direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.direccion = direccion;
        this.imc = calcularIMC();
        this.mayorDeEdad = esMayorDeEdad();
    }

}
