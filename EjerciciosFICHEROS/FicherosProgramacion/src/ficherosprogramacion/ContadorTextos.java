
package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class ContadorTextos {
    public static void main(String[] args) {
        try {
            //Instancia y scanner con el archivo
            File capitulo = new File("C:/Users/AlumnoT/Documents/quijote.txt");
            Scanner sc = new Scanner(capitulo);
            
            //Contadores
            int numLineas = 0;
            int numPalabras = 0;
            int numCaracteres = 0;
            
            //HasMap
            HashMap<String,Integer> hashPalabras = new HashMap<>();
            
            //Leer linea por linea
            while(sc.hasNext()){
                //LECTURA DE LINEAS Y CONTEO
                String linea = sc.nextLine();
                numLineas++;
                
                //SEPARACION DE LINEAS EN PALABRAS Y CONTEO
                String[] palabras = linea.split(" "); //Separamos las lineas por espacios
                numPalabras += palabras.length;
                
                //CONTEO DE CARACTERES
                for (String p : palabras) {
                    char[] caracteres = p.toCharArray();//Cogemos cada palabra la dividimos en caracteres y los vamos metiendo en un Char Array
                    numCaracteres += caracteres.length;
                    
                    //COMPROBACION DE LA PALABRA
                    if(hashPalabras.containsKey(p)){
                        //Si ya existe una palabra aumentamos conteo
                        hashPalabras.put(p,hashPalabras.get(p)+1);
                    } else {
                        //Si es la primera vez que aparece la palabra
                        hashPalabras.put(p,1);
                    }
                }
            }
            

            System.out.println("--------------------------------------------------------------------------------------");
            System.out.printf("%s%25s%25s","Numero de lineas","Numero de palabras", "Numero de caracteres\n");
            System.out.printf("%d%25d%23d",numLineas,numPalabras, numCaracteres);
            System.out.println("\n--------------------------------------------------------------------------------------");
            
            // ORDENAR las palabras en el HashMap por frecuencia
            List<HashMap.Entry<String, Integer>> listaPalabras = new ArrayList<>(hashPalabras.entrySet());
            listaPalabras.sort((a, b) -> b.getValue().compareTo(a.getValue()));
            
            // IMPRIMIR las 10 primeras palabras de lista ya ordenada con el formato anterior
            System.out.printf("%s%20s\n", "Palabra", "Frecuencia");
            System.out.println("--------------------------------------------------------------------------------------");
            for (int i = 0; i < Math.min(10, listaPalabras.size()); i++) {
                HashMap.Entry<String, Integer> entrada = listaPalabras.get(i);
                System.out.printf("%5s%20d\n", entrada.getKey(), entrada.getValue());
            }
            System.out.println("--------------------------------------------------------------------------------------");
        } catch(FileNotFoundException e) {
            System.err.println("[ERROR] Archivo no encontrado.");
        }
    }
}
