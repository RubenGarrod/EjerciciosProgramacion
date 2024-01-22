package ejerciciostema8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumnot
 */
public class Ejercicio1Tema9 {

    public static void imprimirCompra(ArrayList<Producto> compra) {
        System.out.println("\nAHORA CON WHILE:");
        Iterator<Producto> i = compra.iterator();
        while(i.hasNext()) { 
            Producto tmp = i.next();
            System.out.println("Producto: " + tmp.getNombre() + " Cantidad: " + tmp.getCantidad());
        }
        System.out.println("\nAHORA CON FOR:");
        for (Iterator<Producto> j = compra.iterator(); j.hasNext();) {
            Producto x = j.next();
            System.out.println("Producto: " + x.getNombre() + " Cantidad: " + x.getCantidad());
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> compra = new ArrayList<Producto>();

        Producto p1 = new Producto("Manzanas", 5);
        Producto p2 = new Producto("Panes", 10);
        Producto p3 = new Producto("Limones", 3);
        Producto p4 = new Producto("PCs", 200);
        Producto p5 = new Producto("Sandias", 9);

        compra.add(p1);
        compra.add(p2);
        compra.add(p3);
        compra.add(p4);
        compra.add(p5);
        
        imprimirCompra(compra);
        
        compra.remove(0);
        compra.remove(1);        

        compra.add(1, new Producto("Tabaco", 5));
        
        imprimirCompra(compra);
        
        if (compra.isEmpty()){
            System.out.println("LISTA DE COMPRA VACIA");
        } 
    }

}
