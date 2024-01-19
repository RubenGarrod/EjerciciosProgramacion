
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
    private static final int mayoriaEdad = 18;
    private static final int jubilacionEdad = 65;

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
    /**
     * 
     */
    public void imprime() {
        System.out.println("DNI: " + dni + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad);
    }
    /**
     * 
     * @return 
     */
    public boolean esMayorEdad() {
        return edad >= mayoriaEdad;
    }
    /**
     * 
     * @return 
     */
    public boolean esJubilado() {
        return edad >= jubilacionEdad;
    }
    /**
     * 
     * @param p
     * @return 
     */
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad); //Math.abs devuelve el valor absoluto
    }
    /**
     * 
     * @param dni
     * @return 
     */
    public static boolean validarDNI(String dni) {
        String validador = "\\d{8}[A-HJ-NP-TV-Z]";
        return dni.matches(validador);
    }
}
