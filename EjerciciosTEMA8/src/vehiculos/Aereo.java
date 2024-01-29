
package vehiculos;

/**
 *
 * @author alumnot
 */
public abstract class Aereo extends Vehiculo {
    private int numAsientos;

    public Aereo(String matricula, String modelo, int numAsientos) {
        super(matricula, modelo);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }
}
