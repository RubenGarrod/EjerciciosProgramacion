
package superheroes;

/**
 *
 * @author AlumnoT
 */
public class PrecioException extends Exception{
    
    private String msg;

    public PrecioException(String msg) {
        msg = msg;
    }

    public String lanzar() {
        return "Excepcion en el precio: " + this.msg;
    }
}
