
package vehiculos;

/**
 *
 * @author alumnot
 */
public class Helicoptero extends Aereo {
    private int numHlices;

    public Helicoptero(String matricula, String modelo, int numAsientos, int numHlices) {
        super(matricula, modelo, numAsientos);
        this.numHlices = numHlices;
    }
    /**
     * 
     * @return 
     */
    public int getNumHlices() {
        return numHlices;
    }

    @Override
    public void imprimir() {
        System.out.println("Helicóptero: " + getModelo() + ", matrícula " + getMatricula() + ", " + getNumAsientos() + " asientos, " + getNumHlices() + " hélices");
    }
}