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
        
        Coleccion coleccionVacia = new Coleccion("Ninguna Coleccion seleccionada", new ArrayList<Figura>());
        
        Superheroe superheroe1 = new Superheroe("Capitan Rayo");
        superheroe1.setDescripcion("Controla la electricidad y vuela a la velocidad del rayo.");
        superheroe1.setCapa(true);

        Superheroe superheroe2 = new Superheroe("Sombra Nocturna");
        superheroe2.setDescripcion("Maestro del sigilo y las artes marciales. Siempre en la sombra.");
        superheroe2.setCapa(false);
        
        Superheroe superheroe3 = new Superheroe("Superman");
        superheroe3.setDescripcion("El mismisimo superman es super y es man");
        superheroe3.setCapa(true);


        Dimension dimension1 = new Dimension(120, 15, 20);
        Dimension dimension2 = new Dimension(70, 40, 40);
        Dimension dimension3 = new Dimension(205, 120, 70);

        Figura figura1 = new Figura("FIG001", 29.99, superheroe1, dimension1);
        Figura figura2 = new Figura("FIG002", 24.99, superheroe2, dimension2);
        Figura figura3 = new Figura("FIG003", 49.99, superheroe3, dimension2);
        Figura figura4 = new Figura("FIG004", 99.99, superheroe3, dimension3);

        Coleccion coleccionHeroes = new Coleccion("Coleccion Heroes", new ArrayList<>());
        coleccionHeroes.añadirFigura(figura1);
        coleccionHeroes.añadirFigura(figura2);

        Coleccion coleccionMiticos = new Coleccion("Coleccion Miticos", new ArrayList<>());
        coleccionMiticos.añadirFigura(figura3);
        coleccionMiticos.añadirFigura(figura4);


        while (true) {
            System.out.println("\n MENU DE OPCIONES");
            System.out.println("Coleccion actual: " + coleccionVacia.getNombreColeccion());
            System.out.println("\t1. Seleccionar Coleccion para operar");
            System.out.println("\t2. Registrar nueva figura");
            System.out.println("\t3. Subir precio de un figura");
            System.out.println("\t4. Mostrar figuras con capa");
            System.out.println("\t5. Figura mas valiosa");
            System.out.println("\t6. Valor total de la coleccion");
            System.out.println("\t7. Volumen total de la coleccion");
            System.out.println("\t0. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\t1. Coleccion Heroes");
                    System.out.println("\t2. Coleccion Miticos");
                    int eleccion = sc.nextInt();
                    if (eleccion == 1){
                        coleccionVacia = coleccionHeroes;
                    } else if (eleccion == 2){
                        coleccionVacia = coleccionMiticos;
                    }
                }
                case 2 -> {
                    System.out.println("Ingrese los detalles de la figura:");
                    System.out.println("Codigo: ");
                    String codigo = sc.next();
                    
                    System.out.println("Precio: ");
                    double precio = sc.nextDouble();
                    
                    System.out.println("Superheroe: ");
                    String nombreSuperheroe = sc.next();
                    
                    Superheroe superheroe = new Superheroe(nombreSuperheroe);

                    System.out.print("Descripcion de la figura: ");
                    String descripcion = sc.nextLine();
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
                    
                    coleccionVacia.añadirFigura(figura);

                    System.out.println("Figura agregada correctamente.");
                }
                case 3 -> {
                    System.out.print("Ingresa el codigo de la figura: ");
                    String codigo = sc.next();
                    try {
                        System.out.print("Ingrese la cantidad (en euros) en la que aumentar el precio: ");
                        double cantidad = sc.nextDouble();
                        coleccionVacia.subirPrecio(cantidad, codigo);
                    } catch (PrecioException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 4 -> System.out.println(coleccionVacia.conCapa());
                case 5 -> coleccionVacia.masValiosa();
                case 6 -> System.out.println("Valor total de la coleccion: " + coleccionVacia.getValorColeccion());
                case 7 -> System.out.println("Volumen total de la coleccion: " + coleccionVacia.getVolumenColeccion());
                case 0 -> {
                    System.out.println("Programa finalizado.");
                    return;
                }
                default -> System.out.println("Opcion no valida. Introduzca una de las opciones del menu.");
            }
        }
    }
}
