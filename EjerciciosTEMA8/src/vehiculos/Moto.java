
package vehiculos;

/**
 *
 * @author alumnot
 */
public class Moto extends Terrestre {
    private String color;

    public Moto(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void imprimir() {
        System.out.println("Moto: " + getModelo() + ", matrícula " + getMatricula() + ", " + getNumRuedas() + " ruedas, color: " + getColor());
    }
}