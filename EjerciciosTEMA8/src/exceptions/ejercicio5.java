package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class ejercicio5 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;

            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Introduzca un numero positivo: ");
                    numero = sc.nextInt();
                    imprimePositivo(numero);
                    System.out.println("Introduzca un numero negativo: ");
                    numero = sc.nextInt();
                    imprimeNegativo(numero);
                } catch (InputMismatchException e) {
                    System.out.println("[ERROR] No se ha introducido un NUMERO VALIDO");
                    sc.nextLine();
                } catch (Exception e) {
                    //System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }

    public static void imprimePositivo(int p) throws Exception {
        if (p <= 0) {
            throw new Exception("[ERROR] No es un numero positivo.");
        }
        System.out.println("El numero " + p + " es POSITIVO");
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("[ERROR] No es un numero negativo.");
        }
        System.out.println("El numero " + n + " es NEGATIVO");
    }
}
