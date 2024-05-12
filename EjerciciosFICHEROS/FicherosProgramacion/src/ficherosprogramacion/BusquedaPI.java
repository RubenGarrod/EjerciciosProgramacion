package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class BusquedaPI {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Itroduce el numero que quieres comprobar: ");
        String num = sc.nextLine();
        sc.close();

        try {
            File archivoPi = new File("C:/Users/AlumnoT/Documents/pi.txt");
            Scanner sf = new Scanner(archivoPi);
            String decimales = sf.nextLine();

            if (decimales.contains(num)) {
                System.out.println("El numero " + num + " se encuentra entre los decimales de pi");
            } else {
                System.out.println("El numero " + num + " no se encuentra entre los decimales de pi");
            }
            sf.close();
        } catch (FileNotFoundException e) {
            System.err.println("[ERROR] Archivo no encontrado.");
        }
    }
}
