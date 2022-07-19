
package javaguia6;

import java.util.Scanner;


public class Ejercicio_14 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingresa la cantidad de euros a convertir");
        float euro = leer.nextFloat();
        
        System.out.println("Elige a que moneda quieres convertir");
        System.out.println("DOLAR");
        System.out.println("LIBRA");
        System.out.println("YENES");
        String moneda = leer.next();
        
        ConvertirMoneda(euro, moneda.toUpperCase());
        
    }
    
    public static void ConvertirMoneda(float euro, String moneda){
        
        switch(moneda){
        
            case "DOLAR":
                System.out.println(1.228611*euro+" dolar es "+ euro+" euro");
                break;
            case "LIBRA":
                System.out.println(0.86*euro+" libra es "+ euro+" euro");
                break;
            case "YENES":
                System.out.println(129.852*euro+" yenes es "+euro+" euro");
                break;
            default:
                System.out.println("Moneda incorrecta");
        
        }
    
    
    
    }
    
}
