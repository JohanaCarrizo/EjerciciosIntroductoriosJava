/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/


package javaguia6;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
        
    }
    
}
