/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfloat;

/**
 *
 * @author DELL
 */
public class Float {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // compares the two specified float values
      float f1 = 22.30f;
      float f2 = 88.67f;
      int retval = Float.compare(f1, f2);
    
      if(retval > 0) {
         System.out.println("f1 is greater than f2");
      } else if(retval < 0) {
         System.out.println("f1 is less than f2");
      } else {
         System.out.println("f1 is equal to f2");
      }
   }

    private static int compare(float f1, float f2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
  

