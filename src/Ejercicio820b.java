import java.util.*;

public class Ejercicio820b {
    
    static class Nodo implements Comparable<Nodo> {
        int fila;
        int columna;
        int coste;
        
        public Nodo(int fila, int columna, int coste) {
            this.fila = fila;
            this.columna = columna;
            this.coste = coste;
        }
        
        @Override
        public int compareTo(Nodo otro) {
            return Integer.compare(this.coste, otro.coste);
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Nodo otro = (Nodo) obj;
            return fila == otro.fila && columna == otro.columna;
        }
        
        @Override
        public int hashCode() {
            return 31 * fila + columna;
        }
    }
    
    // Direcciones posibles: arriba, abajo, izquierda, derecha y diagonales
    private static final int[][] DIRECCIONES = {
        {-1, -1}, {-1, 0}, {-1, 1},
        {0, -1},           {0, 1},
        {1, -1},  {1, 0},  {1, 1}
    };
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int columnas = sc.nextInt();
            int filas = sc.nextInt();
            sc.nextLine();
            
            char[][] mapa = new char[filas][columnas];
            for (int i = 0; i < filas; i++) {
                String linea = sc.nextLine();
                for (int j = 0; j < columnas; j++) {
                    mapa[i][j] = linea.charAt(j);
                }
            }
            
            int resultado = encontrarCaminoMinimo(mapa, filas, columnas);
            System.out.println(resultado == Integer.MAX_VALUE ? "IMPOSIBLE" : resultado);
        }
    }
    
    private static int encontrarCaminoMinimo(char[][] mapa, int filas, int columnas) {
        // Si inicio o fin son bloqueados
        if (mapa[0][0] == 'N' || mapa[filas - 1][columnas - 1] == 'N') {
            return Integer.MAX_VALUE;
        }
        
        // Usamos una cola de prioridad para Dijkstra
        PriorityQueue<Nodo> colaPrioridad = new PriorityQueue<>();
        
        // Matriz de distancias mínimas
        int[][] distancias = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            Arrays.fill(distancias[i], Integer.MAX_VALUE);
        }
        distancias[0][0] = 1;
        
        // Conjunto para nodos visitados
        boolean[][] visitado = new boolean[filas][columnas];
        
        colaPrioridad.offer(new Nodo(0, 0, 1));
        
        while (!colaPrioridad.isEmpty()) {
            Nodo actual = colaPrioridad.poll();
            
            // Si ya encontramos un camino mejor a este nodo, lo ignoramos
            if (visitado[actual.fila][actual.columna]) continue;
            
            // Si llegamos al destino
            if (actual.fila == filas - 1 && actual.columna == columnas - 1) {
                return actual.coste;
            }
            
            visitado[actual.fila][actual.columna] = true;
            
            // Explorar vecinos
            for (int[] dir : DIRECCIONES) {
                int nuevaFila = actual.fila + dir[0];
                int nuevaCol = actual.columna + dir[1];
                
                // Verificar límites y si es transitable
                if (nuevaFila >= 0 && nuevaFila < filas && 
                    nuevaCol >= 0 && nuevaCol < columnas && 
                    mapa[nuevaFila][nuevaCol] == '.' && 
                    !visitado[nuevaFila][nuevaCol]) {
                    
                    int nuevoCoste = actual.coste + 1;
                    
                    if (nuevoCoste < distancias[nuevaFila][nuevaCol]) {
                        distancias[nuevaFila][nuevaCol] = nuevoCoste;
                        colaPrioridad.offer(new Nodo(nuevaFila, nuevaCol, nuevoCoste));
                    }
                }
            }
        }
        
        return Integer.MAX_VALUE; // No se encontró camino
    }
}
