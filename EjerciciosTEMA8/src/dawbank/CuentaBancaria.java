package dawbank;

import java.util.ArrayList;

/**
 *
 * @author AlumnoT
 */
public class CuentaBancaria {

    private final String iban;
    private final String titular;
    private double saldo;
    private final ArrayList<String> movimientos;
    /**
     * Constructor de la clase CuentaBancaria
     * @param iban
     * @param titular 
     */
    public CuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }
    /**
     * Funcion que recibe una cantidad a ingresar en la cuenta bancaria si es 
     * mayor que 0 actualiza el saldo, si es menor notifica el error.
     * @param cantidad 
     * @throws dawbank.CuentaException 
     */
    public void ingreso(double cantidad) throws CuentaException {
        if (cantidad > 0) {
            setSaldo(getSaldo() + cantidad);
            getMovimientos().add("Ingreso de " + cantidad + " creditos");
        } else {
            throw new CuentaException("[ERROR] Ingrtesar una cantidad negativa es un retirada.");
        }
    }
    /**
     * Función que recibe una cantidad a retirar de la cuenta y realiza 3 comprobaciones:
     * La primera que la cantidad a retirar sea un numero positivo, si no lo es dará un error.
     * La segunda si la cuenta tras retirar la cantidad recibida resulta con un saldo menor que -50:
     *         Si queda con un saldo menor que -50 dara error.
     *         Si queda por encima retirará esa cantidad de la cuenta y actulizara el saldo.
     * La tercera si la cantidad es mayor a 3000 avisa al usuario de que se notificará a hacienda el movimiento.
     * @param cantidad 
     * @throws dawbank.CuentaException 
     * @throws dawbank.AvisarHaciendaException 
     */
    public void retirada(double cantidad) throws CuentaException, AvisarHaciendaException {
        if (cantidad > 0) {
            if (getSaldo() - cantidad >= -50) {
                setSaldo(getSaldo() - cantidad);
                getMovimientos().add("Retirada de " + cantidad + " creditos");
                if (cantidad > 3000) {
                    throw new AvisarHaciendaException("AVISO: Notificar a hacienda");
                }
            } else {
                throw new CuentaException("[ERROR] Saldo negativo, no podemos permitir una cuenta con una deuda mayor a 50 creditos");
            }
        } else {
            throw new CuentaException("[ERROR] Retirar una cantidad negativa es un ingrerso.");
        }
    }

    /**
     * Método de la clase CuentaBancaria que muestra la informacion de la cuenta
     * (IBAN, titular y saldo)
     */
    public void datosCuenta() {
        System.out.println("IBAN: " + getIban());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo() + " creditos");
    }

    /**
     * @return the iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the movimientos
     */
    public ArrayList<String> getMovimientos() {
        return movimientos;
    }
}
