
package vehiculos;

/**
 *
 * @author alumnot
 */
public class Coche extends Terrestre {
    private boolean aireAcondicionado;

    public Coche(String matricula, String modelo, int numRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean tieneAireAcondicionado() {
        return aireAcondicionado;
    }

    @Override
    public void imprimir() {
        System.out.println("Coche: " + getModelo() + ", matrícula " + getMatricula() + ", " + getNumRuedas() + " ruedas, aire acondicionado: " + (tieneAireAcondicionado() ? "sí" : "no"));
    }
}
