/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherosprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class NotasAlumnos {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File fileNotas = new File("C:/Users/AlumnoT/Documents/alumnos.txt");
            Scanner sc = new Scanner(fileNotas);
            DecimalFormat df = new DecimalFormat("#.##");
            ArrayList<Alumno> alumnos = new ArrayList<>(); 

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] trozos = linea.split(" ");
                String nombre = trozos[0];
                String apellido = trozos[1];
                double sumaNotas = 0;//Hay que inicializarlo en 0 para que se reinicie y no vaya acumulando las de todos los alumnos

                 //Que empiece desde el indice 3 para saltar nombre y 2 apellidos
                for (int i = 3; i < trozos.length; i++) {
                    double nota = Double.parseDouble(trozos[i]);
                    sumaNotas += nota;
                }

                double notaMedia = sumaNotas / (trozos.length - 3);//-3 para que no cuente nombre y apellidos
                Alumno tmp = new Alumno(nombre, apellido, notaMedia);
                alumnos.add(tmp);
            }
            sc.close();
            
            //Para ordenarlo por notas de mayor a menor con el .compare de sort
            alumnos.sort((alumno1, alumno2) -> Double.compare(alumno2.getNotaMedia(), alumno1.getNotaMedia()));

            System.out.println("ALUMNO:\t\t\tNOTA MEDIA");
            for (Alumno a : alumnos) {
                System.out.printf("%-10s %-15s %s%n", a.getNombre(), a.getApellido(), df.format(a.getNotaMedia()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] El archivo no existe.");
        }
    }

}
