package pruebasbbdd;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class PruebasBBDD {

    private final String URL = "jdbc:mysql://localhost:3306/prueba?serverTimezone=UTC";
    private final String DBUSER = "root";
    private final String DBPASS = "Dam2324";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            //Para evitar el error -non-static variable cannot be referenced from a static context- instanciamos un objeto PruebasBBDD para acceder a las variables a traves de los getters
            PruebasBBDD prueba = new PruebasBBDD();
            ConectorBBDD con = new ConectorBBDD(prueba.getURL(), prueba.getDBUSER(), prueba.getDBPASS());
            if (con.obtenerConexion()) {
                System.out.println("Connection successful.");
                int opcion;
                do {
                    System.out.println("Menu:");
                    System.out.println("1. Modificar nombre de un vendedor");
                    System.out.println("2. Modificar salario de un vendedor");
                    System.out.println("3. Ver informacion de los vendedores");
                    System.out.println("4. Registrar nuevo vendedor");
                    System.out.println("5. Eliminar un vendedor");
                    System.out.println("6. Salir del programa");
                    System.out.print("Seleccione una opcion: ");
                    opcion = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer de entrada

                    switch (opcion) {
                        case 1:
                            System.out.println("Introduzca el nombre del vendedor a modificar: ");
                            String nombreVendedor = sc.nextLine();
                            System.out.println("Introduzca el nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            con.actualizarNombreVendedor(nombreVendedor, nuevoNombre);
                            break;
                        case 2:
                            System.out.println("Introduzca el nombre del vendedor cuyo salario quiera modificar: ");
                            String nombre2 = sc.nextLine();
                            System.out.println("Introduzca el nuevo salario: ");
                            double nuevoSalario = sc.nextDouble();
                            con.modificarSalario(nombre2, nuevoSalario);
                            break;
                        case 3:
                            ResultSet a = con.obtenerVendedores();
                            while (a.next()) {
                                System.out.println("Nombre: " + a.getNString("nombre"));
                                System.out.println("Salario: " + a.getDouble("salario") + "\n");
                            }
                            break;
                        case 4:
                            System.out.println("Introduzca el nombre del nuevo vendedor: ");
                            String nombre = sc.nextLine();
                            System.out.println("Introduzca la fecha de ingreso (YYYY-MM-DD): ");
                            String fechaString = sc.nextLine();
                            Date fechaIngreso = Date.valueOf(fechaString);
                            System.out.println("Introduzca el salario del nuevo vendedor: ");
                            double salario = sc.nextDouble();
                            con.insertarVendedor(nombre, fechaIngreso, salario);
                            break;
                        case 5:
                            break;
                        case 6:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opcion no valida.");
                    }
                } while (opcion != 6);
            } else {
                System.err.println("[ERROR] No se pudo establecer conexión con la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("[ERROR] SQL Exception: " + e.getMessage());
        }
    }

    // Creamos una nueva conexión a la base de datos 'prueba'
    //int numRegistros= st.executeUpdate("INSERT INTO vendedores (nombre, fecha_ingreso, salario)VALUES ('Ruben Autoincremento', '2022-03-01', 100000);");
    //System.out.println("Numero de registros afectados: " + numRegistros);
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
