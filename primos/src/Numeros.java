import static java.lang.Math.*;
public class Numeros{
public static void main(String args[]){
int contador=0, j=0, div=0,raiz=0;

for (contador=1;contador<151;contador++) { //ciclo para recorrer los numeros hasta el num 100
    
   div=0; //variable para contar cuantas veces es el residuo de dividir es 0
   
   raiz=(int)sqrt(contador);//la raiz del número a buscarle los primos
   
    for (j=1;j<=raiz;j++) { //ciclo para recorrer los numeros hasta la raiz de i (estos seran los divisores)
      if (contador%j==0)//evalua la condicion de que el residuo de dividir i entre j es igual a cero
          
      div++;// si la condicion anterior se cumple entonces entonces suma 1 a esta variable
      
      }
       if (div<=1)//Si existe más de un divisor, entonces el número no es primo
           
       System.out.println (contador + " es numero primo" );// imprime que cierto numero es primo
    }
  }
}

