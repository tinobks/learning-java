/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e stampa tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.*/

public class Ciclo5 {
    public static void continue5(int num) {
        for (int i = 0; i <= num; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        continue5(8);
    }
}
