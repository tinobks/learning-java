/*Scrivi un programma che contiene un metodo che
date due variabili le incrementi di un valore scelto da te e
le moltiplichi fra di loro.*/

public class OpArit3 {
    public static int metodo3(int x, int y) {
        x += 4;
        y += 7;
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(metodo3(7, 4));
    }
}
