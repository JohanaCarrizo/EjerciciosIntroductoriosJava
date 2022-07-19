/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
 */
package javaguia6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {

        int[] vector = new int[10];

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero a buscar dentro del vector");
        int number = leer.nextInt();

        AgregarNumAlVector(vector);
        ImprimirVector(vector);
        BuscarEnVector(vector, number);

    }

    public static void AgregarNumAlVector(int[] vector) {

        for (int i = 0; i < 10; i++) {

            vector[i] = new Random().nextInt(25);

        }
    }

    public static void BuscarEnVector(int[] vector, int num) {

        int contador = 0;

        for (int i = 0; i < 10; i++) {

            if (vector[i] == num) {

                contador += 1;
                System.out.println("El numero se encuantra en las posiciones: " + i);

            }

        }

        if (contador == 0) {

            System.out.println("No se encontro el numero dentro del vector.");

        } else {

            System.out.println("Numero de apariciones --> " + contador);

        }

    }

    public static void ImprimirVector(int[] vectorIndice) {

        for (int i = 0; i < 10; i++) {

            System.out.print("[" + vectorIndice[i] + "] ");

        }

        System.out.println("");

    }

}
