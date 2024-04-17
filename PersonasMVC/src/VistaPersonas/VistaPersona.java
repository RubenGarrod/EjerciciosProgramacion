
package VistaPersonas;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class VistaPersona {
    
    public void Menu(){
        System.out.println("1. Importar datos desde un archivo CSV.");
        System.out.println("2. Mostrar los datos importados.");
        System.out.println("3. Filtrar datos por peso.");
        System.out.println("4. Ordenar datos alfabeticamente.");
        System.out.println("0. Salir.");
        System.out.print("Introduce una opcion: ");
    }
    
    public void mostrarDatosPersona(String s){
        System.out.println(s);
    }
    
    public String recogerDatos(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public void mostrarPantalla(String s){
        System.out.println(s);
    }
}
