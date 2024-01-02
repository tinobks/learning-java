package esLezione;
/*Implementare un metodo statico di nome stringaCorta che prende come parametro un array di oggetti String
e che restituisce la stringa dell’array avente lunghezza minima. Nel caso vi fossero due o più stringhe
con la lunghezza minima, il metodo ne deve restituire una arbitrariamente.*/

public class EsStringhe2 {
    public static void main(String[] args) {
        String[] myStrings = {"Antonio", "develhope", "ciao", "java"};
        System.out.println(stringCorta(myStrings));
    }
    public static String stringCorta(String[] arr) {
        String shortestWord = arr[0];
        for (String word : arr) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }
}
