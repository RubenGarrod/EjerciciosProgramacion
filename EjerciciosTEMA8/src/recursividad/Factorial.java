
package recursividad;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author AlumnoT
 */
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean esEntero = false;
        do {
            System.out.println("Sobre que numero deseas calcular el factorial?");
            try {
                n = sc.nextInt();
                esEntero = true;
            } catch (InputMismatchException e){
                System.out.println("[ERROR] Debes ingresar un entero.");
                sc.nextLine();//buffer
            }
        } while (!esEntero);
        System.out.println(calculoFactorial(n));
    }
    public static int calculoFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n*calculoFactorial(n-1);
        }
    }
}
