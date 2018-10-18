/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasMultiplicacion;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PrincipalMultiplicar {
     public static void main (String args[]){
         int a;
         int resultado;
         int maxElementos = 1;
         
         MultiplicarTablas tablas = new MultiplicarTablas();
         
         for (int contador = 0; contador <= maxElementos; contador++){
         System.out.println("Que tabla de multiplicar desea?");
         Scanner entradaEscaner = new Scanner(System.in); //Funcion que permite ingresar los datos ingresados por el usuario
         a = entradaEscaner.nextInt();
         
         resultado = tablas.tabla(a);
         contador--;
         } 
     
      }
}
