/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personasmvc;

import ControladorPersonas.ControladorPersona;
import VistaPersonas.VistaPersona;

/**
 *
 * @author AlumnoT
 */
public class PersonasMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPersona vista = new VistaPersona();
        ControladorPersona controlador = new ControladorPersona(vista);
        
        controlador.iniciar();
    }
    
}
