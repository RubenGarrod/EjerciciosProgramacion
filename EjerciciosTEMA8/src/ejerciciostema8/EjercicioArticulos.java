
package ejerciciostema8;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class EjercicioArticulos {
    public void Ejecutar() {
        //Scanner sc = new Scanner(System.in);
            Articulo art1 = new Articulo("algo", 2.5,255);
            
            /*System.out.println("Nombre del articulo:");
            art1.nombre = sc.nextLine();
            System.out.println("Precio del articulo:");
            art1.precio = sc.nextDouble();
            System.out.println("Inventario:");
            art1.cuantosQuedan = sc.nextInt();*/
            
            double precio = art1.getPrecio();
            System.out.println(precioIVA(precio));
            System.out.println("Modificacion del precio del producto " + art1.getNombre() + " en 5 eurillos");
            art1.setPrecio(7.5);
            precio = art1.getPrecio();
            System.out.println(precioIVA(precio));
    }
    
    public double precioIVA(double precio){
        return precio*0.21 + precio;
    }
}
