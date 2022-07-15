/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
* Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
* Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas.
*/

package javaguia6;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int contCorrecto = 0;
        int contIncorrecto = 0;
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese la cadena: ");
        String cadena = leer.next();
        
        while(!"&&&&&".equals(cadena)){
            
            if (cadena.length() == 5) {
                
                    char letraInicial = cadena.charAt(0);
                    char letraFinal = cadena.charAt(4);
                    
                    if(letraInicial == 'X' && letraFinal == 'O'){
                    
                        contCorrecto = contCorrecto + 1;
                    
                    }else{
                    
                         contIncorrecto = contIncorrecto + 1;
                    }
            }
            else {
                
                System.out.println("Formato de cadena incorrecto");
            } 
            
            System.out.println("Ingrese cadena: ");
            cadena = leer.next();
        }
        
        System.out.println("La cantidad de lectura correctas: "+ contCorrecto);
        System.out.println("La cantidad de lectura Incorrectas: "+ contIncorrecto);
    }
    
}
