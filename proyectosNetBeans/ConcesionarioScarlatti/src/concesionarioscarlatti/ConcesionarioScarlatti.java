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
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ds098
 */
public class ConcesionarioScarlatti {
    
  static  ArrayList<Clientes> clientes = new ArrayList<Clientes>();

    /**
     * @param args the command line arguments
     */
    public static void GenerarFicheroClientes() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quieres introducir un nuevo cliente");
        String respuesta = teclado.nextLine();

        while (respuesta.equals("si")) {
            System.out.println("Introduce el nombre");
            String nombre = teclado.nextLine();
            System.out.println("Introduce el apellido");
            String apellido = teclado.nextLine();
            System.out.println("INtroduce el dni");
            String dni = teclado.nextLine();
            System.out.println("INtroduce el telefono");
            long telefono = teclado.nextLong();

            try {
                FileWriter fw = new FileWriter("clientes.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(nombre + ";" + apellido + ";" + dni + ";" + telefono+"\n");
           
                bw.flush();
            } catch (IOException ex) {
                System.out.println("No se puede leer el fichero");
            }

            System.out.println("Quieres introducir un nuevo cliente");
            respuesta = teclado.nextLine();
            respuesta = teclado.nextLine();

        }

    }
    
    public static void RellenarClientes(){
        
      try {
          FileReader fr = new FileReader("clientes.txt");
          BufferedReader br = new BufferedReader(fr);
          String linea = br.readLine();
          while(linea!=null){
              String[] datos = linea.split(";");
              Clientes c = new Clientes(datos[0],datos[1],datos[2],Long.parseLong(datos[3]));
              clientes.add(c);
              linea = br.readLine();
          }
      } catch (FileNotFoundException ex) {
          System.out.println("No se encuentra el fichero");
      } catch (IOException ex) {
          System.out.println("No se puede leer fichero");
      }
        
    }

    public static void main(String[] args) {

        GenerarFicheroClientes();
        RellenarClientes();
        
        GUIClientes interfaz = new GUIClientes(clientes);
        interfaz.setBounds(300, 300, 500, 500);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // TODO code application logic here
    }

}
