/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionariomvc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author noave
 */
class Clientes {

    String nombre;
    String apellido;
    String dni;
    long telefono;

    public Clientes(String nombre, String apellido, String dni, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public static void setList(Scanner sc) {
        // Se encarga de añadir clientes al fichero clientes.txt hasta que el usuario diga no.
        String respuesta;
        System.out.print("Quieres introducir un nuevo cliente? ");
        respuesta = sc.nextLine();

        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Introduce el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce el apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Introduce el dni: ");
            String dni = sc.nextLine();
            System.out.println("Introduce el telefono: ");
            long telefono;
            telefono = Long.parseLong(sc.nextLine());

            // Hacemos un try con recursos para escribir en el fichero clientes.txt 
            // y cerrar el flujo al terminar.
            try (
                FileWriter fw = new FileWriter("clientes.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);) {
                bw.write(nombre + ";" + apellido + ";" + dni + ";" + telefono + "\n");
                bw.flush();
            } catch (Exception ex) {
                System.out.println("No se puede leer el fichero\n" + ex);
            }

            System.out.print("Quieres introducir un nuevo cliente? ");
            respuesta = sc.nextLine();
        }
    }

    // Creo que esto no lo necesitamos para el ejercicio. ----------------------------------
/*     public static void refreshClients(ArrayList<Clientes> clientes) {
        try (FileWriter fw = new FileWriter("clientes.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Clientes cliente : clientes) {
                bw.write(cliente.getNombre() + ";");
                bw.write(cliente.getApellido() + ";");
                bw.write(cliente.getDni() + ";");
                bw.write(cliente.getTelefono() + "\n");
                bw.flush();
            }

        } catch (Exception ex) {
            System.out.println("No se puede leer el fichero\n" + ex);
        }
    } */

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public long getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono + '}';
    }

}

class Coches {

    String marca;
    String modelo;
    String color;
    String matricula;

    public Coches(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }

    public static void setList(Scanner sc) {
        // Se encarga de añadir coches al fichero coches.txt hasta que el usuario diga no.
        String respuesta;
        System.out.print("Quieres introducir un nuevo coche? ");
        respuesta = sc.nextLine();

        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Introduce la marca: ");
            String marca = sc.nextLine();
            System.out.println("Introduce el modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Introduce el color: ");
            String color = sc.nextLine();
            System.out.println("Introduce la matricula: ");
            String matricula = sc.nextLine();

            // Hacemos un try con recursos para escribir en el fichero coches.txt
            // y cerrar el flujo al terminar.
            try (
                FileWriter fw = new FileWriter("coches.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);) {
                bw.write(marca + ";" + modelo + ";" + color + ";" + matricula + "\n");
                bw.flush();
            } catch (Exception ex) {
                System.out.println("No se puede leer el fichero\n" + ex);
            }

            System.out.print("Quieres introducir un nuevo coche? ");
            respuesta = sc.nextLine();
        }

    }

    public static void refreshFileCars(ArrayList<Coches> coches) {
        // Se encarga de refrescar el fichero coches.txt con los coches que hay en el arraylist coches.
        try (FileWriter fw = new FileWriter("coches.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Coches coche : coches) {
                bw.write(coche.getMarca() + ";");
                bw.write(coche.getModelo() + ";");
                bw.write(coche.getColor() + ";");
                bw.write(coche.getMatricula() + "\n");
                bw.flush();
            }

        } catch (Exception ex) {
            System.out.println("No se puede leer el fichero\n" + ex);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Coches{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula + '}';
    }

}
