/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherosprogramacion;

/**
 *
 * @author AlumnoT
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private double notaMedia;

    public Alumno(String nombre, String apellido, double notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getNotaMedia() {
        return notaMedia;
    }
}
