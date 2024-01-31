package exceptions;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class ejercicio3 {

    public static void main(String[] args) {
        double[] array = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            boolean valido = false;

            do {
                try {
                    System.out.print("Introduce el valor para la posicion " + (i + 1) + " : ");
                    array[i] = sc.nextDouble();
                    valido = true;
                } catch (Exception e) {
                    System.out.println("Recuerda que debe ser un numero.");
                    sc.nextLine();
                }
            } while (!valido);
        }

        System.out.println("El vector es: " + Arrays.toString(array));
    }
}
