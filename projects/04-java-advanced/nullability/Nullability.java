package nullability;
//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.

public class Nullability {
    public static void main(String[] args) {
        Double numeratore = 7.0;
        Double denominatore  = null;
        try {
            System.out.println(numeratore + " divided by " + denominatore + " equals to " + divisione(numeratore,denominatore));
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("ERROR -> " + e);
        } finally {
            System.out.println("Finish");
        }
    }

    public static double divisione(Double numeratore, Double denominatore) {
        if (denominatore == 0) {
            throw new ArithmeticException("You can't divide by 0. The result doesn't exist.");
        }
        if (numeratore == null || denominatore == null) {
            throw new NullPointerException("Numerator and denominator can't be null.");
        }

        return numeratore/denominatore;
    }
}
