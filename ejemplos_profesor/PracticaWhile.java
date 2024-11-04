/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_profesor;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class PracticaWhile {

    public static void main(String[] args) {
        // TODO code applicat    Scanner teclado= new Scanner (System.in); 
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int suma=0;
        do{
        System.out.println("seleccione la opcion que desea ejecutar");
        System.out.println("menu; ");
        System.out.println("Sumatorio hasta número dado.(5) ");
      
        System.out.println("Pida un año y nos diga nuestro horóscopo chino. (3)");
         System.out.println("Pide tu fecha de nacimiento y nos diga los años, meses y días que tenemos.(2) ");
        System.out.println("salir del menu (4) ");
        
        
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("esta opcion no correspone a ninguna del menu");
            case 2:
                System.out.println("introduce tu fecha de nacimiento: ");
                int dia = teclado.nextInt();
                int mes = teclado.nextInt();
                int año = teclado.nextInt();
                int diaactual = 2;
                int mesactual = 11;
                int añoactual = 2023;

                if (diaactual < dia) {
                    diaactual = diaactual + 30;

                    mes++;
                }
                if (mes == 12) {

                    año++;
                    mes = 0;
                }
                System.out.println((diaactual - dia) + " dias " + (mesactual - mes) + " meses " + (añoactual - año) + " años");
                break;
            case 3:
             System.out.println("Dime tu año");
             int año2 = teclado.nextInt();
             int añochino = (año2-4)%12;
             switch(añochino){
                 case 0:
                 System.out.println("Rata"); 
                 break;
                 case 1:
                 System.out.println("Buey"); 
                 break;    
                 case 2:
                 System.out.println("Tigre"); 
                 break;   
                 case 3:
                 System.out.println("Conejo"); 
                 break;  
                 case 4:
                 System.out.println("Dragon"); 
                 break;   
                 case 5:
                 System.out.println("Serpiente"); 
                 break; 
                 case 6:
                 System.out.println("Caballo"); 
                 break;   
                 case 7:
                 System.out.println("Cabra"); 
                 break;   
                 case 8:
                 System.out.println("Mono"); 
                 break;  
                 case 9:
                 System.out.println("Gallo"); 
                 break;   
                 case 10:
                 System.out.println("Perro"); 
                 break;  
                 case 11:
                 System.out.println("Cerdo"); 
                 break;   
                 
                     
             }
            case 5:
                System.out.println("hasta que numero deseas sumar?");
                int numero=teclado.nextInt();
                for (int i=1;i<=numero;i++){
                   suma+=i;
                }
                    
                System.out.println("la suma es= "+suma);
            case 4 :
                System.out.println("ha salido del menu ");
                break;
        }
        }while(opcion!=4);
    }
}
