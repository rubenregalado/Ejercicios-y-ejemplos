
/**
 *
 * @author Compiler Math
 */

public class NumeroPrimo {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int numero = 150;//Número a comprobar 
        int a = 0; //Divisores exactos de un determinado número
        int primo;
        int res;
        //System.out.println("Ingrese numero: ");
       // numero = sc.nextInt();
      for (res = 1; res == numero; res++) {
        for (int i = 1; i <= res; i++) {
            if(res%i == 0) {
                a++;
            }
        
        }
        if(a ==2) {
            
            primo = 1;
        } else {
            
            primo =0;
        }
        
      if (primo==1){
         
         System.out.println(numero + " "); 
      }  
     
    }  
      
      
    }
}
    

