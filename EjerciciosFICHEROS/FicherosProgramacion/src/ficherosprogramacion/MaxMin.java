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
            //Declarar un objeto de tipo File 
            File f = new File("C:/Users/AlumnoT/OneDrive - Educacyl/Documentos");
            //Declaramos un objeto tipo scanner
            Scanner sc = new Scanner(f);
            if (f.exists()) {
                System.out.println("El archivo existe");
            }

            while (sc.hasNextInt()) {
                numero = sc.nextInt();

                //Comprobamos si es el minimo o el maximo
                if (numero > maximo) {
                    maximo = numero;
                } else if (numero < minimo) {
                    minimo = numero;
                }
            }
            //Cerrar el archivo
            sc.close();
            //Imprimir el numero maximo y minimo
            System.out.println("El numero maximo es: " + maximo);
            System.out.println("El numero minimo es: " + minimo);
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR]");
        }
    }
}

