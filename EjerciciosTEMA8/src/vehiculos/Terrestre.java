
package vehiculos;

/**
 *
 * @author alumnot
 */

public abstract class Terrestre extends Vehiculo {
    private int numRuedas;

    public Terrestre(String matricula, String modelo, int numRuedas) {
        super(matricula, modelo);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
}









