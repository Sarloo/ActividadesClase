package Main;

import java.util.Scanner;

public class Main {
    
   /**
     * Función recursiva para sumar los dígitos de un número
     * @param n número entero positivo
     * @return suma de todos los dígitos del número
     */
    public static int sumarDigitos(int n) {
        // Caso base: si el número es de un solo dígito
        if (n < 10) {
            return n;
        } else {
            // Caso recursivo: último dígito + suma del resto de dígitos
            return (n % 10) + sumarDigitos(n / 10);
        }
    }
    
    /**
     * Función recursiva para invertir una cadena de texto
     * @param cadena la cadena a invertir
     * @return cadena invertida
     */
    public static String invertirCadena(String cadena) {
        // Caso base: si la cadena está vacía o tiene un solo carácter
        if (cadena.isEmpty() || cadena.length() == 1) {
            return cadena;
        } else {
            // Caso recursivo: último carácter + invertir el resto de la cadena
            return cadena.charAt(cadena.length() - 1) + 
                   invertirCadena(cadena.substring(0, cadena.length() - 1));
        }
    }
    
    /**
     * Función recursiva para contar vocales en una cadena
     * @param cadena la cadena a analizar
     * @return cantidad de vocales en la cadena
     */
    public static int contarVocales(String cadena) {
        // Caso base: cadena vacía
        if (cadena.isEmpty()) {
            return 0;
        } else {
            // Convertir el primer carácter a minúscula para simplificar la comparación
            char primerCaracter = Character.toLowerCase(cadena.charAt(0));
            
            // Verificar si es vocal
            boolean esVocal = (primerCaracter == 'a' || primerCaracter == 'e' || 
                              primerCaracter == 'i' || primerCaracter == 'o' || 
                              primerCaracter == 'u');
            
            // Caso recursivo: contar si es vocal + contar vocales en el resto de la cadena
            return (esVocal ? 1 : 0) + contarVocales(cadena.substring(1));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numero;
        String texto;
        
        do {
            System.out.println("\n=== MENÚ DE RECURSIVIDAD ===");
            System.out.println("1. Sumar dígitos de un número");
            System.out.println("2. Calcular factorial");
            System.out.println("3. Calcular número de Fibonacci");
            System.out.println("4. Invertir una cadena de texto");
            System.out.println("5. Contar vocales en una cadena");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero positivo: ");
                    numero = scanner.nextInt();
                    if (numero < 0) {
                        System.out.println("Por favor, ingrese un número positivo.");
                    } else {
                        int suma = sumarDigitos(numero);
                        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
                    }
                    break;
                    
                case 2:
                    System.out.print("Ingrese un número para calcular su factorial: ");
                    numero = scanner.nextInt();
                    if (numero < 0) {
                        System.out.println("El factorial no está definido para números negativos.");
                    } else {
                        System.out.println("Factorial de " + numero + " = " + factorial(numero));
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingrese la posición del número de Fibonacci: ");
                    numero = scanner.nextInt();
                    if (numero < 0) {
                        System.out.println("La posición debe ser un número no negativo.");
                    } else {
                        System.out.println("Fibonacci en posición " + numero + " = " + fibonacci(numero));
                    }
                    break;
                    
                case 4:
                    System.out.print("Ingrese una cadena de texto: ");
                    texto = scanner.nextLine();
                    String textoInvertido = invertirCadena(texto);
                    System.out.println("Cadena original: " + texto);
                    System.out.println("Cadena invertida: " + textoInvertido);
                    break;
                    
                case 5:
                    System.out.print("Ingrese una cadena de texto: ");
                    texto = scanner.nextLine();
                    int cantidadVocales = contarVocales(texto);
                    System.out.println("La cadena \"" + texto + "\" tiene " + cantidadVocales + " vocal(es)");
                    break;
                    
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Por favor, seleccione 1, 2, 3, 4, 5 o 6.");
                    break;
            }
            
            if (opcion != 6) {
                System.out.print("\nPresione Enter para continuar...");
                scanner.nextLine(); // Esperar a que el usuario presione Enter
            }
            
        } while (opcion != 6);
        
        scanner.close();
    }
    
    /**
     * Función factorial de manera recursiva.
     * @param n valor a obtener factorial
     * @return factorial de n
     */
    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    /**
     * Función de Fibonacci de manera recursiva.
     * @param n la posición de número fibonacci a buscar
     * @return el número de Fibonacci en la posición n
     */
    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}