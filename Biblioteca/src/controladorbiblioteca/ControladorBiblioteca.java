package controladorbiblioteca;

import java.util.ArrayList;
import modelobiblioteca.Biblioteca;
import modelobiblioteca.Libro;
import vistabiblioteca.VistaBiblioteca;

/**
 *
 * @author AlumnoT
 */
public class ControladorBiblioteca {

    private Biblioteca biblioteca;
    private VistaBiblioteca vistaBiblioteca;

    public ControladorBiblioteca() {
        biblioteca = new Biblioteca();
        vistaBiblioteca = new VistaBiblioteca();
    }

    public void iniciar() {
        int opcion;
        do {
            vistaBiblioteca.menu();
            opcion = vistaBiblioteca.opcionUsuario();
            switch (opcion) {
                case 1:
                    buscarLibros();
                    break;
                case 2:
                    mostrarInformacionLibro();
                    break;
                case 3:
                    realizarPrestamo();
                    break;
                case 4:
                    devolverLibro();
                    break;
                case 5:
                    agregarNuevoLibro();
                    break;
                case 6:
                    eliminarLibro();
                    break;
                case 0:
                    vistaBiblioteca.mostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vistaBiblioteca.mostrarMensaje("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    public static void buscarLibros() {
        System.out.println("Introduce el título del libro a buscar:");

        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : Biblioteca.getListaLibros()) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }

        if (librosEncontrados.isEmpty()) {
            System.out.println("No se encontraron libros con ese título.");
        } else {
            vistaBiblioteca.mostrarMensaje("Libros encontrados:");
            for (Libro libroEncontrado : librosEncontrados) {
                vistaBiblioteca.mostrarMensaje(libroEncontrado.getTitulo() + " - " + libroEncontrado.getAutor());
            }
        }
    }
}
