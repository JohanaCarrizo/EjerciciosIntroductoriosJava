

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. */


package javaguia6;

import java.util.Scanner;


public class Ejercicio_13 {

    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            
            for (int j = 1; j <= numero; j++) {
                
                
                 if (i==numero || i==1) {
                
                System.out.print("*");
                
                 }else if(j == 1 || j==numero){
                     
                     System.out.print("*");
                 
                 }else{
                 
                     System.out.print(" ");
                 }
                
            }
            
            System.out.println();
        }
        
    }
    
}
