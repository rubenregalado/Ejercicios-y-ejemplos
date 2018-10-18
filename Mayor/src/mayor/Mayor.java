/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b,c;
        System.out.println("INGRESE LOS 3 NUMEROS QUE DESEA COMPARAR");
        Scanner entradaEscaner = new Scanner (System.in);
        a=entradaEscaner.nextInt();
        b=entradaEscaner.nextInt();
        c=entradaEscaner.nextInt();
        
        if (a<b){
            
            if(b>c){
            
             System.out.println("El numero mayor es: "+ b);   
        }else {
                System.out.println("El numero mayor es: "+ c); 
            }
        
       }else if(a>c){
            System.out.println("El numero mayor es: "+ a); 
        }else{
              System.out.println("El numero mayor es: "+ c); 
       }
        
    }
    
}
