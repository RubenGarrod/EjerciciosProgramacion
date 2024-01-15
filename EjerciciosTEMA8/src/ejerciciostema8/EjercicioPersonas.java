
package ejerciciostema8;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class EjercicioPersonas {

    public void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        
        Persona p1 = new Persona();
        System.out.println("Introduzca un nombre: ");
        p1.nombre = sc.nextLine();
        System.out.println("Introduzca el primer apellido: ");
        p1.apellido1 = sc.nextLine();
        System.out.println("Introduzca el segundo apellido: ");
        p1.apellido2 = sc.nextLine();
        System.out.println("Introduzca el DNI: ");
        p1.DNI = sc.nextLine();
        System.out.println("Introduzca la edad: ");
        p1.edad = sc.nextInt();
        int anos = p1.edad;
        if (mayorEdad(anos)){
            System.out.println(p1.nombre + " " + p1.apellido1 + " " + p1.apellido2 + " con DNI " + p1.DNI + " es mayor de edad.");
        } else {
            System.out.println(p1.nombre + " " + p1.apellido1 + " " + p1.apellido2 + " con DNI " + p1.DNI + " no es mayor de edad."); 
        }

    }

    public static boolean mayorEdad(int anos){
        if (anos < 18){
            return false;
        } else {
            return true;
        }
    }
}
