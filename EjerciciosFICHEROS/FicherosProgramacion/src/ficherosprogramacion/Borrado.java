
package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author AlumnoT
 */
public class Borrado {
        public static void main(String[] args) {
            //Instanciamos las dos carpetas
            File f2 = new File("C:/Users/AlumnoT/Documents/Fotografias");
            File f3 = new File("C:/Users/AlumnoT/Documents/Libros");
            
            boolean respuesta = false;
            try {
                respuesta = borraTodo(f2);
                if(respuesta == true){
                    System.out.println("\nCarpeta/Fichero " + f2.getName() + " borrado con exito.");
                }
                respuesta = borraTodo(f3);
                if(respuesta == true){
                    System.out.println("\nCarpeta/Fichero " + f3.getName() + " borrado con exito.");
                }
            } catch (Exception e) {
                System.out.println("[ERROR] No hay resultados para esa ruta o no se ha podido eliminar.");
            }
        }
        /**
         * Metodo para borrar todo el contenido de un directorio.
         * @param ruta
         * @return boolean.
         * @throws java.lang.Exception
         */
        public static boolean borraTodo(File ruta) throws Exception {
            if(!ruta.exists()){
                throw new Exception("[ERROR] La ruta " + ruta.getName() + "no existe.");
                //Ahora si la ruta es de un archivo la borramos directamente.
            } else if (ruta.isFile()){
                return ruta.delete();
                //Si es una carpeta hay que comprobar si tiene archivos o carpetas dentro.
            } else if (ruta.isDirectory()){
                for (File tmp : ruta.listFiles()) {
                    borraTodo(tmp);//Usamos recursividad por si hay carpetas dentro de carpetas asi siempre lo comprobamos y no dará error.
                }
                return ruta.delete();
            } else {
                return false;
            }
        }
}
