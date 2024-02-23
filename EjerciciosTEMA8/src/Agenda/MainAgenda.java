package Agenda;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AlumnoT
 */
public class MainAgenda {

    public static void main(String[] args) {

        ArrayList<Contacto> listaContactos = new ArrayList<>();

        Contacto contacto1 = new Contacto("ruben", "123456789");
        Contacto contacto2 = new Contacto("paco", "987654321");
        Contacto contacto3 = new Contacto("ana", "634644664");

        Agenda agenda = new Agenda(listaContactos);
        try {
            agenda.añadirContacto(contacto1);
            agenda.añadirContacto(contacto2);
            agenda.añadirContacto(contacto3);
        } catch (Exception e) {
            System.out.println("Contacto Duplicado. Error al añadir " + e.getMessage());
        }

        System.out.println("Lista de contactos:\n");
        for (Iterator<Contacto> it = listaContactos.iterator(); it.hasNext();) {
            Contacto c = it.next();
            System.out.println("Nombre: " + c.getNombre() + "\t Tlf: " + c.getNumero());
        }

        String nombreAEliminar = "paco";
        boolean eliminado = agenda.eliminarContacto(nombreAEliminar);
        if (eliminado) {
            System.out.println("Contacto '" + nombreAEliminar + "' eliminado.");
        } else {
            System.out.println("No se encontro ningun contacto con el nombre '" + nombreAEliminar + "'.");
        }

        System.out.println("Lista de contactos despues de eliminar:");
        for (Iterator<Contacto> it = listaContactos.iterator(); it.hasNext();) {
            Contacto c = it.next();
            System.out.println("Nombre: " + c.getNombre() + "\t Tlf: " + c.getNumero());
        }
    }
}
