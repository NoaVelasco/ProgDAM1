/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3eva;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Controlador {

    public final String RUTA_DATOS = "datos";
    private ArrayList<Empleado> datos;


    public Controlador() {
        datos = new ArrayList<>();
    }

    public void inicializar() {
        cargarDatos(RUTA_DATOS);


    }

    private void cargarDatos(String ruta) {

        try (
                FileReader fr = new FileReader(ruta + ".txt"); BufferedReader br = new BufferedReader(fr);) {

            String line = br.readLine();
            while (line != null) {
                String[] extraction = line.split("#");
//                ### dni # nombre # ape1 # anyonac ###fijo # factura # percent
                String dni = extraction[1].trim();
                String nombre = extraction[2];
                String ape = extraction[3];
                String[] datoDoble = extraction[4].trim().split(" ");
                int anio = Integer.parseInt(datoDoble[0].trim());
                Double fijo = Double.parseDouble(datoDoble[1]);
                Double factura = Double.parseDouble(extraction[5]);
                Double porcentaje = Double.parseDouble(extraction[6]);

                Empleado e = new Empleado(dni, nombre, ape, anio, fijo, factura, porcentaje);
                datos.add(e);

                // 🐞🐞🐞 DEPURAR
//                System.out.println(e.toString());
//                for (int i = 0; i < datos.length; i++) {
//
//                    System.out.println(i + " - " + datos[i]);
//                }

                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero. Asegúrate de que tienes un fichero 'datos.txt' válido en el directorio raíz.");
            System.exit(0);
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero. Asegúrate de que tienes un fichero 'datos.txt' válido en el directorio raíz.");
            System.exit(0);
        }
        System.out.println("vamos");
    }

    void filtraTotal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de corte: ");
        int nominaMin = Integer.parseInt(sc.nextLine());
        ArrayList<Empleado> seleccionados = new ArrayList<>();

        for (Empleado e : datos) {
            if (e.getTotal() >= nominaMin) {
                seleccionados.add(e);
            }
        }

        escribeTablaHTML(seleccionados);

    }

    void escribeTablaHTML(ArrayList<Empleado> selec) {

        try (
                FileWriter fw = new FileWriter("empleados.html", false); BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write("""
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Top Demonios</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            font-family: Arial, Helvetica, sans-serif;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>DNI</th>
            <th>TOTAL</th>
        </tr>
        <tr>
                     """);
            for (Empleado emp : selec) {
                bw.write("<tr>");
                bw.write("<td>" + emp.getDni() + "</td>");
                bw.write("<td>" + emp.getTotal() + "</td>");
                bw.write("</tr>");
                bw.flush();
            }
            bw.write("""
                             </tr>
                         </table>
                     </body>
                     </html>
                     """);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero.");
        } catch (IOException ex) {
            System.out.println("No se puede escribir en el fichero.");
        }

    }

    public ArrayList<Empleado> getDatos() {
        return datos;
    }
}
