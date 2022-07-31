/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Johana
 */

public class Ejercicio_21 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        
        CargarMatrizM(matrizM);
        ImprimirMatrizM(matrizM);
        CargarMatrizP(matrizP);
        BuscarMatrizPEnA(matrizM, matrizP);
    }
    
    
    public static void CargarMatrizM(int[][] matrizM){
        
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                matrizM[i][j] = new Random().nextInt(100);
                
            }
            
        }
        
    }
    
     public static void ImprimirMatrizM(int[][] matrizM){
         System.out.println("MATRIZ M");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                System.out.print("["+matrizM[i][j]+"]");
                
            }
            System.out.println("");
        }
    }
    
     public static void CargarMatrizP(int[][] matrizP){
         Scanner leer = new Scanner(System.in);
         System.out.println("......MATRIZ P......");
         
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Ingrese elemento...");
                int elemento = leer.nextInt();
                matrizP[i][j] = elemento;
                
            }
            System.out.println("");
        }
     
     }
     
     public static void BuscarMatrizPEnA(int[][] matrizM, int[][] matrizP){
         int k = 0;
         int l = 0;
         int[] vector = new int[3];
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 10; j++) {
                 
                 if(matrizM[i][j] == matrizP[k][j]){
                     
                     vector[0] = matrizM[i][j];
                     vector[1] = matrizM[i][j+1];
                     vector[2] = matrizM[i][j+2];
                     j=10;
                     
                    
                 }
                 
                  if(k == 2){
                         
                         i = 10;
                     
                     }
                 
                 if(Validar(vector, matrizP)){
                 
                    k += 1;
             
                 }
                 
             }
             
         }
         
         System.out.println("Matriz encontrada.......");
     
     
     }
     
     public static boolean Validar(int[] vector, int[][] matrizP){
         
         boolean esValido = false;
         for (int i = 0; i < 3; i++) {
             
             if(vector[i] == matrizP[0][i]){
                 
                 return !esValido;
             
             
             }
             
         }
     
     return esValido;
     
     }
}
