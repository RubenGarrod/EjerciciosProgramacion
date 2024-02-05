
package superheroes;

/**
 *
 * @author AlumnoT
 */
public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;
    
    public Dimension(){
        alto = 0;
        ancho = 0;
        profundidad = 0;
    }
    public Dimension(double alto, double ancho, double profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the profundidad
     */
    public double getProfundidad() {
        return profundidad;
    }

    /**
     * @param profundidad the profundidad to set
     */
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    public double getVolumen(double ancho, double alto, double profundidad){
        return ancho*alto*profundidad;
    }
    
    @Override
    public String toString(){
        return  "Dimensiones: " + '\n' 
                + "\t Ancho = " + getAncho() + '\n' 
                + "\t Alto = " + getAlto()
                + "\t Profundidad = " + getProfundidad()
                + "\t Volumen total = " + getVolumen(ancho, alto, profundidad);
    }
}
