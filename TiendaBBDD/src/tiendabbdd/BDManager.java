
package tiendabbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AlumnoT
 */
public class BDManager {
    private Connection conn;
    private final String URL;
    private final String DBUSER;
    private final String DBPASS;

    public BDManager(String url, String user, String pass) {
        this.URL = url;
        this.DBUSER = user;
        this.DBPASS = pass;
    }

    public boolean obtenerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            setConn(DriverManager.getConnection(getURL(), getDBUSER(), getDBPASS()));
            return true;
        } catch (Exception e) {
            System.err.println("[ERROR] No se ha podido establecer conexión con la base de datos: " + e.getMessage());
            return false;
        }
    }

    public void cerrarConexion() {
        try {
            getConn().close();
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido cerrar la conexion con la base de datos: " + e.getMessage());
        }
    }
    void mostrarPrimero(){

    }
    public ResultSet obtenerClientes() {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes");
            return rs;
        } catch (SQLException e) {
            System.err.println("[ERROR]");
        }
        return null;
    }
    
    private void muestraDatosClientes(){

    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @return the URL
     */
    public String getURL() {
        return URL;
    }

    /**
     * @return the DBUSER
     */
    public String getDBUSER() {
        return DBUSER;
    }

    /**
     * @return the DBPASS
     */
    public String getDBPASS() {
        return DBPASS;
    }
}
