package Hashmap_Ejercicios;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author AlumnoT
 */
public class Instituto {

    private Map<String, Double> alumnosNotas = new HashMap<>();

    public void añadirAlumno(String nombre, Double notaMedia) throws exceptionNota {
        if (notaMedia == null) {
            throw new exceptionNota("La nota media no puede ser nula");
        }
        alumnosNotas.put(nombre, notaMedia);
    }

    public void imprimirDiccionarioAlumnos() {
        for (Iterator<Map.Entry<String, Double>> it = alumnosNotas.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Double> entry = it.next();
            System.out.println("Alumno: " + entry.getKey() + ", Nota Media: " + entry.getValue());
        }
    }

    public void mostrarAlumnosPorNota(Double notaMedia) {
        for (Iterator<Map.Entry<String, Double>> it = alumnosNotas.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Double> entry = it.next();
            if (entry.getValue().equals(notaMedia)) {
                System.out.println("Alumno: " + entry.getKey());
            }
        }
    }

    public int notasDistintas() {
        Set<Double> distintasNotas = new HashSet<>(alumnosNotas.values());
        return distintasNotas.size();
    }

    public void eliminarAlumnos() {
        alumnosNotas.clear();
    }

    public static void main(String[] args) {
        Instituto instituto = new Instituto();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduzca el nombre del alumno: ");
            String registro = sc.nextLine();
            System.out.println("Introducza su media: ");
            double mediaReg = sc.nextDouble();
            instituto.añadirAlumno(registro, mediaReg);
        } catch (exceptionNota e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("Diccionario de Alumnos:");
        instituto.imprimirDiccionarioAlumnos();

        System.out.println("\nAlumnos con nota 8.5:");
        instituto.mostrarAlumnosPorNota(8.5);

        System.out.println("\nNúmero de notas distintas: " + instituto.notasDistintas());

        instituto.eliminarAlumnos();
        System.out.println("\nDiccionario de Alumnos despues de eliminar:");
        instituto.imprimirDiccionarioAlumnos();
    }
}

class exceptionNota extends Exception {

    public exceptionNota(String msg) {
        super(msg);
    }
}
