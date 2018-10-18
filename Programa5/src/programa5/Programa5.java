/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       int maxElementos = 1;
       for (int contador = 0; contador<=maxElementos;contador ++){
           
       System.out.println("Ingrese un numero valido positivo y menor que 100");
       Scanner numero = new Scanner(System.in);
       num = numero.nextInt();
       
       if (num>-1 && num<100){
           
           
           System.out.println("Numero Valido (Positivo y menor 100)");
           break;
         
          
       }else{
         System.out.println("Numero no valido");  
         contador --;
       }    
     
    } 
 }        
}

