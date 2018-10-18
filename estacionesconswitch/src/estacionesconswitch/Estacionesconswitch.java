/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionesconswitch;

/**
 *
 * @author DELL
 */
public class Estacionesconswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes = 1;
        String estacion;
        
        switch (mes){
            case 1: case 2: case 12:
                  estacion = "invierno";
                  break;
            case 3: case 4: case 5:
                  estacion = "primavera";
                  break;
            case 6: case 7: case 8:
                  estacion = "verano";
                  break;
            case 9: case 10: case 11:
                  estacion = "otonio";
                  break;
            default:
                estacion = "mes no valido elija del 1 a 12";
        }
       System.out.println("estacion del mes "+ mes + "corresponde a la estacion " + estacion);
            
         
        }
    
    
}
