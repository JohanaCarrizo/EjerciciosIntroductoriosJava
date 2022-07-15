/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Crear un programa que dado un numero determine si es par o impar.*/

package javaguia6;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        
        if (numero % 2 == 0) {
            
            System.out.println("El numero "+numero+ " es PAR");
            
        } else {
            
            System.out.println("El numero "+numero+ " es IMPAR");
        }
    }
    
}
