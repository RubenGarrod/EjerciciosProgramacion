package interface_ejercicio;

import java.text.DecimalFormat;

/**
 *
 * @author alumnot
 */
public class Rectangulo implements Figura2D {

    private double base;
    private double altura;
    DecimalFormat df = new DecimalFormat("#.##");

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2 * (getBase() + getAltura());
    }

    @Override
    public double area() {
        return getBase() * getAltura();
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            setBase(getBase() * escala);
            setAltura(getAltura() * escala);
        } else {
            System.out.println("ERROR ESCALA NEGATIVA");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Rectangulo: la base es " + df.format(this.getBase()) + "cm, la altura es " + df.format(this.getAltura()) + "cm, el perimetro " + df.format(perimetro()) + "cm y su area " + df.format(area()) + "cm^2");
    }
}
