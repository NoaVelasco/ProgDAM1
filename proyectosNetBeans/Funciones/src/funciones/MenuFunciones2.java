/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

//import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class MenuFunciones {

//    static DecimalFormat formato = new DecimalFormat("0.000");
    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void Suma(int a, int b) {
        System.out.println(a + b);
    }

    public static void Resta(int a, int b) {
        System.out.println(a - b);
    }

    public static void Multiplica(int a, int b) {
        System.out.println(a * b);
    }

    public static void Divide(int a, int b) {
        double resultado;
        if (b != 0) {
            resultado = (double) a / (double) b;
            System.out.println(resultado);
        } else {
            System.out.println("No puedes dividir entre 0.");
        }
    }

    public static void Mod(int a, int b) {
        System.out.println(a % b);
    }

    public static void Operacion(int a, int b, String orden) {
        switch (orden) {
            case "sumar":
                Suma(a, b);
                break;
            case "restar":
                Resta(a, b);
                break;
            case "multiplicar":
                Multiplica(a, b);
                break;
            case "dividir":
                Divide(a, b);
                break;
            case "modulo":
                Mod(a, b);
                break;

            default:
                System.out.println("Repite la operación.");
        }
    }

    public static void Binarizar(int numero) {
        int division = numero;
        String resultado = "";
        while (division / 2 >= 1) {
            if (division % 2 == 0) {
                resultado = 0+resultado;
            } else {
                resultado = 1+resultado;
            }
            division = division / 2;
        } 
        resultado = division + resultado;
        System.out.println(resultado);
    }

    public static void Menu() {
        int opcion = 0;
        while (opcion != 5) {

            switch (opcion) {
                case 0:
                    System.out.println("""
                                       Elige una opcion: 
                                       1. Operaciones Aritmeticas
                                       2. Decimal a binario
                                       3. Descuentos 
                                       4. Precio del hardware
                                       5. Salir""");
                    opcion = input.nextInt();
                    break;
                case 1:
                    System.out.println("OPERACIONES ARITMETICAS");
                    System.out.print("Dame el primer numero: ");
                    int num1 = input.nextInt();
                    System.out.print("Dame el segundo numero: ");
                    int num2 = input.nextInt();
                    System.out.print("Que operacion quieres realizar con ellos? \n(sumar, restar, multiplicar, dividir, modulo): ");
                    String operacion = input.next().toLowerCase();
                    Operacion(num1, num2, operacion);
                    opcion = 0;
                    break;
                case 2:
                    System.out.print("Dame el numero decimal: ");
                    int numDec = input.nextInt();
                    Binarizar(numDec);
                    opcion = 0;
                    break;
//                case 3:
//                    System.out.print("Numeros pares/impares. Introduce un numerico: ");
//                    dobleTriple(input.nextInt());
//                    opcion = 0;
//                    break;
//                case 4:
//                    System.out.print("Tabla de multiplicar. Introduce un numerico: ");
//                    multiplica(input.nextInt());
//                    opcion = 0;
//                    break;
                default:
                    System.err.println("Vuelve a intentarlo.");
                    opcion = 0;
            }
        }
        System.out.println("Hasta luego.");
    }

    public static void main(String[] args) {
        Menu();
    }

}
