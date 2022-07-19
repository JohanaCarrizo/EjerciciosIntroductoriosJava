
package javaguia6;

public class Ejercicio_15 {

    public static void main(String[] args) {
        
        int[] vector = new int[100];
        
        CargarVector(vector);
        InvertirOrden(vector);
        
        
    }
    
    public static void CargarVector(int[] vector){
        
        for (int i = 0; i < 100; i++) {
            
            vector[i] = i+1;
            
        }
    }
    
    public static void InvertirOrden(int[] vector){
        
        for (int i = 99; i >= 0; i--) {
            
            System.out.print((vector[i])+", ");
            
        }
    }
}
