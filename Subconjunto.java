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
            if(esPoder2(i)) {
                sumaEsperada += i;
            }
            if(esMult5(i))
            
        }
    }
    public static boolean esMult5(int x) {
        
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
        return true;
    }
    public static void main(String[] args) {
        int[] array1 = {5, 2, 4, 8, 10, 3, 14};
        Subconjunto.comprobar(array1);
    }
    
}
