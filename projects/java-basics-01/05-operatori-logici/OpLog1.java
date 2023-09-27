/*Scrivi un programma che contiene un metodo che dati 2 interi in ingresso
ed un valore di confronto, verifichi se il numero di confronto è compreso
tra due valori specifici e stampi il risultato dell'operazione
comprensivo dei due limiti (inferiore e superiore)*/

public class OpLog1 {
    public static boolean isBetween(int x, int y, int z) {
        return x < z && z < y;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 22;
        System.out.println("Is " + z + " between " + x + " and " + y + " ? " + isBetween(x,y,z));
    }
}
