package ejerciciostema8;

import java.util.Scanner;



/**
 *
 * @author alumnot
 */
public class EjerciciosMAIN {

    /**
     * Es el método main de la clase EjerciciosTEMA8 y contiene un switch para
     * ejecutar el ejercicio deseado.
     *
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduce el numero del ejercicio que quieres ejecutar:");
            int ejercicio = sc.nextInt();

            switch (ejercicio) {
                case 1 -> {
                    EjercicioPuntos ej1 = new EjercicioPuntos();
                    ej1.Ejecutar();
                }
                case 2 -> {
                    EjercicioPersonas ej2 = new EjercicioPersonas();
                    ej2.Ejecutar();
                }
                case 3 -> {
                    EjercicioRectangulo ej3 = new EjercicioRectangulo();
                    ej3.Ejecutar();
                }
                case 4 -> {
                    EjercicioArticulos ej4 = new EjercicioArticulos();
                    ej4.Ejecutar();
                }
            }
        }
        
    }
}
