package exceptions;

/**
 *
 * @author alumnot
 */
public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     * @throws java.lang.Exception
     */
    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("[ERROR] El nombre es demasiado corto, debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     * @throws java.lang.Exception
     */
    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("[ERROR] La edad no puede ser negativa.");
        }
        this.edad = edad;
    }
    public void imprimir() {
        System.out.println("Nombre del gato: " + nombre);
        System.out.println("Edad del minino: " + edad);
    }
}
