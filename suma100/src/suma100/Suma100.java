//        Hacer un programa que sume los números del 1 al 100
package suma100;

/**
 *
 * @author DELL
 */
public class Suma100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int resultado=0;
       int suma;
       
       for(int x=0;x<101;x++){
           suma = x + 1;   
           resultado = suma + resultado; 
           System.out.println(resultado + "");
       }
       
       
    }
    
}
