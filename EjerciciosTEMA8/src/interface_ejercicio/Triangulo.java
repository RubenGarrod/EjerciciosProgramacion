package interface_ejercicio;

import java.text.DecimalFormat;

/**
 *
 * @author alumnot
 */
public class Triangulo implements Figura2D, NewInterface {

    private double base;
    private double altura;
    DecimalFormat df = new DecimalFormat("#.##");

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the base
     */
    @Override
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
    @Override
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
        if (getBase() == getAltura()) {
            return 3 * getBase();
        } else {
            return getBase() + getAltura() + Math.sqrt((Math.pow(getAltura(), 2) + Math.pow(getBase(), 2)));
        }
    }

    @Override
    public double area() {
        return 0.5 * getBase() * getAltura();
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
        System.out.println("Triangulo: la base es " + df.format(this.getBase()) + "cm, la altura es " + df.format(this.getAltura()) + "cm, el perimetro " + df.format(perimetro()) + "cm y su area " + df.format(area()) + "cm^2");
    }
}
