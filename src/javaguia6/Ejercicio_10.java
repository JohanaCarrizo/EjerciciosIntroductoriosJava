/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

package javaguia6;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        System.out.println("Ingrese el limite de repeticiones");
        int i = leer.nextInt();
        
        while (i >= suma) {

            System.out.println("Ingrese un numero: ");
            int numero = leer.nextInt();
            suma += numero;
            
        }
        
        System.out.println("La suma de los n° intrudcidos superaron al limite");
        
    }
    
}
