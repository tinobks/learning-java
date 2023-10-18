/*Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.*/

public class Array2 {
    public static void charArray() {
        char[] myArray = {'a','!','b','c','@','d','e','f','h','i','j','a'};
        int counterA = 0;
        for (char myChar : myArray) {
            if (myChar == 'a') {
                counterA += 1;
            }
        }
        System.out.println("Occorrenze del carattere 'a': " + counterA);
    }

    public static void main(String[] args) {
        charArray();
    }
}
