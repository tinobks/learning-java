//Dati due caratteri, restituire la somma dei loro valori ASCII

public class Casting2 {
    public static int asciiSum(char firstChar, char secondChar) {
        return (int) firstChar + (int) secondChar;
    }

    public static void main(String[] args) {
        System.out.println(asciiSum('t','b'));
    }
}
