package opertern;
//Copia il seguente programma Java e sostituisci il costrutto if-else con l'operatore ternario.

public class Es2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            System.out.println(checkValue(i));
        }
    }

    private static String checkValue(int value) {
        /*String result = "";

        if (value % 5 == 0) {
            result = "FizzBuzz";
        } else  {
            result = "Buzz";
        }
        return result;*/

        //sostituisco l if else con operatore ternario
        final String result = value % 5 == 0 ? "FizzBuzz" : "Buzz";
        return result;
    }
}
