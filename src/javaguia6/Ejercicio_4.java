/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/



package javaguia6;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int F;
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de grado centigrados");
        int grado = leer.nextInt();
        
        F = 32 + (9 * grado/5);
        
        System.out.println("La conversion de grados a Fahrenheit: "+F);
        
    }
    
}
