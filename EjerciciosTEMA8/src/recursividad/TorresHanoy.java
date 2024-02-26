package recursividad;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class TorresHanoy {
    public static int contador = 0;
    public static void main(String[] args) {
        System.out.println("CCon cuentos discos quieres que resulva el problema de las torres de Hanoy?");
        Scanner sc = new Scanner(System.in);
        int numDiscos = sc.nextInt();
        char origen = 'O';
        char destino = 'D';
        char aux = 'A';
        calculoMovimientos(numDiscos, origen, destino, aux);
        System.out.println("Hubo " + contador + " movimientos");
    }

    public static void calculoMovimientos(int numDiscos, char origen, char destino, char aux) {
        if (numDiscos == 1) {
            mover_disco(numDiscos, origen, destino);
            contador++;
        } else {
            calculoMovimientos(numDiscos - 1, origen, aux, destino);
            mover_disco(numDiscos, origen, destino);
            calculoMovimientos(numDiscos - 1, aux, destino, origen);
            contador++;
        }
    }

    public static void mover_disco(int n, char origen, char destino) {
        System.out.println("Movimiento del disco " + n + " desde " + origen + " hasta " + destino);
    }
}
