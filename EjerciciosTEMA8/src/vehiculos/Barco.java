
package vehiculos;

/**
 *
 * @author alumnot
 */
public class Barco extends Acuatico {
    private boolean tieneMotor;

    public Barco(String matricula, String modelo, double eslora, boolean tieneMotor) {
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
    }

    public boolean tieneMotor() {
        return tieneMotor;
    }

    @Override
    public void imprimir() {
        System.out.println("Barco: " + getModelo() + ", matrícula " + getMatricula() + ", eslora " + getEslora() + " metros, motor: " + (tieneMotor() ? "sí" : "no"));
    }
}
