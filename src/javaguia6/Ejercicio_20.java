/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package javaguia6;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Ejercicio_20 {

    public static void main(String[] args) {

        int[][] matrixMagic = new int[3][3];

        System.out.println("Enter number from 1 to 9");
        
        CheckAndLoad(matrixMagic);

        CheckMatrizMagic(matrixMagic);
    }
    
    public static void CheckAndLoad(int[][] matrixMagic){
        
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                int number = read.nextInt();
                
                while (number < 0 && number > 10) {

                    System.out.println("Enter a valid number...");
                    number = read.nextInt();
                }
                matrixMagic[i][j] = number;

            }
        }    
    }

    public static void CheckMatrizMagic(int[][] matrixMagic) {

        int row = 0;
        int column = 0;
        int diagonal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                row += matrixMagic[i][j];
                column += matrixMagic[j][i];
                diagonal += matrixMagic[i][i];

            }
        }
        if (row == column && column == diagonal) {

            System.out.println("The matrix is magic");

        } else {

            System.out.println("The matriz is not magic");

        }
    }
}
