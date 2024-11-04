/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

//import java.text.DecimalFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class MenuFunciones2 {

    static DecimalFormat formato = new DecimalFormat("0.00");
    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static int Suma(int a, int b) {
        return (a + b);
    }

    public static int Resta(int a, int b) {
        return (a - b);
    }

    public static int Multiplica(int a, int b) {
        return (a * b);
    }

    public static double Divide(int a, int b) {
        double resultado;
        if (b != 0) {
            resultado = (double) a / (double) b;
            return resultado;
        } else {
            System.out.println("No puedes dividir entre 0.");
            return 0.0;
        }
    }

    public static int Mod(int a, int b) {
        return (a % b);
    }

    public static void Operacion(int a, int b, String orden) {
        switch (orden) {
            case "sumar":
                System.out.println(Suma(a, b));
                break;
            case "restar":
                System.out.println(Resta(a, b));
                break;
            case "multiplicar":
                System.out.println(Multiplica(a, b));
                break;
            case "dividir":
                System.out.println(Divide(a, b));
                break;
            case "modulo":
                System.out.println(Mod(a, b));
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
                resultado = 0 + resultado;
            } else {
                resultado = 1 + resultado;
            }
            division = division / 2;
        }
        resultado = division + resultado;
        System.out.println(resultado);
    }

    public static void Descuentitos(String nombre, String producto, double precioUni, int unidades) {
        double descuento = 1.0;
        System.out.print("Hola, " + nombre + ". Has comprado " + unidades + " " + producto);
        if (precioUni > 1) {
            System.out.print("s");
        }
        System.out.print(" a " + formato.format(precioUni) + " euros por unidad.\n");
        if (unidades * precioUni > 1000) {
            descuento = 0.80f;
            System.out.println("Tienes un descuento!");
        }
        System.out.println("El precio total es " + formato.format((unidades * precioUni) * descuento) + ".");
    };
    
    public static void Hardwariza (String modelo, double precio) {
        String extra;
        if (precio > 320) {
            precio *= 1.16;
            extra = "Tienes un recargo del 16 % porque cuesta mas de 320 euros.";
        } else {
            precio += 10;
            extra = "Tienes un recargo de 10 euros por conceptos de movilidad.";
        }
        System.out.println("Tu " + modelo + " cuesta en total " + formato.format(precio) + " euros.");
        System.out.println(extra);
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
                    input.nextLine();
//                    opcion = Integer.parseInt(input.nextLine());
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
                    System.out.println("BINARIZAR");
                    System.out.print("Dame el numero decimal: ");
                    int numDec = input.nextInt();
                    Binarizar(numDec);
                    opcion = 0;
                    break;
                case 3:
                    System.out.println("DESCUENTOS");
                    System.out.println("Di tu nombre: ");
                    String meImportaUnaM = input.nextLine();
                    System.out.println("Que producto has comprado: ");
                    String meImportaDos = input.nextLine();
                    System.out.println("Dime el precio por unidad: ");
                    double precioUni = input.nextDouble();
                    System.out.println("Cuantos has comprado: ");
                    int unidades = input.nextInt();
                    Descuentitos(meImportaUnaM, meImportaDos, precioUni, unidades);
                    opcion = 0;
                    break;
                case 4:
                    System.out.println("HARDWARE");
                    System.out.print("Introduce el nombre del componente: ");
                    String nombreComp = input.nextLine();
                    System.out.print("Introduce la marca del componente: ");
                    input.nextLine();
                    System.out.print("Introduce el precio del componente: ");
                    double precioHW = input.nextDouble();

                    Hardwariza(nombreComp, precioHW);
                    opcion = 0;
                    break;
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
