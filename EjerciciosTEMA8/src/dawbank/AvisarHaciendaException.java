
package dawbank;

/**
 *
 * @author AlumnoT
 */
public class AvisarHaciendaException extends Exception{

    private String msg;

    public AvisarHaciendaException(String msg) {
        msg = msg;
    }

    public String lanzar() {
        return "Aviso a Hacienda: " + this.msg;
    }
}
