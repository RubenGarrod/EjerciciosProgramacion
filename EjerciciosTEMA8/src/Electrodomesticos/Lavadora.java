/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electrodomesticos;

/**
 *
 * @author AlumnoT
 */
public class Lavadora extends Electrodomestico {

    private double precio;
    private boolean aguaCaliente;

    public Lavadora( String marca, double potencia) {
        super("Lavadora", marca, potencia);
        precio = 0;
        aguaCaliente = false;
    }

    public Lavadora( String marca, double potencia, double precio, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
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
     * @return the aguaCaliente
     */
    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    /**
     * @param aguaCaliente the aguaCaliente to set
     */
    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public void imprimir() {
        System.out.println("La lavadora de la marca " + getMarca() + " tiene una potencia de " + getPotencia() + "kWs y su precio es de " + getPrecio() + " euros. Tiene agua caliente? " + isAguaCaliente());
    }

    @Override
    public double getConsumo(int horas) {
        if(aguaCaliente){
            return getPotencia() * horas + (getPotencia()*0.20);
        }else{
            return getPotencia() * horas;
        }
    }
}
