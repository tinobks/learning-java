/*Scrivi un programma che contiene un metodo che prenda un numero in ingresso
e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.*/

public class OpLog2 {
    public static boolean isOdd(int x) {
        return !(x % 2 == 0);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Is " + x + " an odd number? " + isOdd(x));
    }
}
