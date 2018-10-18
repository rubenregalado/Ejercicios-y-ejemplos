/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmultiplicar;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ExamenMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int resultado;
        
        System.out.println("Ingrese el numero de la tabla que desea desplegar");
        Scanner entradaScanner = new Scanner (System.in);
        a = entradaScanner.nextInt();
        
        for(int tabla=1;tabla<=10;tabla++){
        resultado=a*tabla;
        System.out.println(+ a +" * " + tabla +" = " + resultado);
        }
        
        
        
        
    }
    
}
