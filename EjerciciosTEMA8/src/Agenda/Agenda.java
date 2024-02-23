/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AlumnoT
 */
public class Agenda {

    private ArrayList<Contacto> listaContactos;

    public Agenda(ArrayList<Contacto> listaContactos) {
        this.listaContactos = new ArrayList<Contacto>();
    }

    /**
     * @return the listaContactos
     */
    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    /**
     * @param listaContactos the listaContactos to set
     */
    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    /**
     *
     * @param c (un contacto)
     * @return boolean
     */
    public boolean añadirContacto(Contacto c) {
        boolean noDuplicado = true;
        for (Iterator<Contacto> it = listaContactos.iterator(); it.hasNext();) {
            Contacto contacto = it.next();
            if (c.getNombre().equals(contacto.getNombre())) {
                noDuplicado = false;
            }
        }
        if (noDuplicado) {
            listaContactos.add(c);
        }
        return noDuplicado;
    }

    public boolean eliminarContacto(String nombre) {
        boolean eliminado = false;
        Iterator<Contacto> it = listaContactos.iterator();
        while (it.hasNext()) {
            Contacto contacto = it.next();
            if (nombre.equals(contacto.getNombre())) {
                it.remove();
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }
}
