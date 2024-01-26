package cuerposcelestes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumnot
 */
public class Planeta extends Astro {

    private ArrayList<Satelite> satelites;

    public Planeta(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia, ArrayList<Satelite> satelites) {
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new ArrayList<>();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Planeta:" + getNombre());
        System.out.println("Masa: " + getMasa());
        System.out.println("Diametro medio: " + getDiametro());
        System.out.println("Periodo de rotacin sobre su propio eje: " + getPeriodoRotacion());
        System.out.println("Periodo de traslacion alrededor del Sol: " + getPeriodoTraslacion());
        System.out.println("Distancia media al Sol: " + getDistanciaMedia());
        if (!satelites.isEmpty()) {
            System.out.println("Satelites que orbitan este planeta:");
            for (Satelite satelite : satelites) {
                satelite.mostrarInformacion();
            }
        } else {
            System.out.println("Este planeta no tiene satelites.");
        }
    }

    /**
     * @return the satelites
     */
    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    /**
     * @param satelites the satelites to set
     */
    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }
}
