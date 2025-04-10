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
    public static void partir() {

    }
    
    public static void main(String[] args) {
        int[] array1 = {4, 2, 7, 10, 4, 17};
        int var1 = 3;;
        Arreglo.search(array1, var1);

        int[] array2 = {4, 2, 7, 10, 4, 1, 6};
        int var2 = 5;
        Arreglo.search(array2, var2);

        int[] array3 = {4, 2, 7, 1, 4, 6};
        int var3 = 1;
        Arreglo.search(array3, var3);

        int[] array4 = {9, 2, 7, 1, 7};
        int var4 = 4;
        Arreglo.search(array4, var4);
    }
}