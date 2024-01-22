
package ejerciciostema8;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class EjercicioArticulos {
    public void Ejecutar() {

            Articulo art1 = new Articulo("algo", 2.5,255);
            
            
            double precio = art1.getPrecio();
            System.out.println(precioIVA(precio));
            System.out.println("Modificacion del precio del producto " + art1.getNombre() + " en 5 eurillos");
            art1.setPrecio(7.5);
            precio = art1.getPrecio();
            
    }

    private boolean precioIVA(double precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
