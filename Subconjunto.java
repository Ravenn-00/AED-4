public class Subconjunto {
    public static void comprobar(int[] arr) {
        int[] subArray = new int[arr[0]];
        int suma = arr[arr.length - 1];
        for(int i = 1; i < arr.length - 1; i++){
            subArray[i - 1] = arr[i];
            System.out.print(subArray[i - 1] + " ");
        }
        int sumaEsperada = 0;
        for(int i = 0; i < subArray.length; i++) {
            if(esPoder2(subArray[i])) {
                sumaEsperada += subArray[i];
            }
            if(subArray[i + 1] < subArray.length) {
                if(esMult5(subArray[i]) && !esImpar(subArray[i + 1])) {
                    sumaEsperada += i;                
                }
            }
        }
        if(suma == sumaEsperada) {
            System.out.print("True\n");
        }
        else {
            System.out.print("False\n");
        }
    }
    public static boolean esImpar(int x) {
        if(x % 2 == 0) {
            return false;
        }
        return true;
    }
    public static boolean esMult5(int x) {
        if(x % 5 == 0) {
            return true;
        }
        return false;
    }
    public static boolean esPoder2(int x) {
        if(x <= 0) {
            return false;
        }
        while(x % 2 == 0) {
            x /= 2;
        }
        return x == 1;
    }
    public static void main(String[] args) {
        int[] array1 = {5, 2, 4, 8, 10, 3, 14};
        Subconjunto.comprobar(array1);
        int[] array2 = {5, 4, 8, 10, 3, 5, 27};
        Subconjunto.comprobar(array2);
        int[] array3 = {6, 2, 16, 5, 7, 10, 33};
        Subconjunto.comprobar(array3);
        int[] array4 = {6, 2, 16, 5, 3, 10, 33};
        Subconjunto.comprobar(array4);
        int[] array5 = {4, 2, 5, 1, 6, 13};
        Subconjunto.comprobar(array5);
    }
    
}
