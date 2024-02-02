package dawbank;

/**
 *
 * @author AlumnoT
 */
public class CuentaException extends Exception {

    private String msg;

    public CuentaException(String msg) {
        msg = msg;
    }

    public String lanzar() {
        return "Excepcion en la cuenta: " + this.msg;
    }
}
