package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class MaxMin {

    public static void main(String[] args) {
        //Declaramos las variables
        int maximo = 0;
        int minimo = 0;
        int numero = 0;

        try {
            File f = new File("C:/Users/AlumnoT/Documents/numeros.txt");
            Scanner sc = new Scanner(f);
            if (f.exists()) {
                System.out.println("El archivo existe");
            }

            while (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > maximo) {
                    maximo = numero;
                } else if (numero < minimo) {
                    minimo = numero;
                }
            }
            sc.close();

            System.out.println("El numero maximo es: " + maximo);
            System.out.println("El numero minimo es: " + minimo);
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR]");
        }
    }
}
