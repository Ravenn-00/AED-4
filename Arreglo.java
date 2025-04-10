import java.util.Random;
public class Arreglo {
    public static int search(int[] arr, int k, int inicio, int fin) {
        if (inicio == fin) return arr[inicio];
        Random extra = new Random();
        int pos = inicio + extra.nextInt(fin - inicio + 1);
        pos = partir(arr, pos, inicio, fin);
        if (k == pos) return arr[k];
        else if (k < pos) return search(arr, k, inicio, pos - 1);
        else return search(arr, k, pos + 1, fin);
    }
    public static int partir(int[] arr, int pivote, int inicio, int fin) {
        int varPivote = arr[pivote];
        cambiar(arr, pivote, fin);
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
        int var1 = 3;
        System.out.println(Arreglo.search(array1, var1 - 1, 0, array1.length - 1));

        int[] array2 = {4, 2, 7, 10, 4, 1, 6};
        int var2 = 5;
        System.out.println(Arreglo.search(array2, var2 - 1, 0, array2.length - 1));

        int[] array3 = {4, 2, 7, 1, 4, 6};
        int var3 = 1;
        System.out.println(Arreglo.search(array3, var3 - 1, 0, array3.length - 1));

        int[] array4 = {9, 2, 7, 1, 7};
        int var4 = 4;
        System.out.println(Arreglo.search(array4, var4 - 1, 0, array4.length - 1));
    }
}
