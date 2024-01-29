
package vehiculos;

/**
 *
 * @author alumnot
 */
public class Avion extends Aereo {
    private int tiempoMaximoVuelo;

    public Avion(String matricula, String modelo, int numAsientos, int tiempoMaximoVuelo) {
        super(matricula, modelo, numAsientos);
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    public int getTiempoMaximoVuelo() {
        return tiempoMaximoVuelo;
    }

    @Override
    public void imprimir() {
        System.out.println("Avión: " + getModelo() + ", matrícula " + getMatricula() + ", " + getNumAsientos() + " asientos, tiempo máximo de vuelo: " + getTiempoMaximoVuelo() + " horas");
    }
}


