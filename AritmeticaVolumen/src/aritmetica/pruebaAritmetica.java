/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class pruebaAritmetica {
    public static void main (String args[]){
        //Creamos objeto de la clase arimetica 
        int op;
        int resultado;
        int a=0, b=0,c=0; 
        int maxElementos = 1; //Contador para regresar despues de realizada una operacion
        
        aritmetica1 operacion = new aritmetica1();//Llamada al metodo 
        //Ciclo para volver al menu
        for (int contador = 0; contador <= maxElementos; contador++){
        //Menu
        System.out.println("Elija un una de las siguientes operaciones aritmeticas");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTILICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.Volumen de un Cubo");
         
       
        
        Scanner entradaEscaner = new Scanner(System.in); //Funcion que permite ingresar los datos ingresados por el usuario
        op = entradaEscaner.nextInt(); //Ingreso de la opcion
        
         
        
        switch (op){
            case 1: 
                  
                  resultado = operacion.suma(a,b);
                  System.out.println("El resultado de la suma es: " + resultado);
                  contador--;//Le regresa el valor de 0 al contador
                  break;
            case 2: 
                  resultado = operacion.restar(a,b);
                  System.out.println("El resultado de la resta es: " + resultado);
                  contador--;
                  break;
                
            case 3: 
                  resultado = operacion.multi(a,b);
                  System.out.println("El resultado de la multiplicacion es: " + resultado);
                  contador--;
                  break;
            case 4: 
                  resultado = operacion.dividir(a,b);
                  System.out.println("El resultado de la division es: " + resultado);
                  contador--;
                  break;
            case 5: 
                  resultado = operacion.volumen(a,b,c);
                  System.out.println("El volumen del cubo es: " + resultado);
                  contador--;
                  break;
            
                  
            default:
                System.out.println("No valida");
        }
      } 
       
        //llamar al metodo sumar y recibir el valor devuelto 
        ////int resultado = suma.sumar(5,3);
        //Systema.out.println("resultado" + resultado  )
    
 }
}
