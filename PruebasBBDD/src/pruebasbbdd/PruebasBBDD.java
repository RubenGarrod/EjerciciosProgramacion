package pruebasbbdd;
import java.sql.*;

/**
 *
 * @author AlumnoT
 */
public class PruebasBBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            
            String url = "jdbc:mysql://localhost:3306/prueba?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url,"root","Dam2324");
            System.out.println("Connection successful.");
            
            Statement st = conn.createStatement();
            System.out.println("Statment generated.");
            
            ResultSet rs = st.executeQuery("SELECT * FROM vendedores");
            int numRegistros= st.executeUpdate("INSERT INTO vendedores (nombre, fecha_ingreso, salario)VALUES ('Ruben Autoincremento', '2022-03-01', 100000);");
            System.out.println("Numero de registros afectados: " + numRegistros);
            conn.close();
            
        } catch (Exception e) {
            System.err.println("[ERROR] No se ha podido establecer conexion con la base de datos: " + e.getMessage());
        }
    }
}
