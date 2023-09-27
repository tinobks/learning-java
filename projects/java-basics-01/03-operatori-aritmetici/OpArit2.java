/*Definisci un metodo che calcoli la media tra 3 numeri e
restituisca il risultato che dovrà essere stampato.*/

public class OpArit2 {
    public static double media(double x, double y, double z) {
        return (x + y + z)/ 3;
    }

    public static void main(String[] args) {
        System.out.println(media(250d, 70d, 110d));
    }
}
