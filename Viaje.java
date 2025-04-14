// EJERCICIO 3
public class Viaje {
    public static int[][] calcularCostesMinimos(int[][] T) {
        int n = T.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    C[i][j] = 0;
                } else {
                    C[i][j] = T[i][j];
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i + 1; k < j; k++) {
                    if (T[i][k] != Integer.MAX_VALUE && C[k][j] != Integer.MAX_VALUE) {
                        C[i][j] = Math.min(C[i][j], T[i][k] + C[k][j]);
                    }
                }
            }
        }
        return C;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor == Integer.MAX_VALUE) {
                    System.out.print("∞\t");
                } else {
                    System.out.print(valor + "\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE;
        int[][] T = {
            {0, 3, INF, 10},
            {INF, 0, 2, 6},
            {INF, INF, 0, 1},
            {INF, INF, INF, 0}
        };
        int[][] C = calcularCostesMinimos(T);
        System.out.println("Matriz:  ");
        imprimirMatriz(C);
    }
}