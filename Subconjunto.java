public class Subconjunto {
    public static void comprobar(int[] arr) {
        int[] subArray = new int[arr[0]];
        int suma = arr[arr.length - 1];
        for(int i = 1; i < arr.length - 1; i++){
            subArray[i - 1] = arr[i];
            System.out.print(subArray[i - 1] + " ");
        }
        if()
    }
    public static boolean esPoder2(int x) {
        while(x % 2 == 0) {
            x /= 2;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = {5, 2, 4, 8, 10, 3, 14};
        Subconjunto.comprobar(array1);
    }
    
}
