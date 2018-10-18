/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1diassemana;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa1DiasSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        int maxElementos = 1;
        
        for (int contador = 0; contador <= maxElementos; contador++){
        System.out.println("Ingrese el numero del 1 al 7 del dia de la semana al que quiere ingresar");
        Scanner entradaEscaner = new Scanner(System.in); //Funcion que permite ingresar los datos ingresados por el usuario
        dia = entradaEscaner.nextInt();
        
        switch(dia){
            case 1:
            System.out.println("El dia que escogiste es: Domingo" );
            contador --;
            break;
            
            case 2:
            System.out.println("El dia que escogiste es: Lunes" );
            contador --;
            break;
            
            case 3:
            System.out.println("El dia que escogiste es: Martes" );
            contador --;
            break;
            
            case 4:
            System.out.println("El dia que escogiste es: Miercoles" );
            contador --;
            break;
            
            case 5:
            System.out.println("El dia que escogiste es: Jueves" );
            contador --;
            break;
            
            case 6:
            System.out.println("El dia que escogiste es: Viernes" );
            contador --;
            break;
            
            case 7:
            System.out.println("El dia que escogiste es: Sabado" );
            contador --;
            break;
            
            default:
            System.out.println("No valida");
            
            
                
        }
                
       }          
        
             
        
        
        
    }
    
}
