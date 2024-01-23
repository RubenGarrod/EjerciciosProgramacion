/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciostema8;

/**
 *
 * @author alumnot
 */
public class Perro extends Mascota {
    String raza;
    boolean pulgas;
    
    public Perro(String nombre, int edad, String estado, String fecha, String raza, boolean pulgas){
        super(nombre,edad,estado,fecha);
        raza = raza;
        pulgas = pulgas;
    }
}
