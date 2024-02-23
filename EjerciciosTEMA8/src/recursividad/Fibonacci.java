package recursividad;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean esEntero = false;
         do {
            System.out.println("Que posicion de la serie de Fibonacci deseas conocer?");
            try {
                n = sc.nextInt();
                esEntero = true;
            } catch (InputMismatchException e) {
                System.out.println("[ERROR] Debes ingresar un entero.");
                sc.nextLine();//buffer
            }
        } while (!esEntero);
        System.out.println(calculoFibonacci(n - 1));
        System.out.println("\n");
        serieFibonacci(n);
    }

    public static int calculoFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calculoFibonacci(n - 1) + calculoFibonacci(n - 2);
        }
    }
    
    public static void serieFibonacci(int n){
        int[] serie = new int[n];
        for (int i = 0; i < serie.length; i++) {
            serie[i] = calculoFibonacci(i);
        }
        System.out.println(Arrays.toString(serie));
    }
}
