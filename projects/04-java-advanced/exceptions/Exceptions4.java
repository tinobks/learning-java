package exceptions;
/*Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
e gestista sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/

public class Exceptions4 {
    public static double divideArrayZero(double[] ArrayNumbers, int ArrayPosition, double divisore) {
        if (divisore == 0) {
            throw new ArithmeticException("You can't divide by 0. The result doesn't exist.");
        }
        if (ArrayPosition < 0 || ArrayPosition >= ArrayNumbers.length) {
            throw new ArrayIndexOutOfBoundsException("Index must be between 0 (included) and " + ArrayNumbers.length + " (excluded)");
        }
        return ArrayNumbers[ArrayPosition] / divisore;
    }

    public static void main(String[] args) {
        double[] myArray = {2, 4, 5, 0};
        int myPosition = 2;
        double myDivisore = 2;

        try {
            System.out.println(myArray[myPosition] + " divided by " + myDivisore + " equals to " + divideArrayZero(myArray, myPosition, myDivisore));
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR -> " + e);
        } finally {
            System.out.println("Finish");
        }
    }
}
