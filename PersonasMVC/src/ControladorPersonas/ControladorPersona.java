/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorPersonas;

import ModeloPersonas.Persona;
import VistaPersonas.VistaPersona;
import java.util.ArrayList;


/**
 *
 * @author AlumnoT
 */
public class ControladorPersona {

    private VistaPersona vista;
    private ArrayList<Persona> listaPersonas;

    public ControladorPersona(VistaPersona v) {
        this.vista = v;
        this.listaPersonas = new ArrayList<>();
    }

    /**
     * @return the vista
     */
    public VistaPersona getVista() {
        return vista;
    }

    /**
     * @param vista the vista to set
     */
    public void setVista(VistaPersona vista) {
        this.vista = vista;
    }

    /**
     * @return the listaPersonas
     */
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    /**
     * @param listaPersonas the listaPersonas to set
     */
    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            getVista().Menu();
            String opcion = getVista().recogerDatos();
            switch (opcion) {
                case "1" -> listaPersonas = importarDatos("C:/Users/AlumnoT/Documents/personas.csv");
                case "2" -> mostrarDatosImportados();
                case "3" -> filtrarPeso();
                case "4" -> ordenar();
                case "0" -> salir = true;
                default -> getVista().mostrarPantalla("[ERROR] Opcion no valida.\n\n");
            }
        }
    }

    public ArrayList<Persona> importarDatos(String ruta) {
        return ImportarCSV.importarDatos(ruta);
    }

    public void mostrarDatosImportados() {
        if (!listaPersonas.isEmpty()) {
            for (Persona tmp : listaPersonas) {
                vista.mostrarPantalla("Nombre: " + tmp.getNombre() + "\nApellido: " + tmp.getApellido() + "\nDNI: " + tmp.getDNI() + "\nPeso " + tmp.getPeso() + "\n\n");
            }
        } else {
            vista.mostrarPantalla("[ERROR Lista vacia]\n\n");
        }
    }

    public void filtrarPeso() {
        if (!listaPersonas.isEmpty()) {
            vista.mostrarPantalla("Introduce peso minimo: ");
            double pesoMin = Double.parseDouble(vista.recogerDatos());
            vista.mostrarPantalla("Introduce peso maximo: ");
            double pesoMax = Double.parseDouble(vista.recogerDatos());
            for (Persona tmp : listaPersonas) {
                if (tmp.getPeso() >= pesoMin && tmp.getPeso() <= pesoMax) {
                    vista.mostrarPantalla("Nombre: " + tmp.getNombre() + "\nApellido: " + tmp.getApellido() + "\nDNI: " + tmp.getDNI() + "\nPeso " + tmp.getPeso() + "\n\n");
                }
            }
        } else {
            vista.mostrarPantalla("[ERROR Lista vacia]\n\n");
        }
    }
    
    public void ordenar(){
        if (!listaPersonas.isEmpty()) {
            listaPersonas.sort((a,b) -> a.getNombre().compareToIgnoreCase(b.getNombre()));
            for (Persona tmp : listaPersonas) {
                vista.mostrarPantalla("Nombre: " + tmp.getNombre() + "\nApellido: " + tmp.getApellido() + "\nDNI: " + tmp.getDNI() + "\nPeso " + tmp.getPeso() + "\n\n");
            }
        } else {
            vista.mostrarPantalla("[ERROR Lista vacia]\n\n");
        }
    }
}
