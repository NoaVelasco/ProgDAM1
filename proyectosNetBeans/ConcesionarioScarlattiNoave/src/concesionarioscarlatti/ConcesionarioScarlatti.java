/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionarioscarlatti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ConcesionarioScarlatti {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Clientes> clientes = new ArrayList<>();
    static ArrayList<Coches> coches = new ArrayList<>();

    public static void GenerarFicheroCoches(Scanner sc2) {
        System.out.println("Quieres introducir un nuevo coche?  ");
        String respuestaC = sc2.nextLine();

        while (respuestaC.equals("si")) {
            System.out.println("Introduce la marca: ");
            String marca = sc2.nextLine();
            System.out.println("Introduce el modelo: ");
            String modelo = sc2.nextLine();
            System.out.println("Introduce el color: ");
            String color = sc2.nextLine();
            System.out.println("Introduce la matricula: ");
            String matricula = sc2.nextLine();

            try (
                    FileWriter fw = new FileWriter("coches.txt", true); // true sirve para añadir y no sobrescribir
                     BufferedWriter bw = new BufferedWriter(fw);) {
                bw.write(marca + "; " + modelo + "; " + color + "; " + matricula + "\n");
                bw.flush();
            } catch (Exception ex) {
                System.out.println("No se puede leer el fichero\n" + ex);
            }

            System.out.println("Quieres introducir otro?");
            respuestaC = sc2.nextLine();
        }

    }

    public static void RellenarCoches() {
        try (
                FileReader fr = new FileReader("coches.txt"); BufferedReader br = new BufferedReader(fr);) {
            String line = br.readLine();
            while (line != null) {
                String[] datos = line.split("; ");
                Coches c = new Coches(datos[0], datos[1], datos[2], datos[3]);
                coches.add(c);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ConcesionarioScarlatti.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encuentra el fichero.");
        } catch (IOException ex) {
//            Logger.getLogger(ConcesionarioScarlatti.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se puede leer el fichero.");
        }

    }

    public static void GenerarFicheroClientes(Scanner sc) {

        System.out.println("Quieres introducir un nuevo cliente?  ");
        String respuesta = sc.nextLine();

        while (respuesta.equals("si")) {
            System.out.println("Introduce el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce el apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Introduce el dni: ");
            String dni = sc.nextLine();
            System.out.println("Introduce el telefono: ");
            long telefono;
            telefono = Long.parseLong(sc.nextLine());

            try (
                    FileWriter fw = new FileWriter("clientes.txt", true); // true sirve para añadir y no sobrescribir
                     BufferedWriter bw = new BufferedWriter(fw);) {
                bw.write(nombre + "; " + apellido + "; " + dni + "; " + telefono + "\n");
                bw.flush();
            } catch (Exception ex) {
                System.out.println("No se puede leer el fichero\n" + ex);
            }

            System.out.println("Quieres introducir otro?");
            respuesta = sc.nextLine();
        }

    }

    public static void RellenarClientes() {
        try (FileReader fr = new FileReader("clientes.txt");) {
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] datos = line.split("; ");
                Clientes c = new Clientes(datos[0], datos[1], datos[2], Long.parseLong(datos[3]));
                clientes.add(c);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ConcesionarioScarlatti.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encuentra el fichero.");
        } catch (IOException ex) {
//            Logger.getLogger(ConcesionarioScarlatti.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se puede leer el fichero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenerarFicheroClientes(sc);
        RellenarClientes();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
        GenerarFicheroCoches(sc);
        RellenarCoches();
        for (int i = 0; i < coches.size(); i++) {

            System.out.println(coches.get(i).toString());
        }
        GUIClientes interfaz = new GUIClientes(clientes);
        interfaz.setVisible(true);
        interfaz.setBounds(300, 300, 500, 500);

    }

}
