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
        
        System.out.println("Con el metodo imprime:");
        p1.imprime();
        p2.imprime();
        
        System.out.println("Con un p1.setXY(2, 3):");
        p1.setXY(2, 3);
        p1.imprime();
        
        System.out.println("Con desplazamiento: p2.desplaza(-2, 3);");
        p2.desplaza(-2, 3);
        p2.imprime();

        int distanciaPuntos = p1.distanciaPuntos(p2);
        System.out.println("La distancia entre los puntos p1 y p2 es: " + distanciaPuntos);

        Punto p4 = Punto.puntoRandom();
        Punto p5 = Punto.puntoRandom();
        Punto p6 = Punto.puntoRandom();

        System.out.println("Punto aleatorio: ");
        p4.imprime();
        System.out.println("Punto aleatorio: ");
        p5.imprime();
        System.out.println("Punto aleatorio: ");
        p6.imprime();
    }
}
