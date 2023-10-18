/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa
tutti i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.*/

public class Ciclo4 {
    public static void break5(int num) {
        for (int i = 0; i <= num; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        break5(8);
    }
}

