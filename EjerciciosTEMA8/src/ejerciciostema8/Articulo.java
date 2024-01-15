/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class Articulo {
    String nombre;
    double precio;
    int cuantosQuedan;
    
    public Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
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
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
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
        this.cuantosQuedan = cuantosQuedan;
    }
}
