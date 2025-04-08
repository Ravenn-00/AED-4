import java.util.Arrays;

class Arreglo {
    public static void search(int[] arr, int x) {
        printArray(arr, x);
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        if(x == 1) {
            System.out.print("\nElemento: " + sorted[0]);
            return;
        }
        if(x == arr.length) {
            System.out.print("\nElemento: " + sorted[x]);
            return;
        }
        else {
            System.out.print("\nElemento: " + sorted[x - 1]);
        }
    }
    public static void printArray(int[] arr, int x) {
        System.out.print("\nArray: ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.print("\nPosicion: " + x);
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
