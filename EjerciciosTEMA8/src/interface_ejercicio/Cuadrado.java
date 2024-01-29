package interface_ejercicio;

import java.text.DecimalFormat;

/**
 *
 * @author alumnot
 */
public class Cuadrado implements Figura2D {

    private double lado;
    DecimalFormat df = new DecimalFormat("#.##");

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 4 * getLado();
    }

    @Override
    public double area() {
        return getLado() * getLado();
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            setLado(lado * escala);
        } else {
            System.out.println("ERROR ESCALA NEGATIVA");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado: el lado es " + df.format(this.getLado()) + "cm, el perimetro " + df.format(perimetro()) + "cm y su area " + df.format(area()) + "cm^2");
    }
}
