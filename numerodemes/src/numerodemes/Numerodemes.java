/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodemes;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Numerodemes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int mes;
      int maxElementos = 0;
      
      for(int contador = 0; contador<=maxElementos;contador ++){
          
          System.out.println("Digite el numero de mes");
          Scanner numeromes = new Scanner (System.in);
          mes = numeromes.nextInt();
          
          switch(mes){
              case 1:
                  System.out.println("El mes elegido es Enero");
                  contador --;
                  break;
              case 2:
                  System.out.println("El mes elegido es Febrero");
                  contador --;
                  break;  
               
              case 3:
                  System.out.println("El mes elegido es Marzo");
                  contador --;
                  break;
                  
              case 4:
                  System.out.println("El mes elegido es Abril");
                  contador --;
                  break;
                  
              case 5:
                  System.out.println("El mes elegido es Mayo");
                  contador --;
                  break;
                  
              case 6:
                  System.out.println("El mes elegido es Junio");
                  contador --;
                  break;
                  
              case 7:
                  System.out.println("El mes elegido es Julio");
                  contador --;
                  break;
                  
              case 8:
                  System.out.println("El mes elegido es Agosto");
                  contador --;
                  break;
                  
              case 9:
                  System.out.println("El mes elegido es Septiembre");
                  contador --;
                  break;
                  
              case 10:
                  System.out.println("El mes elegido es Octubre");
                  contador --;
                  break;
                  
              case 11:
                  System.out.println("El mes elegido es Noviembre");
                  contador --;
                  break;
                  
              case 12:
                  System.out.println("El mes elegido es Diciembre");
                  contador --;
                  break;
                  
                  
             
                  
              
          }
          
          
          
      }
        
        
    }
    
}
