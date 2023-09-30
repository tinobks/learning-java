/*Scrivere un programma che stampi i numeri da 1 a 100.
Per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".*/

public class IfElse1 {
    public static void FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz(100);
    }
}
