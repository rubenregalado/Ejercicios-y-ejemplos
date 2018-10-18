/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasMultiplicacion;

/**
 *
 * @author DELL
 */
public class MultiplicarTablas {
    int resultado;
    int tabla(int a){
        for(int tabla=1;tabla<=10;tabla++){
        resultado=a*tabla;
        System.out.println(+ a +" * " + tabla +" = " + resultado);
       
        
    }
        return 0;
        
   } 
}
