package exceptions;
//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
public class Exceptions3 {
    public static double divideZeroCheck(double divisore, double dividendo) {
        if (divisore != 0) {
            return dividendo/divisore;

        //se il numero viene provato a essere diviso per 0 viene catturato l'eccezione
        } else {
            throw new ArithmeticException("You can't divide by 0. The result doesn't exist.");
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println(divideZeroCheck(0,4));
        } catch (ArithmeticException e) {
            System.out.println("ERROR -> " + e);
        }
    }
}
