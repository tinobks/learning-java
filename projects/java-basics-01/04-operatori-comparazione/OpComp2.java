/*Scrivi un programma che contiene un metodo che che confronti due caratteri
e determini se sono diversi.
Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.*/

public class OpComp2 {
    public static boolean isEqual(char firstChar, char secondChar) {
        return firstChar == secondChar;
    }

    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println("Is " + a + " equal to " + b + " ? " + isEqual(a,b));
    }
}
