/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class operaciones_switch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Dame otro: ");
        int num2 = teclado.nextInt();
        System.out.print("Que operacion quieres hacer con ellos?: ");
        String orden = teclado.next();
        
        switch (orden.toLowerCase()) {
            case "suma": case "sumar":
                System.out.println(num1 +"+"+ num2 + "="+(num1+num2));
                break;
            case "resta": case "restar":
                System.out.println(num1 +"-"+ num2 + "="+(num1-num2));
                break;
            case "multiplica": case "multiplicar":
                System.out.println(num1 +"*"+ num2 + "="+(num1*num2));
                break;
            case "divide": case "dividir":
                System.out.println(num1 +"/"+ num2 + "="+(num1/num2));
                break;
            case "modulo":
                System.out.println(num1 +"%"+ num2 + "="+(num1%num2));
                break;
            default:
                System.out.println("Escribe bien la orden, campeon.");
        }
    }
}
