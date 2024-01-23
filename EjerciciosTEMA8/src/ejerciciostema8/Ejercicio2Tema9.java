/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciostema8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ejercicio2Tema9 {
    public static void main(String[] args) {
        
        Planeta mercurio = new Planeta("Mercurio", 3.3e23, 4879, 1407.6, 88, 57.9e6, null);
        Planeta venus = new Planeta("Venus", 4.87e24, 12104, -5832.5, 224.7, 108.2e6, null);
        Planeta tierra = new Planeta("Tierra", 5.97e24, 12756, 23.9, 365.2, 149.6e6, null);
        Planeta marte = new Planeta("Marte", 6.42e23, 6792, 24.6, 687, 227.9e6, null);
        Planeta jupiter = new Planeta("Jupiter", 1.9e27, 142984, 9.9, 4331, 778.3e6, null);
        Planeta saturno = new Planeta("Saturno", 5.68e26, 120536, 10.7, 10747, 1427.0e6, null);
        Planeta urano = new Planeta("Urano", 8.68e25, 51118, -17.2, 30589, 2871.0e6, null);
        Planeta neptuno = new Planeta("Neptuno", 1.02e26, 49528, 16.1, 59800, 4497.1e6, null);

        
        ArrayList<Satelite> satelitesTierra = new ArrayList<>();
        satelitesTierra.add(new Satelite("Luna", 7.35e22, 3475, 27.3, 27.3, 384400, tierra));
        tierra.setSatelites(satelitesTierra);

        ArrayList<Satelite> satelitesMarte = new ArrayList<>();
        satelitesMarte.add(new Satelite("Fobos", 1.08e16, 22, 7.7, 0.32, 9377, marte));
        satelitesMarte.add(new Satelite("Deimos", 2.0e15, 12, 30.3, 1.26, 23460, marte));
        marte.setSatelites(satelitesMarte);

        ArrayList<Satelite> satelitesJupiter = new ArrayList<>();
        satelitesJupiter.add(new Satelite("Io", 8.93e22, 3643, 42.5, 1.77, 421800, jupiter));
        satelitesJupiter.add(new Satelite("Europa", 4.8e22, 3122, 85.2, 3.55, 671100, jupiter));
        satelitesJupiter.add(new Satelite("Ganimedes", 1.48e23, 5262, 171.7, 7.16, 1070400, jupiter));
        satelitesJupiter.add(new Satelite("Calisto", 1.08e23, 4820, 400.5, 16.69, 1882700, jupiter));
        jupiter.setSatelites(satelitesJupiter);

        ArrayList<Satelite> satelitesSaturno = new ArrayList<>();
        satelitesSaturno.add(new Satelite("Mimas", 3.75e19, 396, 0.9, 0.94, 185520, saturno));
        satelitesSaturno.add(new Satelite("Encelado", 1.08e20, 504, 1.4, 1.37, 238020, saturno));
        satelitesSaturno.add(new Satelite("Tetis", 6.17e20, 1062, 1.9, 1.89, 294660, saturno));
        satelitesSaturno.add(new Satelite("Dione", 1.1e21, 1123, 2.7, 2.74, 377400, saturno));
        saturno.setSatelites(satelitesSaturno);
        //ETC ETC ETC
                
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el nombre del planeta que deseas ver: ");
    String nombrePlaneta = sc.nextLine();

        if (nombrePlaneta.equalsIgnoreCase(jupiter.getNombre())) {
            jupiter.mostrarInformacion();
            ArrayList<Satelite> satelites = jupiter.getSatelites();
            if (!satelites.isEmpty()) {
                System.out.println("Satelites que orbitan este planeta:");
                for (Satelite satelite : satelites) {
                    satelite.mostrarInformacion();
                }
            }
        } else {
            System.out.println("El planeta " + nombrePlaneta + " no se encuentra en el sistema planetario.");
        }
    }
}
