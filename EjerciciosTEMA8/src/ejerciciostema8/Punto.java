package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class Punto {

    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Imprime por pantalla las coordenadas de un punto.
     */
    public void imprime() {
        System.out.println("(" + x + ", " + y + ")");
    }

    /**
     * Modifica ambas coordenadas. Es como un setter doble.
     *
     * @param x
     * @param y
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Desplaza el punto la cantidad (dx,dy) indicada. Ejemplo: Si el punto
     * (1,1) se desplaza (2,5) entonces estará en (3,6).
     *
     * @param dx
     * @param dy
     */
    public void desplaza(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Calcula y devuelve la distancia entre el propio objeto (this) y otro
     * objeto (Punto p) que se pasa como parámetro: distancia entre dos
     * coordenadas.
     *
     * @param p
     * @return
     */
    public int distanciaPuntos(Punto p) {
        int dx = x - p.getX();
        int dy = y - p.getY();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Método que genera números aleatorios entre -100 y 100 para x e y para
     * crear un nuevo objeto Punto con estas coordenadas y lo devuelve.
     *
     * @return
     */
    public static Punto puntoRandom() {
        int x = (int) (Math.random() * 200) - 100; //se multiplica por 200 para obtener numeros entre 0 y 200 y que al restarle 100 siempre este en el rango de -100 y 100
        int y = (int) (Math.random() * 200) - 100;
        return new Punto(x, y);
    }
}
