package pruebasbbdd;

import java.sql.*;

/**
 *
 * @author AlumnoT
 */
public class ConectorBBDD {

    private Connection conn;
    private final String URL;
    private final String DBUSER;
    private final String DBPASS;

    public ConectorBBDD(String url, String user, String pass) {
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
            conn.close();
        } catch (SQLException e) {
            System.err.println("[ERROR] No se ha podido cerrar la conexion con la base de datos: " + e.getMessage());
        }
    }

    public ResultSet obtenerVendedores() {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from vendedores");
            return rs;
        } catch (SQLException e) {
            System.err.println("[ERROR]");
        }
        return null;
    }

    public void actualizarNombreVendedor(String nombreAnterior, String nuevoNombre) {
        try {
            //Statement scrollable y modificable
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            //SELECT para obtener los vendedores
            String sql = "SELECT * FROM vendedores WHERE nombre = '" + nombreAnterior + "'";
            ResultSet rs = st.executeQuery(sql);

            //
            if (rs.next()) {
                //Se actualiza el nombre del vendedor
                rs.updateString("nombre", nuevoNombre);
                rs.updateRow();
                System.out.println("Nombre actualizado correctamente.");
            } else {
                System.err.println("[ERROR] No se encontro ningun vendedor con el nombre proporcionado.");
            }

            // Cerramos los recursos
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.err.println("[ERROR] Error al intentar actualizar el nombre del vendedor: " + e.getMessage());
        }
    }

    public void modificarSalario(String vendedor, double nuevoSalario) {
        try {

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sql = "SELECT * FROM vendedores WHERE nombre = '" + vendedor + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                rs.updateDouble("salario", nuevoSalario);
                rs.updateRow();
                System.out.println("Salario actualizado correctamente.");
            } else {
                System.err.println("[ERROR] No se encontro ningun vendedor con el nombre proporcionado.");
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            System.err.println("[ERROR] Error al intentar modificar el salario del vendedor: " + e.getMessage());
        }
    }

    public void insertarVendedor(String nombre, Date fechaIngreso, double salario) {
        try {
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            //SELECT para obtener la tabla de vendedores
            String tabla = "SELECT * FROM vendedores";
            ResultSet rs = st.executeQuery(tabla);

            //cursor a la fila de insercion
            rs.moveToInsertRow();

            rs.updateString("nombre", nombre);
            rs.updateDate("fecha_ingreso", fechaIngreso);
            rs.updateDouble("salario", salario);

            //nueva fila en la base de datos
            rs.insertRow();

            rs.close();
            st.close();

            System.out.println("Nuevo vendedor insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("[ERROR] Error al intentar insertar un nuevo vendedor: " + e.getMessage());
        }
    }

}
