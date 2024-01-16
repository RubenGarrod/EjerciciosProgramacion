package ejerciciostema8;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class EjercicioPuntos {

    public void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        Punto p1;
        Punto p2;
        Punto p3;
        System.out.println("Introduce las coordenadas del punto 1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Introduce las coordenadas del punto 2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Introduce las coordenadas del punto 3:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        p1 = new Punto(x1, y1);
        p2 = new Punto(x2, y2);
        p3 = new Punto(x3, y3);

        System.out.println("El punto 1 tiene las siguientes coordenadas: " + "(" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("El punto 2 tiene las siguientes coordenadas: " + "(" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("El punto 3 tiene las siguientes coordenadas: " + "(" + p3.getX() + "," + p3.getY() + ")");
        
        System.out.println("La distancia entre p1 y p2 es: " + distanciaPuntos(p1.getX(), p1.getY(), p2.getX(), p2.getY()));
    }

    /**
     * Recibe las coordenadas de 2 puntos y calcula la distancia entre ellos
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double distanciaPuntos(int x1, int y1, int x2, int y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        return Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
    }

}
