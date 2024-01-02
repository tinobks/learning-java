package esLezione;

//Creare un metodo che permetta di contare quante stringhe in un'array inizino con la lettera a

import java.util.Locale;

public class EsStringhe {
    public static void main(String[] args) {
        String[] words = {"alleluia", "develhope", "Antonio", "java", "esercizio"};
        System.out.println(arrCountA(words));
    }

    public static int arrCountA(String[] arr) {
        int counter = 0;
        for (String word : arr) {
            word = word.toLowerCase();
            if (word.charAt(0) == 'a') {
                counter++;
            }
        }
        return counter;
    }
}
