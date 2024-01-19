package ejerciciostema8;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class EjercicioPersonas {

    public void Ejecutar() {
        Scanner sc = new Scanner(System.in);

        Persona persona1 = new Persona("11111158F", "Ruben", "Garcia", 26);
        persona1.imprime();

        System.out.print("Es mayor de edad? -> ");
        if (persona1.esMayorEdad()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        System.out.print("Es jubilado? -> ");
        if (persona1.esJubilado()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        Persona persona2 = new Persona("1618YY53W", "Onofre", "Genio", 33);
        System.out.println("La diferencia de edad entre " + persona1.getNombre() + " y " + persona2.getNombre() + " es de " + persona1.diferenciaEdad(persona2) + " anhos.");

        System.out.print("Es valido el DNI de " + persona1.getNombre() + "? ->");
        if (Persona.validarDNI(persona1.getDNI())) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        System.out.print("Es valido el DNI de " + persona2.getNombre() + "? ->");
        if (Persona.validarDNI(persona2.getDNI())) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
