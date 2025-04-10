// EJERCICIO 1
import java.util.Arrays;
import java.util.Random;

public class Arreglo {
    public static int search(int[] arr, int k, int inicio, int fin) {
        if(inicio == fin) return arr[inicio];
        int pivote = inicio - fin + 1;
        if(k == pivote) return arr[k];
        else if(k < pivote) return search(arr, k, inicio, pivote - 1);
        else return search(arr, k, pivote + 1, fin);
    }
    public static int partir(int[] arr, int pivote, int inicio, int fin) {
        int varPivote = arr[pivote];
        cambiar(arr, fin, varPivote);
        int pos = inicio;
        for (int i = inicio; i < fin; i++) {
            if (arr[i] < varPivote) {
                cambiar(arr, pos, i);
                pos++;
            }
        }
        cambiar(arr, pos, fin);
        return pos;
    }
    public static void cambiar(int[] arr, int x, int y) {
        int var = arr[x];
        arr[x] = arr[y];
        arr[y] = var;
    }
    
    public static void main(String[] args) {
        int[] array1 = {4, 2, 7, 10, 4, 17};
        int var1 = 3;;
        System.out.print(Arreglo.search(array1, var1, 0, array1.length));

        int[] array2 = {4, 2, 7, 10, 4, 1, 6};
        int var2 = 5;
        System.out.print(Arreglo.search(array2, var2, 0, array2.length));

        int[] array3 = {4, 2, 7, 1, 4, 6};
        int var3 = 1;
        System.out.print(Arreglo.search(array3, var3, 0, array3.length));

        int[] array4 = {9, 2, 7, 1, 7};
        int var4 = 4;
        System.out.print(Arreglo.search(array4, var4, 0, array4.length));
    }
}