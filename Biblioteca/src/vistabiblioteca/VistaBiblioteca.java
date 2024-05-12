package vistabiblioteca;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class VistaBiblioteca {

    private Scanner sc;

    public VistaBiblioteca() {
        sc = new Scanner(System.in);
    }

    public int opcionUsuario() {
        return sc.nextInt();
    }

    public void menu() {
        System.out.println("------------ Menu de la Biblioteca ------------");
        System.out.println("1. Buscar libros por titulo.");
        System.out.println("2. Mostrar informacion detallada de un libro.");
        System.out.println("3. Realizar prestamo.");
        System.out.println("4. Devolver un libro.");
        System.out.println("5. Agregar nuevo libro.");
        System.out.println("6. Eliminar libro.");
        System.out.println("0. Salir.");
        System.out.println("Seleccione una opcion: ");
        System.out.println("-----------------------------------------------");
    }

    public void mostrarMensaje(String s) {
        System.out.println(s);
    }

    public String recogerDatos() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
