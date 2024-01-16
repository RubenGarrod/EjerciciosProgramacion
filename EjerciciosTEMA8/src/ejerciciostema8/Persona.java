/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class Persona {
    private String nombre;
    private String dni;
    private String apellido;
    private int edad;
    
    public Persona(String dni, String nombre, String apellido, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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
     * @return the DNI
     */
    public String getDNI() {
        return dni;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.dni = DNI;
    }

    /**
     * @return the apellido1
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido1 to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
