package esLezione;

import java.util.Arrays;
import java.util.Random;

/*Es 9. Leggere un array di interi di 5 posizioni e dopo averlo letto cercare al suo interno il massimo
e scrivere il massimo e la posizione della cella in cui è memorizzato.*/

public class Es9 {
    public static void main(String[] args) {
        //creo array di interi di lunghezza 5
        int[] arr = new int[5];

        //riempio l array con numeri randomici
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        //trovo il valore massimo
        int maxValue = 0;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(maxValue);

    }
}
