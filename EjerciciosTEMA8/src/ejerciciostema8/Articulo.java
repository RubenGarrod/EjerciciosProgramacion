
package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class Articulo {

    private String nombre;
    private double precio;
    private int cuantosQuedan;
    private final double IVA21 = 0.21;
    private final double IVA10 = 0.10;
    private final double IVA4 = 0.04;
    private double tipoIVA;

    public Articulo(String nombre, double precio, int cuantosQuedan) {
        if (nombre == null || nombre.isEmpty() || precio < 0 || cuantosQuedan < 0) {
            System.out.println("Alguno de los valores no es valido. No ha sido regustrado el articulo.");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.cuantosQuedan = cuantosQuedan;
            this.tipoIVA = tipoIVA;
            System.out.printf("Articulo registrado correctamente");
        }
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
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Nombre vacio, escriba un nombre para el articulo.");
        } else {
            this.nombre = nombre;
        }
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("El precio no puede ser negativo.");
        } else {
            this.precio = precio;
        }
    }

    /**
     * @return the cuantosQuedan
     */
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    /**
     * @param cuantosQuedan the cuantosQuedan to set
     */
    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan < 0) {
            System.out.println("La cantidad restante no puede ser negativa.");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }
    }
    /**
     * 
     * @param tipoIVA 
     */
    public void setTipoIVA(double tipoIVA) {
        if (tipoIVA != IVA21 && tipoIVA != IVA10 && tipoIVA != IVA4) {
            System.out.println("Tipo de IVA no valido.");
        } else {
            this.tipoIVA = tipoIVA;
        }
    }
    /**
     * 
     * @return 
     */
    public double getPVP() {
        double precioConIva = precio * (1 + tipoIVA / 100.0);
        return precioConIva;
    }
    /**
     * 
     * @param descuento
     * @return 
     */
    public double getPVPDescuento(double descuento) {
        double precioConDescuento = precio * (1 - descuento / 100);
        double precioConDescuentoEIVA = precioConDescuento * (1 + tipoIVA / 100.0);
        return precioConDescuentoEIVA;
    }
    /**
     * 
     * @param cantidad
     * @return 
     */
    public boolean vender(int cantidad) {
        if (cantidad <= cuantosQuedan) {
            cuantosQuedan -= cantidad;
            return true;
        } else {
            return false;
        }
    }
    /**
     * 
     * @param cantidad
     * @return 
     */
    public boolean almacenar(int cantidad) {
        cuantosQuedan += cantidad;
        return true;
    }
    /**
     * 
     */
    public void imprimir() {
        System.out.printf("Nombre: %s%nPrecio: %.2f€ (IVA incluido)%nCantidad disponible: %d%n", nombre, getPVP(), cuantosQuedan);
    }

}
