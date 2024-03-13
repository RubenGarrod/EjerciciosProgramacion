
package ficherosprogramacion;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class Renombrar {
    public static void main(String[] args) {
        
        //CARPETAS ORIGEN
        File f1 = new File("C:/Users/AlumnoT/Documents/Documentos");
        File f2 = new File("C:/Users/AlumnoT/Documents/Fotografias");
        File f3 = new File("C:/Users/AlumnoT/Documents/Libros");
        
        //CARPETAS DESTINO
        File f4 = new File("C:/Users/AlumnoT/Documents/DOCS");
        File f5 = new File("C:/Users/AlumnoT/Documents/FOTOS");
        File f6 = new File("C:/Users/AlumnoT/Documents/LECTURAS");
        
        f1.renameTo(f4);
        f2.renameTo(f5);
        f3.renameTo(f6);
        
        quitarExtensiones(f5);
    }
    /**
     * Metodo para recorer los archivos de una carpeta eliminando sus extensiones.
     * @param carpeta 
     */
    public static void quitarExtensiones(File carpeta){
        for (File tmp : carpeta.listFiles()) {
            String[] nombresTroceados = tmp.getName().split("\\.");
            File tmpDestino = new File(tmp.getParent() + "/" + nombresTroceados[0]);
            tmp.renameTo(tmpDestino);
        }
    }
}
