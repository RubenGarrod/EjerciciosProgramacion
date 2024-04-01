package simulacionterminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;

/**
 * Clase que proporciona los metodos para gestionar los archivos en la
 * simulacion del terminal. Incluye los metodos necesarios para: cambiar de
 * directorio, crear directorios, listar archivos, borrar archivos y
 * directorios, y mover archivos.
 *
 * @author AlumnoT
 */
public class MiniFileManager {

    /**
     * Cambia el directorio actual a la ruta especificada.
     *
     * @param ruta la ruta del nuevo directorio
     * @param referencia el directorio actual
     * @return el nuevo directorio actual
     */
    public File changeDir(String ruta, File referencia) {
        if (ruta.equals("..")) {
            if (referencia.getParent() != null) {
                return new File(referencia.getParent());
            }
        } else {
            File aux = new File(referencia.getAbsolutePath() + "/" + ruta);
            if (!aux.exists()) {
                System.out.println("[ERROR] Ruta no valida.");
            } else {
                System.out.println(aux.getAbsolutePath());
                return aux;
            }
        }
        return referencia;
    }

    /**
     * Crea un nuevo directorio en la ubicación especificada.
     *
     * @param dir el nombre del nuevo directorio
     * @param referencia el directorio en el que se generara el nuevo directorio
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
     * @param ruta el directorio a borrar
     * @return true si el directorio fue borrado exitosamente, false en caso
     * contrario
     * @throws java.lang.Exception si ocurre un error durante la operación de
     * borrado
     */
    public boolean borraTodo(File ruta) throws Exception {
        if (!ruta.exists()) {
            throw new Exception("[ERROR] La ruta " + ruta.getName() + " no existe.");
        }
        if (ruta.isDirectory()) {
            File[] listaFiles = ruta.listFiles();
            if (listaFiles != null) {
                for (File tmp : listaFiles) {
                    if (tmp.isDirectory()) {
                        throw new Exception("[ERROR] La carpeta " + ruta.getName() + " contiene subcarpetas");
                    } else {
                        if (!tmp.delete()) {
                            throw new Exception("[ERROR] No se pudo borrar el archivo " + tmp.getName());
                        }
                    }
                }
            }
        }
        return ruta.delete();
    }

    /**
     * Imprime la lista de archivos y directorios en la ubicacion proporcionada
     * al metodo.
     *
     * @param info indica si se debe incluir información adicional sobre los
     * archivos (tamaño y fecha de modificación)
     * @param ruta la ubicación de la que se listarán los archivos y directorios
     * @throws FileNotFoundException si la ruta especificada no existe
     */
    void printList(boolean info, File ruta) throws FileNotFoundException {
        File[] listaArchivos = ruta.listFiles();
        if (ruta.exists()) {
            Arrays.sort(listaArchivos, (i, j) -> {
                if (i.isDirectory() && !j.isDirectory()) {
                    return -1; //Ficheros 
                } else if (!i.isDirectory() && j.isDirectory()) {
                    return 1; //Archivos
                } else {
                    return i.getName().compareToIgnoreCase(j.getName()); //Si son iguales alfabeticamente
                }
            });

            for (File tmp : listaArchivos) {
                if (tmp.isDirectory()) {
                    System.out.println("[*] " + tmp.getName());
                } else {
                    System.out.println("[A] " + tmp.getName());
                }
                if (info) {
                    System.out.println("\t\t|| Tamaño " + tmp.length() + " bytes" + "\t|| Modificado por última vez: " + new Date(tmp.lastModified()));
                }
            }
        } else {
            throw new FileNotFoundException();
        }
    }

    /**
     * Mueve un archivo de una direccion a otra, ambas proporcionadas por el
     * usuario al llamar al metodo.
     *
     * @param ruta1 la ruta del archivo a mover
     * @param ruta2 la ruta de destino para el archivo
     * @param referencia el directorio en el que se encuentra el archivo
     * @return true si el archivo fue movido correctamente, false en caso
     * contrario
     */
    public boolean moverArchivo(String ruta1, String ruta2, File referencia) {
        File origen = new File(referencia.getAbsolutePath() + "/" + ruta1);
        File destino = new File(referencia.getAbsolutePath() + "/" + ruta2);

        if (!origen.exists()) {
            System.out.println("[ERROR] No se ha encontrado el archivo " + ruta1);
            return false;
        }

        if (destino.exists()) {
            System.out.println("[ERROR] El archivo de destino " + ruta2 + " ya existe.");
            return false;
        }

        return origen.renameTo(destino);
    }
}
