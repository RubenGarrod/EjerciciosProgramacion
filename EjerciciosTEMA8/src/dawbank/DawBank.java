package dawbank;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class DawBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido al sistema de DawBank");
        System.out.println("Por favor, introduzca los datos de su cuenta bancaria:");
        System.out.print("IBAN: ");
        String iban = sc.nextLine();
        /*while (!(iban.matches("^[A-Z][2]\\d[22]"))){ 
            System.out.print("[ERROR] Vuelva a introducir el IBAN: ");
            iban = sc.nextLine();
        }*/
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        CuentaBancaria c1 = new CuentaBancaria(iban, titular);
        System.out.println("Cuenta creada correctamente.");

        do {
            System.out.println("\nMenu principal:");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. Mostrar IBAN");
            System.out.println("3. Mostrar Titular");
            System.out.println("4. Mostrar Saldo");
            System.out.println("5. Realizar Ingreso");
            System.out.println("6. Realizar Retirada");
            System.out.println("7. Mostrar Movimientos");
            System.out.println("8. Salir");
            System.out.print("Por favor, seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();//Buffer
            switch (opcion) {
                case 1 ->
                    c1.datosCuenta();
                case 2 ->
                    System.out.println("IBAN: " + c1.getIban());
                case 3 ->
                    System.out.println("Titular: " + c1.getTitular());
                case 4 ->
                    System.out.println("Saldo actual: " + c1.getSaldo() + " euros");
                case 5 -> {
                    System.out.print("Cantidad a ingresar: ");
                    double cantidadIngreso = sc.nextDouble();
                    sc.nextLine();
                    c1.ingreso(cantidadIngreso);
                    System.out.println("Ingreso realizado");
                }
                case 6 -> {
                    System.out.print("Cantidad a retirar: ");
                    double cantidadRetirada = sc.nextDouble();
                    sc.nextLine();
                    c1.retirada(cantidadRetirada);
                    System.out.println("Saldo restante: " + c1.getSaldo());
                }
                case 7 -> {
                    System.out.println("Movimientos:");
                    for (Iterator<String> it = c1.getMovimientos().iterator(); it.hasNext();) {
                        String movimiento = it.next();
                        System.out.println(movimiento);
                    }
                }
                case 8 ->
                    System.out.println("Hasta la proxima");
                default ->
                    System.out.println("[ERROR] por favor introduzca una de las opciones del menu.");
            }
        } while (opcion != 8);
    }
}
