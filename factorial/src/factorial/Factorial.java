
 //Hacer un programa que calcule el factorial de un numero dado por el usuario
package factorial;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato;
        int suma;
        int resultado =1; 
        
        System.out.println("Digite el numero dle que sea su factorial");
        Scanner numero = new Scanner(System.in);
        dato = numero.nextInt();
        
     
        for (int x=1;x<dato;x++){
            
            suma = x + 1;
            resultado = suma * resultado;
            System.out.println(resultado);
        }
    }
    
}
