/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia6_extras;

import java.util.Scanner;

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int n = leer.nextInt();
        
        
        if (n > 0) {
            
            //CalcularConWhile(n);
            CalcularConDoWhile(n);

        }else{
            
            System.out.println("Ingrese una valor mayor a cero --> ");
        
        }
        
    }
    
    public static void CalcularConWhile(int n){
        
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        int max = 0;
        int min = 0;
        
        while (i < n) {
            
            System.out.println("Ingrese "+n+" numero --> "+ (i+1));
            int numero = leer.nextInt();
            
            suma += numero;
            
            if (min != 0 && max != 0) {

                if (numero > max) {

                    max = numero;

                } 
                if (numero < min) {

                    min = numero;

                } 

            }else {

                    min = numero;
                    max = numero;

                }

            i++;

        }
        
        System.out.println("El promedio de "+n+" numero es: "+(suma/n));   
        System.out.println("El numero maximo es: "+max);
        System.out.println("El numero minimo es: "+min);
    
    }
    
    public static void CalcularConDoWhile(int n){
        
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        int max = 0;
        int min = 0;
        
        do {            
            
            System.out.println("Ingrese "+n+" numero --> "+ (i+1));
            int numero = leer.nextInt();
            
            suma += numero;
            
            if (min != 0 && max != 0) {

                if (numero > max) {

                    max = numero;

                } 
                if (numero < min) {

                    min = numero;

                } 

            }else {

                    min = numero;
                    max = numero;

                }

            i++;
            
        } while (i < n);
        
        System.out.println("El promedio de "+n+" numero es: "+(suma/n));   
        System.out.println("El numero maximo es: "+max);
        System.out.println("El numero minimo es: "+min);
    
    }
    
}
