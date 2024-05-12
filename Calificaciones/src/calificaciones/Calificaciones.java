
package calificaciones;

import Controlador.ControladorAlumno;
import vista.VistaAlumno;

/**
 *
 * @author AlumnoT
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaAlumno vista = new VistaAlumno();
        ControladorAlumno controlador = new ControladorAlumno(vista);
        
        double [][] datos = vista.crearAlumno();
        controlador.iniciar(datos);
    }
    
}
