package ficherosprogramacion;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class FicherosProgramacion {

    public static final int num_palabras = 10;

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

        try {
            //Intentamos abrir el archivo
            //Instanciamos un objeto file con la ruta absoluta
            File file = new File("C:/Users/AlumnoT/Documents/FicheroNumeros.txt");
            if (file.exists()) {
                System.out.println("El archivo Existe.");
                //Abrimos el archivo con un scanner
                Scanner sc = new Scanner(file);

                //Leemos los 10 numeros
                for (int i = 0; i < num_palabras; i++) {
                    int num = sc.nextInt();
                    System.out.println("El numero leido es: " + num);
                }

                //Cerramos el archivo
                sc.close();
            } else {
                System.out.println("[ERROR] El archivo no existe");
                System.exit(0);
            }

        } catch (Exception e) {
            System.out.println("[ERROR] " + e);
        }
        
        try{
            //Instancia
            //queremos escribir
            File file = new File("C:/Users/AlumnoT/Documents/FicheroNumeros.txt");
            FileWriter fw = new FileWriter(file,true);
            
            int valor = 1;
            
            for (int i = 0; i < 20; i++) {
                fw.write(""+ valor);
                fw.write(" ");
                valor = valor*2;
            }
            fw.write("\n");
        }catch (Exception e){
            System.out.println("[ERROR] " + e);
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
