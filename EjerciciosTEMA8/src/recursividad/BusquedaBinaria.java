package recursividad;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class BusquedaBinaria {

    public static void main(String[] args) {
        int[] listaNum = {1, 3, 4, 6, 8, 10, 13, 14, 17, 18, 20, 21, 24, 25, 27, 29, 31};
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero quieres encontrar? (1, 3, 4, 6, 8, 10, 13, 14, 17, 18, 20, 21, 24, 25, 27, 29, 31) ");
        int num = sc.nextInt();
        int posicion = buscarNum(listaNum, num, 0, listaNum.length -1);
        if (posicion != -1) {
            System.out.println("Valor encontrado en la posicion: " + (posicion + 1) );
        } else {
            System.out.println("Valor no encontrado");
        }
    }

    public static int buscarNum(int[] listaNum, int num, int inicio, int fin) {
        if (inicio <= fin) {
            int mitad = inicio + (fin - inicio) / 2;
            if (listaNum[mitad] == num) {
                return mitad;
            } else if (listaNum[mitad] < num) {
                return buscarNum(listaNum, num, mitad + 1, fin);
            } else {
                return buscarNum(listaNum, num, inicio, mitad - 1);
            }
        }
        return -1;
    }
}
