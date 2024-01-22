
package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class Astros {
    private double masa;
    private double diametro;
    private double rotacion;
    private double traslacion;
    private double temperatura;
    
    public Astros(double masa, double diametro, double rotacion, double traslacion, double temperatura){
        masa = masa;
        diametro = diametro;
        rotacion = rotacion;
        traslacion = traslacion;
        temperatura = temperatura;
    }

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
     * @return the rotacion
     */
    public double getRotacion() {
        return rotacion;
    }

    /**
     * @param rotacion the rotacion to set
     */
    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    /**
     * @return the traslacion
     */
    public double getTraslacion() {
        return traslacion;
    }

    /**
     * @param traslacion the traslacion to set
     */
    public void setTraslacion(double traslacion) {
        this.traslacion = traslacion;
    }

    /**
     * @return the temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
