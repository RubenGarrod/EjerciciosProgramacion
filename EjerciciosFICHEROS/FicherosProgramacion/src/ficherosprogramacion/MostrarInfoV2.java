package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class MostrarInfoV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean noVacia = true;

        while (noVacia) {
            System.out.println("Introduzca una ruta absouta:  (por ejemplo, C:/Windows)");
            String dir = sc.nextLine();
            if (!dir.isEmpty()) {
                File ruta = new File(dir);
                try {
                    muestraInfoRuta(ruta, true);
                } catch (Exception e) {
                    System.out.println("ERROR" + e);
                }
            } else {
                noVacia = false;
            }
        }
    }

  public static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {
        File[] listaArchivos = ruta.listFiles();
        if (ruta.exists()) {
            Arrays.sort(listaArchivos); 
            for (int i = 0; i < listaArchivos.length; i++) {
                File tmp = listaArchivos[i];
                if (tmp.isDirectory()) {
                    System.out.print("[*] " + tmp.getName());
                } else {
                    System.out.print("[A] " + tmp.getName());
                }
                if (info) {
                    System.out.print("\t\t|| Tamano " + tmp.length() + " bytes" + "\t|| Modificado por ultima vez: " + new Date(tmp.lastModified()) + "||");
                }
                System.out.println();
            }
        } else {
            throw new FileNotFoundException();
        }
    }
}
