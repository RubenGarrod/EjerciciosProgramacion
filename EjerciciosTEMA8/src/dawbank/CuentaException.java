package dawbank;

/**
 *
 * @author AlumnoT
 */
public class CuentaException extends Exception {

    private String msg;

    /**
     *
     * @param msg
     */
    public CuentaException(String msg) {
        super(msg);
    }

    /**
     *
     * @return
     */
    public String lanzar() {
        return "Excepcion en la cuenta: " + this.msg;
    }
}
