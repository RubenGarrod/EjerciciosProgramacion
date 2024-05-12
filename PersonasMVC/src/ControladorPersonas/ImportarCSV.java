/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorPersonas;

import ModeloPersonas.Persona;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author AlumnoT
 */
public class ImportarCSV {

    public static ArrayList<Persona> importarDatos(String rutaArchivo) {
        ArrayList<Persona> personas = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String line;
            //ignoramos la primera linea leyendola antes
            lector.readLine();

            while ((line = lector.readLine()) != null) {
                String[] trozos = line.split(",");
                String nombre = trozos[0];
                String apellido = trozos[1];
                String DNI = trozos[2];
                Double peso = Double.parseDouble(trozos[3]);
                Persona p = new Persona(nombre, apellido, DNI, peso);
                personas.add(p);
            }
        } catch (IOException e) {
            System.err.print("[ERROR] Fallo en la lectura del archivo.");
        }

        return personas;
    }
}
