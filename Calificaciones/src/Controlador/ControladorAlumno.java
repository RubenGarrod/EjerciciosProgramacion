
package Controlador;
import modelo.Alumno;
import vista.VistaAlumno;

/**
 *
 * @author AlumnoT
 */
public class ControladorAlumno {
    
    private VistaAlumno vista;
    
    private Alumno[] alumnos;
    private double[][] calificaciones;
    private double[] medias;

    public ControladorAlumno(VistaAlumno vista) {
        this.vista = vista;
        this.alumnos = new Alumno[9];
        this.calificaciones = new double[9][3];
        this.medias = new double[9];
    }
    
    public void iniciar(double[][] datos){
        for (int i = 0; i < datos.length; i++) {
            double nota1p = datos[i][1];
            double nota2p = datos[i][2];
            double notaEf = datos[i][3];
            alumnos[i]= new Alumno(i+1, nota1p, nota2p, notaEf);
            
            calificaciones[i][0] = 1+i;
            calificaciones[i][1] = nota1p;
            calificaciones[i][2] = nota2p;
            calificaciones[i][3] = notaEf;
            medias[i]= alumnos[i].calcular_media();
        }
        vista.mostrarTabla(calificaciones,medias);
    }
    
}
