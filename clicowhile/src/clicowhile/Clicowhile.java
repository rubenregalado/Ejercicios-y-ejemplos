/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clicowhile;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Clicowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca el numero de repeticiones") ;
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in);
        maxElementos = entradaEscaner.nextInt();
        int contador = 0;
        
        
        while(contador <= maxElementos){
            System.out.println("contador " + contador);
            contador++;
            
        }
    }
    
}
