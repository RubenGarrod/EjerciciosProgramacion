package interface_ejercicio;

import java.text.DecimalFormat;

/**
 *
 * @author alumnot
 */
public class Circulo implements Figura2D {

    private double radio;
    DecimalFormat df = new DecimalFormat("#.##");

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * getRadio();
    }

    @Override
    public double area() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            setRadio(getRadio() * escala);
        } else {
            System.out.println("ERROR ESCALA NEGATIVA");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Circulo: el radio es de " + df.format(this.getRadio()) + "cm, la circunferencia " + df.format(perimetro()) + "cm y su area " + df.format(area()) + "cm^2");
    }

}
