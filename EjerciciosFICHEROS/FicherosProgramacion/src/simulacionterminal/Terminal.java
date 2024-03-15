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

    public static void main(String[] args) {
        Scanner command = new Scanner(System.in);
        String[] opcion;
        MiniFileManager fm = new MiniFileManager();
        File referencia = new File("C:\\Users\\AlumnoT");
        
     
       

        do {
            System.out.print("AlumnoT@ubuntu:~$");
            opcion = (command.nextLine()).split(" ");
            switch (opcion[0].toLowerCase()) {
                case "pwd" -> {
                    System.out.println("\nCarpeta actual: " + referencia.getAbsolutePath());

                }
                case "cd" -> {
                    if (opcion.length > 2) {
                        String nuevaRuta = "";
                        for (int i = 0; i < opcion.length; i++) {
                            nuevaRuta += opcion[i] + " ";
                        }
                        fm.changeDir(nuevaRuta);
                    }
                }
                case "ls" -> {
                    for (File tmp : referencia.listFiles()) {
                        System.out.println(tmp.getName());
                    }
                }
                case "ll" -> {
                    for (File tmp : referencia.listFiles()) {
                        System.out.println("\nNombre del archivo " + tmp.getName() + "  ||  Tamanno: " + tmp.length());
                        System.out.println("Ultima modificacion: " + new Date(tmp.lastModified()));
                    }
                }
                case "mkdir" -> {
                    String dir = sc.nextLine();
                    File nuevoDir = new File(referencia, dir);
                    try {
                        nuevoDir.mkdir();
                        System.out.println("Directorio creado: " + nuevoDir.getAbsolutePath());
                    } catch (Exception e) {
                        System.out.println("[ERROR] no se ha podido crear el directorio.");
                    }
                }
                case "rm" -> {
                    String file = sc.nextLine();
                    File fileBorrar = new File(referencia, file);
                    try {
                        fileBorrar.delete();
                        System.out.println("Archivo borrado: " + fileBorrar.getAbsolutePath());
                    } catch (Exception e) {
                        System.out.println("[ERROR] no se ha podido borrar el archivo.");
                    }
                }
                case "mv" -> {
                    String file1 = sc.nextLine();
                    String file2 = sc.nextLine();
                    File origen = new File(referencia, file1);
                    File destino = new File(referencia, file2);
                    try {
                        origen.renameTo(destino);
                        System.out.println("Archivo movido/renombrado.");
                    } catch (Exception e) {
                        System.out.println("Error al mover/renombrar el archivo.");
                    }
                }
                case "help" -> {
                    System.out.println("\n\nHELP:");
                    System.out.println("  pwd: Muestra cual es la carpeta actual.");
                    System.out.println("  cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior");
                    System.out.println("  ls: Muestra la lista de directorios y archivos de la carpeta actual");
                    System.out.println("  ll: Como ls pero muestra también el tamaño y la fecha de última modificación");
                    System.out.println("  mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.");
                    System.out.println("  rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta.");
                    System.out.println("  mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.");
                    System.out.println("  exit: Termina el programa.");
                }
                case "exit" ->{
                    break;
                }
                default -> {
                    System.out.println("[ERROR] Comando no disponible. [help para visualizar la lista de comandos]");
                }
            }
        } while (opcion[0].toLowerCase() != "exit");
    }
}
