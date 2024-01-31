package exceptions;

/**
 *
 * @author alumnot
 */
public class ejercicio6 {

    public static void main(String[] args) {
        try {
            Gato g1 = new Gato("Misco", 3);
            g1.imprimir();

            Gato g2 = new Gato("Jones", -22);
            g2.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
