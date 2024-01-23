package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class Satelite extends Astro {

    private Planeta planetaOrbita;

    public Satelite(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia, Planeta planetaOrbita) {
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.planetaOrbita = planetaOrbita;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nSatelite:\t" + getNombre());
        System.out.println("Masa: \t" + getMasa());
        System.out.println("Diametro medio: \t" + getDiametro());
        System.out.println("Periodo de rotacion: \t" + getPeriodoRotacion());
        System.out.println("Periodo de traslacion: \t" + getPeriodoTraslacion());
        System.out.println("Distancia media a ese cuerpo: \t" + getDistanciaMedia());
        System.out.println("Planeta que orbita: \t" + getPlanetaOrbita().getNombre());
    }

    /**
     * @return the planetaOrbita
     */
    public Planeta getPlanetaOrbita() {
        return planetaOrbita;
    }

    /**
     * @param planetaOrbita the planetaOrbita to set
     */
    public void setPlanetaOrbita(Planeta planetaOrbita) {
        this.planetaOrbita = planetaOrbita;
    }
}
