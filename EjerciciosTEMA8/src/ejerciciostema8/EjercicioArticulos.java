
package ejerciciostema8;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class EjercicioArticulos {
    public void Ejecutar() {
        Scanner sc = new Scanner(System.in);
            final double IVA = 0.21;
            Articulo art1 = new Articulo("algo", 2.5,255);
            
            System.out.println("Nombre del articulo:");
            art1.nombre = sc.nextLine();
            System.out.println("Precio del articulo:");
            art1.precio = sc.nextDouble();
            System.out.println("Inventario:");
            art1.cuantosQuedan = sc.nextInt();
            double precioIVA = art1.precio * IVA + art1.precio;
            System.out.println("Precio con IVA = " + precioIVA);

    }
}
