package ficherosprogramacion;

import java.io.File;

/**
 *
 * @author AlumnoT
 */
public class FicherosProgramacion {

    public static void main(String[] args) {
        //Declaracion de dos rutas absolutas 
        File carpetaAbsoluta = new File("C:/Users/AlumnoT/Documents/NetBeansProjects");
        File archivoAbsoluto = new File("C:/Users/AlumnoT/Desktop/ruben.txt");
        //Declaracion de dos rutas relativas
        File carpetaRelativa = new File("cosasextrañas");
        File archivoRelativo = new File("cosasextrañas/prueba");

        //mostrar las rutas y su nombre
        mostrarRutas(carpetaAbsoluta);
        mostrarRutas(archivoAbsoluto);
        mostrarRutas(carpetaRelativa);
        mostrarRutas(archivoRelativo);
        File dir = new File("C:/Users/AlumnoT");
        File[] listaArchivos = dir.listFiles();
        System.out.println("Contenido de la carpeta " + dir.getAbsolutePath() + " :");

        for (int i = 0; i < listaArchivos.length; i++) {
            File tmp = listaArchivos[i];
            if (tmp.isDirectory()) {
                System.out.println("DIR " + tmp.getName());
            } else {
                System.out.println("ARCHIVO " + tmp.getName());
            }
        }
    }

    public static void mostrarRutas(File f) {
        System.out.println("getParent(): " + f.getParent());
        System.out.println("getName(): " + f.getName());
        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
    }

    public static void mostrarEstado(File f) {
        System.out.println("");
        System.out.println(f.getAbsolutePath() + " ¿existe ? " + f);
    }
}
