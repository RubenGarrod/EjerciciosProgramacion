
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
    private ResultSet rs;

    public BDManager(String url, String user, String pass) {
        this.URL = url;
        this.DBUSER = user;
        this.DBPASS = pass;
    }

    public boolean obtenerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
            return true;
        } catch (Exception e) {
            System.err.println("[ERROR] No se ha podido establecer conexión con la base de datos: " + e.getMessage());
            return false;
        }
    }

    public void cerrarConexion() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido cerrar la conexion con la base de datos: " + e.getMessage());
        }
    }

    public boolean obtenerClientes() {
        try {
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("SELECT * FROM clientes");
            return rs != null;
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido obtener los clientes: " + e.getMessage());
            return false;
        }
    }

    public ResultSet obtenerClientesResultSet() {
        return rs;
    }

    public String[] mostrarPrimero() {
        String[] resultado = new String[2];
        try {
            if (rs != null && rs.first()) {
                resultado[0] = rs.getString("nombre");
                resultado[1] = rs.getString("direccion");
            }
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido obtener el primer cliente: " + e.getMessage());
        }
        return resultado;
    }

    public String[] mostrarUltimo() {
        String[] resultado = new String[2];
        try {
            if (rs != null && rs.last()) {
                resultado[0] = rs.getString("nombre");
                resultado[1] = rs.getString("direccion");
            }
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido obtener el último cliente: " + e.getMessage());
        }
        return resultado;
    }

    public String[] mostrarSiguiente() {
        String[] resultado = new String[2];
        try {
            if (rs != null && rs.next()) {
                resultado[0] = rs.getString("nombre");
                resultado[1] = rs.getString("direccion");
            }
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido obtener el siguiente cliente: " + e.getMessage());
        }
        return resultado;
    }

    public String[] mostrarAnterior() {
        String[] resultado = new String[2];
        try {
            if (rs != null && rs.previous()) {
                resultado[0] = rs.getString("nombre");
                resultado[1] = rs.getString("direccion");
            }
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido obtener el cliente anterior: " + e.getMessage());
        }
        return resultado;
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
