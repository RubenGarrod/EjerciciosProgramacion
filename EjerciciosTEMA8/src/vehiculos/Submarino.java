
package vehiculos;

/**
 *
 * @author alumnot
 */
public class Submarino extends Acuatico {
    private int profundidadMaxima;

    public Submarino(String matricula, String modelo, double eslora, int profundidadMaxima) {
        super(matricula, modelo, eslora);
        this.profundidadMaxima = profundidadMaxima;
    }

    public int getProfundidadMaxima() {
        return profundidadMaxima;
    }

    @Override
    public void imprimir() {
        System.out.println("Submarino: " + getModelo() + ", matrícula " + getMatricula() + ", eslora " + getEslora() + " metros, profundidad máxima: " + getProfundidadMaxima() + " metros");
    }
}