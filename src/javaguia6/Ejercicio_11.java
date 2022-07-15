/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia6;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int resultado;
        boolean salir = false;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = leer.nextInt();
        
        
        while(!salir){
            
            System.out.println("........MENU.......");
            System.out.println("1) SUMA.......");
            System.out.println("2) RESTA.......");
            System.out.println("3) MULTIPLICACION.......");
            System.out.println("4) DIVISION.......");
            System.out.println("5) SALIR.......");
            System.out.println("........ELIJA UNA OPCION:........");
            
        int op = leer.nextInt();
        
        switch(op){
            
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma es: "+resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("La resta es: "+resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicacion es: "+resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("La division es: "+resultado);
                break;
            case 5:
                
                System.out.println("Estas seguro que desea salir? (S/N)");
                String aceptar = leer.next();
                
                if ("S".equals(aceptar)) {
                    
                    salir = true;
                } 
                break;
                
            default:
                System.out.println("Elegir opciones dentro de 1 a 5...");
        
               }
        }
        
    }
    
}
