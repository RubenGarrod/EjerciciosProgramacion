
package dawbank;

/**
 *
 * @author AlumnoT
 */
public class AvisarHaciendaException extends Exception{

    private String msg;

    /**
     *
     * @param msg
     */
    public AvisarHaciendaException(String msg) {
        msg = msg;
    }

    /**
     *
     * @return
     */
    public String lanzar() {
        return "Aviso a Hacienda: " + this.msg;
    }
}
