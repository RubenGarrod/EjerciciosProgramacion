
package Agenda;

/**
 *
 * @author AlumnoT
 */
public class Contacto {
    private String nombre;
    private String numero;
    
    public Contacto(String nombre, String numero){
        this.nombre = nombre;
        this.numero = numero;
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
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
