/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheroobjetos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class FicheroObjetos {

    private static void RellenarClientes() {
        try {
            FileInputStream fis = new FileInputStream("clientes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

//            Clientes c1 = (Clientes) ois.readObject();  // hay que castearlo como Clientes porque lee un Objeto
//            clientes.add(c1);
//            Clientes c2 = (Clientes) ois.readObject(); 
//            clientes.add(c2);
            while (true) {
                try {
                    Clientes cliente = (Clientes) ois.readObject();  // hay que castearlo como Clientes porque lee un Objeto
                    clientes.add(cliente);
                } catch (EOFException e) {
                    System.out.println("Fin del archivo");
                    break;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra");
        } catch (IOException ex2) {
            System.out.println("No se pudo leer");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo leer la clase");
        }
    }
    /**
     * @param args the command line arguments
     */

    static ArrayList<Clientes> clientes = new ArrayList<>();

    static void EscribirFichero(Clientes c1, Clientes c2) {

        try {
            FileOutputStream fos = new FileOutputStream("clientes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el fichero");
        } catch (IOException ioEx) {
            System.out.println("No se pudo leer el fichero");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Clientes c1 = new Clientes("Nombre", "Apellido", "dni2323", 654654654);
        Clientes c2 = new Clientes("OtroNombre", "OtroApellido", "Otrodni2323", 498732321);

        EscribirFichero(c1, c2);
        RellenarClientes();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }

}
