
package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class ContadorTextos {
    public static void main(String[] args) {
        try {
        
            File capitulo = new File("C:/Users/AlumnoT/Documents/quijote.txt");
            Scanner sc = new Scanner(capitulo);
            
            //Contadores
            int numLineas = 0;
            int numPalabras = 0;
            int numCaracteres = 0;
            
            //HasMap
            HashMap<String,Integer> hashPalabras = new HashMap<String, Integer>();
            
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
            System.out.printf("%1s%25s%25s","Numero de lineas","Numero de palabras", "Numero de caracteres\n");
            System.out.printf("%1d%25d%23d",numLineas,numPalabras, numCaracteres);
            System.out.println("\n--------------------------------------------------------------------------------------\n");
        } catch(FileNotFoundException e) {
            System.err.println("[ERROR]");
        }
    }
}
