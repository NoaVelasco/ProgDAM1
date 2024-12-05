
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author dam1
 */
public class matrices {

    static Random rndm = new Random();
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void multiplica() {

        // 1.       Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. 
        // Los valores y la longitud, serán insertados por el usuario. Mostrar las matrices originales y el resultado.
        System.out.println("Introduce las dimensiones de la matriz 2D. Ej: '3, 2'");
        String strDimen = sc.nextLine();
        strDimen = strDimen.replace(" ", "");
        String[] arrDimen = strDimen.split(",");
        int rows = Integer.parseInt(arrDimen[0]);
        int cols = Integer.parseInt(arrDimen[1]);

        int[][] matrizA = new int[rows][cols];
        int[][] matrizB = new int[rows][cols];
        int[][] matrizC = new int[rows][cols];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.println("Introduce el valor de " + i + "-" + j + " de la primera matriz: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            System.out.println(Arrays.toString(matrizA[i]));
        }

        System.out.println("Ahora generamos la siguiente matriz de forma aleatoria");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = rndm.nextInt(10);
            }
        }

        for (int[] matrizB1 : matrizB) {
            System.out.println(Arrays.toString(matrizB1));
        }

        System.out.println("Ahora multiplicamos");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j]);
                if (j != matrizC[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void ordena() {
        // 2. Crea un array de números enteros positivos, después realiza un método que haga la ordenación del array de menor a mayor
        
        System.out.println("---------");
        System.out.println("Ordena arrays");
        int[] matrizDesOr = new int[9];
        for (int i = 0; i < matrizDesOr.length; i++) {
            int numericos = rndm.nextInt(10);
//            System.out.println(numericos);
            matrizDesOr[i] = numericos;
        }

        System.out.println(Arrays.toString(matrizDesOr));

        int menor;
        
        for (int i = 0; i < matrizDesOr.length; i++) {
            for (int j = i + 1; j < matrizDesOr.length; j++) {
                if (matrizDesOr[i] > matrizDesOr[j]) {
                    menor = matrizDesOr[j];
                    matrizDesOr[j] = matrizDesOr[i];
                    matrizDesOr[i] = menor;
                }
            }
        }
        System.out.println(Arrays.toString(matrizDesOr));

    }

    public static void main(String[] args) {
        multiplica();
        ordena();
    }

}
