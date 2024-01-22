
package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class Producto {
    private String nombre;
    private int cantidad;
    
    public Producto(String nom, int cant){
        nombre =nom;
        cantidad = cant;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
