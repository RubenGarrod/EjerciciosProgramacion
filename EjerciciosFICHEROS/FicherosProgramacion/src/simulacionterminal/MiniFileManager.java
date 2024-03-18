package simulacionterminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author AlumnoT
 */
public class MiniFileManager {

    /**
     *
     * @param ruta
     * @param referencia
     * @return
     */
    public boolean changeDir(String ruta, File referencia) {
        if (ruta.equals("..")) {
            if (referencia.getParent() != null) {
                referencia = new File(referencia.getParent());
                return true;
            }
        } else {
            File aux = new File(referencia.getAbsolutePath() + "/" + ruta);
            if (!aux.exists()) {
                System.out.println("[ERROR] Ruta no valida.");
            } else {
                referencia = aux;
                System.out.println(referencia.getAbsolutePath());
            }
        }
        return false;
    }

    /**
     *
     * @param dir
     * @param referencia
     */
    public void mkDir(String dir, File referencia) {
        File nuevoDir = new File(referencia.getAbsolutePath(), dir);
        try {
            nuevoDir.mkdir();
            System.out.println("Directorio creado: " + nuevoDir.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("[ERROR] no se ha podido crear el directorio.");
        }
    }

    /**
     * Metodo para borrar todo el contenido de un directorio, excepto si
     * contiene subcarpetas.
     *
     * @param ruta
     * @return boolean.
     * @throws java.lang.Exception
     */
    public boolean borraTodo(File ruta) throws Exception {
        if (!ruta.exists()) {
            throw new Exception("[ERROR] La ruta " + ruta.getName() + "no existe.");
            //Ahora si la ruta es de un archivo la borramos directamente.
        } else if (ruta.isFile()) {
            return ruta.delete();
            //Si es una carpeta hay que comprobar si tiene archivos o carpetas dentro.
        } else if (ruta.isDirectory()) {
            for (File tmp : ruta.listFiles()) {
                if (ruta.isFile()) {
                    tmp.delete();
                } else {
                    throw new Exception("[ERROR] La ruta " + ruta.getName() + "contiene subcarpetas.");
                }
            }
            return ruta.delete();
        } else {
            return false;
        }
    }

    /**
     *
     * @param info
     * @param ruta
     * @throws FileNotFoundException
     */
    void printList(boolean info, File ruta) throws FileNotFoundException {
        File[] listaArchivos = ruta.listFiles();
        Arrays.sort(listaArchivos);
        if (ruta.exists()) {
            Arrays.sort(listaArchivos);
            for (int i = 0; i < listaArchivos.length; i++) {
                File tmp = listaArchivos[i];
                if (tmp.isDirectory()) {
                    System.out.println("[*] " + tmp.getName());
                } else {
                    System.out.println("[A] " + tmp.getName());
                }
                if (info) {
                    System.out.println("\t\t|| Tamano " + tmp.length() + " bytes" + "\t|| Modificado por ultima vez: " + new Date(tmp.lastModified()) + "||");
                }
                System.out.println();
            }
        } else {
            throw new FileNotFoundException();
        }
    }
    
    public boolean moverArchivo(String ruta1, String ruta2, File referencia){
        File origen = new File(referencia.getAbsolutePath() + "/" + ruta1);
        File destino = new File(referencia.getAbsolutePath()+ "/" + ruta2);
        
        if(!origen.exists()){
            System.out.println("[ERROR] No se ha encontrado el archivo");
        }
        return origen.renameTo(destino);
    }
}
