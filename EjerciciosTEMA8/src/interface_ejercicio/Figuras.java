package interface_ejercicio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumnot
 */
public class Figuras {

    public static void main(String[] args) {
        ArrayList<Figura2D> listaFiguras = new ArrayList<Figura2D>();

        Cuadrado c1 = new Cuadrado(3.5);
        Rectangulo r1 = new Rectangulo(3.5, 7);
        Triangulo t1 = new Triangulo(2, 6);
        Circulo cir1 = new Circulo(2.5);
        listaFiguras.add(c1);
        listaFiguras.add(r1);
        listaFiguras.add(t1);
        listaFiguras.add(cir1);

        mostrarFiguras(listaFiguras);

        escalarFiguras(listaFiguras, 0.1);
        System.out.println("\nFiguras escaladas a 0,1 :");
        mostrarFiguras(listaFiguras);

    }

    public static void mostrarFiguras(ArrayList<Figura2D> fig) {
        for (Iterator it = fig.iterator(); it.hasNext();) {
            Figura2D tmp = (Figura2D) it.next();
            tmp.imprimir();
        }
    }

    public static void escalarFiguras(ArrayList<Figura2D> fig, double escala) {
        for (Iterator it = fig.iterator(); it.hasNext();) {
            Figura2D tmp = (Figura2D) it.next();
            tmp.escalar(escala);
        }
    }
}
