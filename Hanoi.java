public class Hanoi {
    public static void resolverTorresDeHanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        resolverTorresDeHanoi(n - 1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        resolverTorresDeHanoi(n - 1, auxiliar, destino, origen);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Solucion para " + n + " discos:");
        resolverTorresDeHanoi(n, 'A', 'C', 'B');
    }    
}
