package simulacionterminal;

import java.io.File;
import static java.lang.Compiler.command;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class Terminal {

    public static void main(String[] args) throws Exception {
        Scanner command = new Scanner(System.in);
        String[] opcion;
        boolean info;
        MiniFileManager fm = new MiniFileManager();
        File referencia = new File("C:\\Users\\AlumnoT\\Documents");

        do {
            System.out.print("\nAlumnoT@ubuntu:~$");
            opcion = (command.nextLine()).split(" ");
            switch (opcion[0].toLowerCase()) {
                case "pwd": {
                    System.out.println("\nCarpeta actual: " + referencia.getAbsolutePath());
                }
                case "cd":  {
                    if (opcion.length > 2) {
                        String nuevaRuta = "";
                        for (int i = 1; i < opcion.length; i++) {
                            nuevaRuta += opcion[i] + " ";
                        }
                        fm.changeDir(nuevaRuta, referencia);
                    }
                    break;
                }
                case "ls": {
                    info = false;
                    fm.printList(info, referencia);
                    break;
                }
                case "ll": {
                    info = true;
                    fm.printList(info, referencia);
                    break;
                }
                case "mkdir": {
                    if (opcion.length >= 2) {
                        String dir = "";
                        for (int i = 1; i < opcion.length; i++) {
                            dir += opcion[i] + " ";
                        }
                        fm.mkDir(dir, referencia);
                    }
                    break;
                }
                case "rm": {
                    try {
                        fm.borraTodo(referencia);
                    } catch (Exception e) {
                        System.out.println("[ERROR] no se ha podido borrar el directorio.");
                    }
                    break;
                }
                case "mv": {
                    if(fm.moverArchivo(opcion[1], opcion[2], referencia)) {
                        System.out.println("Archivo/fichero renombrado correctamente.");
                    } else {
                        System.out.println("[ERROR] no se ha podido mover/renombrar el archivo/fichero.");
                    }
                    break;
                }
                case "help": {
                    System.out.println("\n\nHELP:");
                    System.out.println("  pwd: Muestra cual es la carpeta actual.");
                    System.out.println("  cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior");
                    System.out.println("  ls: Muestra la lista de directorios y archivos de la carpeta actual");
                    System.out.println("  ll: Como ls pero muestra también el tamaño y la fecha de última modificación");
                    System.out.println("  mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.");
                    System.out.println("  rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta.");
                    System.out.println("  mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.");
                    System.out.println("  exit: Termina el programa.");
                    break;
                }
                case "exit": {
                    break;
                }
                default: {
                    System.out.println("[ERROR] Comando no disponible. [help para visualizar la lista de comandos]");
                    break;
                }
            }
        } while (!"exit".equals(opcion[0].toLowerCase()));
    }
}
