/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenCalculadora;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CalculadoraUsuario {
    
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int op;
        int resultado;
        int maxElementos = 1;
        
        calculadora operacion = new calculadora();
        for (int contador=1;contador<=maxElementos;contador++){
        System.out.println("Menu de la Calculadora");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Division");
        System.out.println("4.Multiplicacion");
        System.out.println("5.Promedio");
        
        Scanner entradaEscaner = new Scanner(System.in); 
        op = entradaEscaner.nextInt(); 
        System.out.println("Ingrese dos numeros para realizar la operacion");
        a = entradaEscaner.nextInt();
        b = entradaEscaner.nextInt();
        
        
        
        switch (op){
            case 1: 
                  
                  resultado = operacion.suma(a,b);
                  System.out.println("El resultado de la suma es: " + resultado);
                  contador--;
                  break;
            case 2: 
                  resultado = operacion.resta(a,b);
                  System.out.println("El resultado de la resta es: " + resultado);
                  contador--;
                  break;
                
            case 3: 
                  resultado = operacion.division(a,b);
                  System.out.println("El resultado de la multiplicacion es: " + resultado);
                  contador--;
                  break;
            case 4: 
                  resultado = operacion.multiplicacion(a,b);
                  System.out.println("El resultado de la division es: " + resultado);
                  contador--;
                  break;
            case 5: 
                  resultado = operacion.promedio(a,b);
                  System.out.println("El promedio de los numeros ingresos es: " + resultado);
                  contador--;
                  break;
            
                  
            default:
                System.out.println("No valida");
        }
       
      }
    }
}
