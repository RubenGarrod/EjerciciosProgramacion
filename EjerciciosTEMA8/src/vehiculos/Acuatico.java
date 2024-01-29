
package vehiculos;

/**
 *
 * @author alumnot
 */
public abstract class Acuatico extends Vehiculo {
    private double eslora;

    public Acuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }
    /**
     * 
     * @return 
     */
    public double getEslora() {
        return eslora;
    }
}
