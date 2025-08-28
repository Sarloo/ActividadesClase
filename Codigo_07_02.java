    /**
     
     * Función de Fibonacci de manera recursiva.      
     * @param n la posición de número fibonacci a buscar
     * @return       
     */ 
    public static long fibonacci(long n){
        long result=1; //Contador
        if (n <= 1){ //Caso de salida
     
            result = 1;
      
        }else {
     
            //caso recursivo
      
            result = fibonacci(n-1) + fibonacci(n-2); 
      
        }
     
        return result;
     
    }
     
    /**
      
     * @param args the command line arguments
      
     */ 
     
    public static void main(String[] args) {
             
    
        System.out.println("Fibonacci de 12= " +fibonacci(12));
     
        // TODO code application logic here
      
    }     
          
}
