package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public abstract class Astro {

    private String nombre;
    private double masa;
    private double diametro;
    private double periodoRotacion;
    private double periodoTraslacion;
    private double distanciaMedia;

    /**
     *
     * @param nombre
     * @param masa
     * @param diametro
     * @param periodoRotacion
     * @param periodoTraslacion
     * @param distanciaMedia
     */
    public Astro(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    public abstract void mostrarInformacion();

    /**
     * @return the masa
     */
    public double getMasa() {
        return masa;
    }

    /**
     * @param masa the masa to set
     */
    public void setMasa(double masa) {
        this.masa = masa;
    }

    /**
     * @return the diametro
     */
    public double getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    /**
     * @return the periodoRotacion
     */
    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    /**
     * @param periodoRotacion the periodoRotacion to set
     */
    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    /**
     * @return the periodoTraslacion
     */
    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    /**
     * @param periodoTraslacion the periodoTraslacion to set
     */
    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    /**
     * @return the distanciaMedia
     */
    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    /**
     * @param distanciaMedia the distanciaMedia to set
     */
    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
