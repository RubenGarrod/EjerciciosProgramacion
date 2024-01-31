/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class ejercicio7 {

    public static void main(String[] args) {
        ArrayList<Gato> misGatetes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Introduce el nombre del gato " + (i + 1) + ":");
                String nombre = sc.nextLine();

                System.out.println("Introduce la edad del gato " + (i + 1) + ":");
                int edad = sc.nextInt();
                Gato nuevoGato = new Gato(nombre, edad);
                misGatetes.add(nuevoGato);
            } catch (Exception e) {
                System.out.println("[ERROR] VUELVE A INTENTARLO.");
                i--;
            }
            sc.nextLine();
        }
        System.out.println("\nMis gatetes:");
        for (Iterator<Gato> it = misGatetes.iterator(); it.hasNext();) {
            Gato gato = it.next();
            gato.imprimir();
        }

    }
}
