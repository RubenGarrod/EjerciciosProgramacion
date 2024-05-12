/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Alumno;

/**
 *
 * @author AlumnoT
 */
public class VistaAlumno {

    public void mostrarTabla(double[][] calificaciones, double[] medias) {
        System.out.println("Notas de los alumnos: ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("| ID alumno | 1er Parcial | 2o Parcial | Examen Final | Media |");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.printf("|%-11s|%-11.2f|%-11.2f|%-11.2f|%-11.2f|\n",
                    calificaciones[i][0], calificaciones[i][1], calificaciones[i][2], calificaciones[i][3], medias[i]);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public double[][] crearAlumno() {
        Scanner sc = new Scanner(System.in);
        double[][] datos = new double[9][3];
        for (int i = 0; i < 9; i++) {
            System.out.println("Notas del alumno con id " + (i + 1) + " :");
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Nota del 1er Parcial: ");
                        datos[i][j] = sc.nextDouble();
                        break;
                    case 1:
                        System.out.println("Nota del 2o Parcial: ");
                        datos[i][j] = sc.nextDouble();
                        break;
                    case 2:
                        System.out.println("Nota del Examen Final: ");
                        datos[i][j] = sc.nextDouble();
                        break;
                    default:
                        break;
                }

            }
        }
        return datos;
    }
}
