/*
Copiado de Jdoodle
*/

import java.util.Scanner;

public class switches {
  public static void main(String args[]) {

    Scanner teclado = new Scanner(System.in);

    // CONDICIONALES SWITCH
    System.out.print("Introduce el numero o la letra del dia de la semana: ");
    String dia = teclado.next();
    // System.out.println(dia);
    switch (dia.charAt(0)) {
      case '1':
      case 'l':
        System.out.println("Hoy es lunes :(((");
        break;
      case '2':
      case 'm':
        System.out.println("Hoy es martes :((");
        break;
      case '3':
      case 'x':
        System.out.println("Hoy es miercoles :(");
        break;
      case '4':
      case 'j':
        System.out.println("Hoy es jueves :|");
        break;
      case '5':
      case 'v':
        System.out.println("Hoy es viernes :)");
        break;
      case '6':
      case 's':
        System.out.println("Hoy es sábado :DDD");
        break;
      case '7':
      case 'd':
        System.out.println("Hoy es domingo :/");
        break;
      default:
        System.out.println("Eso no es un dia");
    }
  }
}