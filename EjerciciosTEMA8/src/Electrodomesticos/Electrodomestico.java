/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electrodomesticos;

/**
 *
 * @author AlumnoT
 */
public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;
    
    public Electrodomestico(String tipo, String marca, double potencia){
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the potencia
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public void imprimir(){
        System.out.println("El electrodomestico de tipo " + getTipo() + " es de la marca " + getMarca() + " y tiene una potencia de " + getPotencia() + "kWs");
    }
    
    public double getConsumo(int horas){
        return getPotencia()*horas;
    }
    
    public double getCosteConsumo(int horas, double costeHora){
        return horas*costeHora;
    }
}
