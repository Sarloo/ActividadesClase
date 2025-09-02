package Clase2Sep;

public class NQueens {
    static int N = 8; // Tamaño del tablero y número de reinas
    static int[] board = new int[N]; // Array para representar el tablero
    static int tablero = 1;
    
    /**
     * Imprime el tablero con las reinas colocadas
     */
    static void printboard() {
        System.out.println("Tablero " + tablero);
        tablero++;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i] == j) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void solve(int row) {
        // Condición base: si llegamos a la última fila, imprimimos la solución
        if (row == N) {
            printboard();
            return;
        }
        
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                solve(row + 1);
            }
        }
    }
    
    /**
     * Verifica si no colisiona con otras reinas
     * @param row fila
     * @param col columna
     * @return true si es seguro colocar la reina
     */
    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            // Verifica misma columna
            if (board[i] == col) {
                return false;
            }
            // Verifica diagonales (la diferencia entre filas y columnas debe ser igual)
            if (Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        solve(0);
    }
}