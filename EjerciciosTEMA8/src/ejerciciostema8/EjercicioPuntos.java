
package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class EjercicioPuntos {

    public void Ejecutar() {
        Punto p1;
        Punto p2;
        Punto p3;
        p1 = new Punto(5 ,0);
        p2 = new Punto(10,10);
        p3 = new Punto(-3,7);
               
        System.out.println("El punto 1 tiene las siguientes coordenadas: " + "(" + p1.x + "," + p1.y + ")");
        System.out.println("\nEl punto 2 tiene las siguientes coordenadas: " + "(" + p2.x + "," + p2.y + ")");
        System.out.println("\nEl punto 3 tiene las siguientes coordenadas: " + "(" + p3.x + "," + p3.y + ")");
        
        p1.x +=5;
        System.out.println("El punto 1 (ahora) tiene las siguientes coordenadas: " + "(" + p1.x + "," + p1.y + ")");
    }
    /**
     * Recibe las coordenadas de 2 puntos y calcula la distancia entre ellos
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
