/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia6_extras;

/**
 *
 * @author Johana
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        
        System.out.println("A = " +A+ " B = " +B+ " C = " +C+ " D = " +D);
        Intercambiar(A,B,C,D);
        
    }
    
    public static void Intercambiar(int A, int B, int C, int D){
        
        int aux = 0;
        
        aux = B;
        B = C;
        C = A;
        A = D;
        
        System.out.println("Valores intercambiados ");
        System.out.print("A = " +D+ " B = " +B+ " C = " +C+ " D = " +aux);
    
    
    }
    
}
