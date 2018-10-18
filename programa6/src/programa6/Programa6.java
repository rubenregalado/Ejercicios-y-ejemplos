/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int j=1;
        for(int contador = 0; contador<= j; contador ++){
        System.out.println("Ingrese un numero menor que 50");
        Scanner numero = new Scanner(System.in);
        num = numero.nextInt();
        
        if (num < 50){
            System.out.println("Numero Valido");
            break;
        }else{
            System.out.println("Numero invalido");
            contador --;
        }
           
    }
   }  
}
