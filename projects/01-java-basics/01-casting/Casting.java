/*Scrivere uno snippet di codice che dati 2 numeri con la virgola(double)
li sommi e li stampi senza virgola (int).*/

public class Casting {
    public static void main(String[] args) {
        double x = 10.66d;
        double y = 18.34d;
        int z = (int) x + (int) y;
        System.out.println(z);
    }
}
