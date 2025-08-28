public class Recursion {
        /**
        * Funcion factorial de manera recursiva.
        * @param n valor a obtener factorial
        * @return factorial de n
        */

        public static long factorial(long n){
        long result=1; //Contador
        if (n <= 1){ //Caso de salida
            result = 1;
        }else {
            //caso recursivo
            result = n * factorial(n-1); 
        }
        return result;
    }
      
public static void main(String[] args) {
             
     
        System.out.println("Factorial de 7 = "+factorial(7));
             
              // TODO code application logic here

      
    }

      
    

      
}

