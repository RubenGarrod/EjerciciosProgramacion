
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double resultado;
            System.out.print("Introduce un valor entero A: ");
            int a = sc.nextInt();
            System.out.print("Introduce otro valor entero B: ");
            int b = sc.nextInt();
            resultado = a / b;
            System.out.println("El resultado de A/B es " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar numeros enteros.");
        } catch (ArithmeticException e) {
            System.out.println("Error: no puedes dividir entre cero.");
        }    
    }    
}
