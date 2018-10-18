/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class CicloDOwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ïntroduzca el numero de repeticiones");
        int maxElementos;
        Scanner entradaScaner = new Scanner(System.in);
        maxElementos = entradaScaner.nextInt();
        int contador = 0;
        
        
        
    
        
        do{
            System.out.println("Contador "+ contador);
            contador++;
        }while(contador <= maxElementos);
    }
    
}
