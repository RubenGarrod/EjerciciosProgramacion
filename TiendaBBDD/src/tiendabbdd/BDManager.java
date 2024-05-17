package tiendabbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.PreparedStatement;

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
            // Carga la clase del driver JDBC para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establece la conexión a la base de datos usando la URL, el usuario y la contraseña
            conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
            // Si la conexión es exitosa, devuelve true
            return true;
        } catch (Exception e) {
            // Si hay un error, imprime un mensaje de error y devuelve false
            System.err.println("[ERROR] No se ha podido establecer conexión con la base de datos: " + e.getMessage());
            return false;
        }
    }

    public void cerrarConexion() {
        try {
            // Cierra el ResultSet si no es nulo
            if (rs != null) {
                rs.close();
            }
            // Cierra la conexión si no es nula y está abierta
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            // Si hay un error, imprime un mensaje de error
            System.err.println("[ERROR] No se ha podido cerrar la conexion con la base de datos: " + e.getMessage());
        }
    }

    public boolean obtenerClientes() {
        try {
            // Crea un Statement con soporte para desplazamiento y actualizaciones
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // Ejecuta la consulta y obtiene un ResultSet con los datos de la tabla "clientes"
            rs = st.executeQuery("SELECT * FROM clientes");
            // Devuelve true si el ResultSet no es nulo
            return rs != null;
        } catch (SQLException e) {
            // Si hay un error, imprime un mensaje de error y devuelve false
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
            // Mueve el cursor al primer registro del ResultSet
            if (rs != null && rs.first()) {
                // Obtiene el nombre y la dirección del primer registro
                resultado[0] = rs.getString("nombre");
                resultado[1] = rs.getString("direccion");
            }
        } catch (SQLException e) {
            // Si hay un error, imprime un mensaje de error
            System.err.println("[ERROR] No se ha podido obtener el primer cliente: " + e.getMessage());
        }
        return resultado;
    }

    public String[] mostrarUltimo() {
        String[] resultado = new String[2];
        try {
            // Mueve el cursor al último registro del ResultSet
            if (rs != null && rs.last()) {
                // Obtiene el nombre y la dirección del último registro
                resultado[0] = rs.getString("nombre");
                resultado[1] = rs.getString("direccion");
            }
        } catch (SQLException e) {
            // Si hay un error, imprime un mensaje de error
            System.err.println("[ERROR] No se ha podido obtener el ultimo cliente: " + e.getMessage());
        }
        return resultado;
    }

    public String[] mostrarSiguiente() {
        String[] resultado = new String[2];
        try {
            // Mueve el cursor al siguiente registro del ResultSet
            if (rs != null && rs.next()) {
                // Obtiene el nombre y la dirección del siguiente registro
                resultado[0] = rs.getString("nombre");
                resultado[1] = rs.getString("direccion");
            }
        } catch (SQLException e) {
            // Si hay un error, imprime un mensaje de error
            System.err.println("[ERROR] No se ha podido obtener el siguiente cliente: " + e.getMessage());
        }
        return resultado;
    }

    public String[] mostrarAnterior() {
        String[] resultado = new String[2];
        try {
            // Mueve el cursor al registro anterior del ResultSet
            if (rs != null && rs.previous()) {
                // Obtiene el nombre y la dirección del registro anterior
                resultado[0] = rs.getString("nombre");
                resultado[1] = rs.getString("direccion");
            }
        } catch (SQLException e) {
            // Si hay un error, imprime un mensaje de error
            System.err.println("[ERROR] No se ha podido obtener el cliente anterior: " + e.getMessage());
        }
        return resultado;
    }

    public boolean insertarCliente(String nombre, String direccion) {
        try {
            // Crea un Statement con soporte para desplazamiento y actualizaciones
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // Ejecuta una consulta para obtener un ResultSet vacío con la estructura de la tabla "clientes"
            ResultSet rs = st.executeQuery("SELECT * FROM clientes WHERE 1=0"); // Seleccionamos una tabla vacía
            // Mueve el cursor a la fila de inserción
            rs.moveToInsertRow();
            // Actualiza los valores de las columnas "nombre" y "direccion"
            rs.updateString("nombre", nombre);
            rs.updateString("direccion", direccion);
            // Inserta la nueva fila en el ResultSet y la base de datos
            rs.insertRow();
            // Cierra el ResultSet y el Statement
            rs.close();
            st.close();

            /* OTRA FORMA DE AÑADIR REGISTROS*/
            //String sql = "INSERT INTO clientes (nombre, direccion) VALUES (?, ?)";
            //PreparedStatement pstmt = conn.prepareStatement(sql);
            //pstmt.setString(1, nombre);
            //pstmt.setString(2, direccion);
            //int rowsInserted = pstmt.executeUpdate();
            //return rowsInserted > 0;
            return true;
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido insertar el cliente: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarCliente(String nombreNuevo, String direccionNueva) {
        try {
            // Verifica que el ResultSet esté posicionado en un registro válido
            if (rs != null && !rs.isBeforeFirst() && !rs.isAfterLast()) {
                // Actualiza los valores del registro actual con los nuevos valores proporcionados
                rs.updateString("nombre", nombreNuevo);
                rs.updateString("direccion", direccionNueva);
                // Actualiza la fila en la base de datos
                rs.updateRow();
                return true; // Devuelve true si la actualización fue exitosa
            }
        } catch (SQLException e) {
            // Imprime un mensaje de error si ocurre una excepción SQL
            System.err.println("[ERROR] No se ha podido actualizar el cliente: " + e.getMessage());
        }
        return false; // Devuelve false si la actualización falla
    }

    public boolean eliminarClienteActual() {
        try {
            if (rs != null && !rs.isAfterLast() && !rs.isBeforeFirst()) {
                rs.deleteRow();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido eliminar el cliente actual: " + e.getMessage());
        }
        return false;
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
