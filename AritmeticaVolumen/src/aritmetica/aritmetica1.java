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
public class aritmetica1 {
    
   int suma(int a, int b){ 
        System.out.println("Digite los numeros que desea operar"); //El usuario digita los numeros que desea operar
        Scanner entradaEscaner = new Scanner(System.in); //Funcion que permite ingresar los datos ingresados por el usuario
        a = entradaEscaner.nextInt(); //Primer numero ingresado
        b = entradaEscaner.nextInt();//Segundo numero ingresado
 
       return a + b;
        

      
   }
     int restar (int a, int b){
        System.out.println("Digite los numeros que desea operar"); //El usuario digita los numeros que desea operar
        Scanner entradaEscaner = new Scanner(System.in); //Funcion que permite ingresar los datos ingresados por el usuario
        a = entradaEscaner.nextInt(); //Primer numero ingresado
        b = entradaEscaner.nextInt();//Segundo numero ingresado
        
       return a - b;
       }
     
     int multi (int a, int b){
        System.out.println("Digite los numeros que desea operar"); //El usuario digita los numeros que desea operar
        Scanner entradaEscaner = new Scanner(System.in); //Funcion que permite ingresar los datos ingresados por el usuario
        a = entradaEscaner.nextInt(); //Primer numero ingresado
        b = entradaEscaner.nextInt();//Segundo numero ingresado
         return a * b;
     }
     
     int dividir (int a, int b){
        System.out.println("Digite los numeros que desea operar"); //El usuario digita los numeros que desea operar
        Scanner entradaEscaner = new Scanner(System.in); //Funcion que permite ingresar los datos ingresados por el usuario
        a = entradaEscaner.nextInt(); //Primer numero ingresado
        b = entradaEscaner.nextInt();//Segundo numero ingresado
         return a / b;
     }
     
     int volumen (int a, int b, int c){
        System.out.println("Digite las dimensiones del cubo para calcular su voumen"); //El usuario digita los numeros que desea operar
        Scanner entradaEscaner = new Scanner(System.in); //Funcion que permite ingresar los datos ingresados por el usuario
        a = entradaEscaner.nextInt(); //Primer numero ingresado
        b = entradaEscaner.nextInt();//Segundo numero ingresado
        c = entradaEscaner.nextInt();
             return a*b*c;
}
    int sumar(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }
   
    

