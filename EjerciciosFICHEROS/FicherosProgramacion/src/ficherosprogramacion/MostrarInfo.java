package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class MostrarInfo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean noVacia = true;

        while (noVacia) {
            System.out.println("Introduzca una ruta absouta:  (por ejemplo, “C:/Windows” o “Documentos”)");
            String dir = sc.nextLine();
            if (!dir.isEmpty()) {
                File ruta = new File(dir);
                try {
                    muestraInfoRuta(ruta);
                } catch (Exception e) {
                    System.out.println("ERROR" + e);
                }
            } else {
                noVacia = false;
            }
        }
    }

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        File[] listaArchivos = ruta.listFiles();
        if (ruta.exists()) {
            for (int i = 0; i < listaArchivos.length; i++) {
                File tmp = listaArchivos[i];
                if (tmp.isDirectory()) {
                    System.out.println("[*] " + tmp.getName());
                } else {
                    System.out.println("[A] " + tmp.getName());
                }
            }
        } else {
            throw new FileNotFoundException();
        }
    }
}
