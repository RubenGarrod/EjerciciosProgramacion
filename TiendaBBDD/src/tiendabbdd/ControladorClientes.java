/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendabbdd;

/**
 *
 * @author AlumnoT
 */
public class ControladorClientes {
    public static boolean ConectarBBDD(){
        try {
            BDManager.loadDriver();
            return BDManager.obtenerConexion();
        }catch (Exception e){
            System.err.println(e.getMessage());
            return false;
        }
    }
}
