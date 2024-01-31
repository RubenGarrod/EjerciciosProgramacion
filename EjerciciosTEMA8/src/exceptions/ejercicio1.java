package exceptions;

import java.util.Scanner;

import java.util.InputMismatchException;

/**
 *
 * @author alumnot
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un valor entero: ");
            int a = sc.nextInt();
            System.out.println("Valor introducido correcto: " + a);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto. Debe ser un numero entero.");
        }
    }
}
