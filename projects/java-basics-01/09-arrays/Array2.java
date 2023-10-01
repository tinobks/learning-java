/*Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.*/

public class Array2 {
    public static void charArray() {
        char[] myArray = {'a','!','b','c','@','d','e','a','f','a','h','i','a','j'};
        for (char myChar : myArray) {
            if (myChar == 'a') {
                System.out.println(myChar);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void main(String[] args) {
        charArray();
    }
}
