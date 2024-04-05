package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class Diccionario {

    public static void main(String[] args) throws Exception {
        File rutaNueva = new File("C:\\Users\\AlumnoT\\Documents\\Diccionario");
        boolean res = rutaNueva.mkdir();
        if (res) {
            
            /*
            
            for (char i = 'a'; i <= 'z'; i++) {
                String letra = Character.toString(i);
                File nuevoDir = new File(rutaNueva.getAbsolutePath(), letra);
                try {
                    nuevoDir.mkdir();
                    System.out.println("Directorio creado: " + nuevoDir.getAbsolutePath());
                } catch (Exception e) {
                    System.out.println("[ERROR] no se ha podido crear el directorio.");
                }
            } */
            try {

                // Crear una coleccion o lista para guardad las palabras leidas del dicionario
                ArrayList<String> palabrasDic = new ArrayList<>();

                // Inicializamos y declaramos un objeto de tipo File
                File diccionario = new File("C:/Users/AlumnoT/Documents/Diccionario/diccionario.txt");

                // Declaramos un scanner para poder leer el archivo
                Scanner sc = new Scanner(diccionario);

                // Tendremos que guardar cada palabra que leeamos del Fichero la guardamos en nuesta coleccion
                while (sc.hasNext()) {
                    palabrasDic.add(sc.nextLine());
                }

                // Cerramos el archivo de lectura
                sc.close();

                
                for (char tmp= 'a'; tmp <= 'z'; tmp++){
                FileWriter letra = new FileWriter(new File("C:/Users/AlumnoT/Documents/Diccionario" + "/" + tmp +  ".txt")); 
             
                    // Recorrer la lista de palabras 
                    for (String p : palabrasDic) {
                        if (p.toLowerCase().startsWith(Character.toString(tmp))) {
                            letra.write(p + "\n");
                        }
                    }
                    letra.close();
                }
            } catch (FileNotFoundException e) {
                System.err.println("[ERROR]  ");
            } catch (IOException e) {
                System.err.println("[ERROR] ");
            } catch (Exception e) {
                System.err.println("[ERROR] ");
            }
        } else {
            System.out.println("[ERROR] no se ha podido crear el directorio.");
        }
    }
}
