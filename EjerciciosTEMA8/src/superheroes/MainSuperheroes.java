package superheroes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class MainSuperheroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Coleccion coleccion = new Coleccion("Coleccion vacia", new ArrayList<Figura>());
        Superheroe superheroe1 = new Superheroe("Capitán Rayo");
        superheroe1.setDescripcion("Controla la electricidad y vuela a la velocidad del rayo.");
        superheroe1.setCapa(true);

        Superheroe superheroe2 = new Superheroe("Sombra Nocturna");
        superheroe2.setDescripcion("Maestro del sigilo y las artes marciales. Siempre en la sombra.");
        superheroe2.setCapa(false);

        // Crear dimensiones ficticias para las figuras
        Dimension dimension1 = new Dimension(0.2, 0.1, 0.3);
        Dimension dimension2 = new Dimension(0.15, 0.12, 0.25);

        // Crear figuras ficticias asociadas a los superhéroes
        Figura figura1 = new Figura("FIG001", 29.99, superheroe1, dimension1);
        Figura figura2 = new Figura("FIG002", 24.99, superheroe2, dimension2);

        // Crear una colección llamada "Colección Héroes"
        Coleccion coleccionHeroes = new Coleccion("Colección Héroes", new ArrayList<>());
        coleccionHeroes.añadirFigura(figura1);
        coleccionHeroes.añadirFigura(figura2);

        // Crear otra colección llamada "Colección Míticos"
        Coleccion coleccionMíticos = new Coleccion("Colección Míticos", new ArrayList<>());



        while (true) {
            System.out.println("\n MENU DE OPCIONES");
            System.out.println("\t1. Añadir figura");
            System.out.println("\t2. Subir precio de figura");
            System.out.println("\t3. Mostrar figuras con capa");
            System.out.println("\t4. Figura más valiosa");
            System.out.println("\t5. Valor total de la colección");
            System.out.println("\t6. Volumen total de la colección");
            System.out.println("\t0. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese los detalles de la figura:");
                    System.out.println("Codigo: ");
                    String codigo = sc.next();
                    
                    System.out.println("Precio: ");
                    double precio = sc.nextDouble();
                    
                    System.out.println("Superheroe: ");
                    String nombreSuperheroe = sc.next();
                    
                    Superheroe superheroe = new Superheroe(nombreSuperheroe);

                    System.out.print("Descripcion de la figura: ");
                    String descripcion = sc.next();
                    superheroe.setDescripcion(descripcion);
                    
                    System.out.print("¿Lleva capa? (true/false): ");
                    boolean llevaCapa = sc.nextBoolean();
                    superheroe.setCapa(llevaCapa);
                    
                    System.out.print("Alto: ");
                    double alto = sc.nextDouble();
                    
                    System.out.print("Ancho: ");
                    double ancho = sc.nextDouble();
                    
                    System.out.print("Profundidad: ");
                    double profundidad = sc.nextDouble();

                    Dimension dimension = new Dimension(alto, ancho, profundidad);
                    Figura figura = new Figura(codigo, precio, superheroe, dimension);
                    
                    coleccion.añadirFigura(figura);

                    System.out.println("Figura agregada correctamente.");
                }
                case 2 -> {
                    System.out.print("Ingresa el codigo de la figura: ");
                    String codigo = sc.next();
                    try {
                        System.out.print("Ingrese la cantidad (en euros) en la que aumentar el precio: ");
                        double cantidad = sc.nextDouble();
                        coleccion.subirPrecio(cantidad, codigo);
                    } catch (PrecioException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 3 -> System.out.println(coleccion.conCapa());
                case 4 -> coleccion.masValiosa();
                case 5 -> System.out.println("Valor total de la coleccion: " + coleccion.getValorColeccion());
                case 6 -> System.out.println("Volumen total de la coleccion: " + coleccion.getVolumenColeccion());
                case 0 -> {
                    System.out.println("Programa finalizado.");
                    return;
                }
                default -> System.out.println("Opcion no valida. Introduzca una de las opciones del menu.");
            }
        }
    }
}
