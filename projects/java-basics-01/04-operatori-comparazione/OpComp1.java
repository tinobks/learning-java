/*Scrivi un programma che contiene un metodo che
confronti due numeri interi e determini se sono diversi.
*/
//Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.

public class OpComp1 {
    public static boolean isEqual(int x, int y) {
        return x == y;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("Is " + x + " equal to " + y + " ? " + isEqual(x,y));
    }
}
