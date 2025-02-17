/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Plantilla {

    Empleado[] listaEmp;
    Scanner sc = new Scanner(System.in);

    public Plantilla() {
    }

    public void contrata(int nEmps) {
        this.listaEmp = new Empleado[nEmps];
        for (int i = 0; i < nEmps; i++) {
            System.out.println("Tipo de empleado: ");
            String tipo = sc.nextLine();
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println("Anio: ");
            int anio = Integer.parseInt(sc.nextLine());
            System.out.println("Salario: ");
            double salario = Double.parseDouble(sc.nextLine());

            switch (tipo.toLowerCase()) {
                case "comercial":
                    System.out.println("Comision: ");
                    double comision = Double.parseDouble(sc.nextLine());
                    this.listaEmp[i] = new Comercial(comision, nombre, edad, salario, anio);
                    break;
                case "repartidor":
                    String zona = sc.nextLine();
                    System.out.println("Zona: ");
                    this.listaEmp[i] = new Repartidor(zona, nombre, edad, salario, anio);
                    break;
                default:
                    throw new AssertionError();
            }
            this.listaEmp[i].plus();
        }
    muestraPlantilla();
    }
    
    public void muestraPlantilla(){
        for (Empleado empleado : listaEmp) {
            empleado.toString();
        }
    }
    
}
