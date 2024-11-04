/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_profesor.metodos1;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class METODOS1 {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    public static void Tablademultiplicar(){
        System.out.println("Introduce el numero del cual deseas la tabla de multiplicar");
        int n= teclado.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n +"*"+i+"="+n*i);
                         
            
        }
    }
    public static void NumAleatorios(){
        int a;
        double b;
        
            System.out.println("Numeros aleatorios");
            System.out.println("Introduce la cantidad de numeros que quieres que se genere");
            a = teclado.nextInt();
            for(int i=0;i<a;i++){
                b =Math.floor(Math.random()*(1000-1)+1);
                System.out.println(b);
            }
           
       
        
    }
     public static void areas(){
         int opcion;
        do{
        System.out.println("Figuras");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Salir");
        System.out.println("");
        System.out.println("Introducir opción");
        opcion = teclado.nextInt();
         
         
        
         double area=0;
         switch(opcion){
             case 1:
                 area = circulo();
            break;
           
             case 2: 
                 area = tri();
              break;
              
             case 3:
             area=cuadrado();
             break;
             
             
              
         }
         System.out.println("El area de la figua es"+area); 
        }while(opcion !=4);
     } 
    public static double circulo (){
         System.out.println("Introduce el area"); 
           double radio=teclado.nextInt();
        return 3.14*(radio*radio);
    }
    public static double tri(){
        System.out.println("Introduce la base"); 
              double base=teclado.nextInt();
            System.out.println("Introduce la altura");  
              double altura=teclado.nextInt();
              
        return (base*altura)/2;
    }
     public static double cuadrado (){
         System.out.println("Introduce lado"); 
             double lado=teclado.nextInt();
             
         return (lado*lado);
     } 
    public static void ParImpar(){
        System.out.println("Ingrese un numero: ");
        int n = teclado.nextInt();
        if(n%2==0){
            System.out.println("El doble de el numero es: " +(n*2));
        }else
            System.out.println("El triple de el numero es: " + (n*3));
    }
    
    
    public static void main(String[] args) {
        int opcion;
        do{
        System.out.println("Menú");
        System.out.println("1. Areas");
        System.out.println("2. Numeros aleatorios");
        System.out.println("3. Par o impar");
        System.out.println("4. Tabla multiplicar");
        System.out.println("");
        System.out.println("Introducir opción");
        opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                areas();
                break;
            case 2:
                NumAleatorios();
                break;
            case 3:
                ParImpar();
                break;
            case 4:
                Tablademultiplicar();
                break;
            case 5:
                System.out.println("Hsta pronto");
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
        }while(opcion != 5);
        
        // TODO code application logic here
    }
    
}
