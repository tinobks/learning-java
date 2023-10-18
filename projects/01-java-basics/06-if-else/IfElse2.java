/*Scrivi un programma che calcoli la lunghezza di una stringa,
sulla base di questa lunghezza stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10"
o "Lunghezza pari a 10".*/

public class IfElse2 {
    public static void strLength(String myString) {
        if (myString.length() > 10) {
            System.out.println(myString + " : Lunghezza maggiore di 10");
        }else if (myString.length() < 10) {
            System.out.println(myString + " : Lunghezza minore di 10");
        }else {
            System.out.println(myString + " : Lunghezza pari a 10");
        }
    }

    public static void main(String[] args) {
        strLength("Cacciatorpediniere");
        strLength("Develhope");
        strLength("Istruttore");
    }
}
