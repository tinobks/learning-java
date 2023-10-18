/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e restituisca il nome del giorno della settimana come stringa
o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.*/

public class Switch1 {
    public static String DayOfWeek(int num) {
        //avevo fatto il classico switch inizialmente,
        //poi intelliJ mi ha consigliato di usare questo tipo di switch e mi e' piaciuto di piu'
        return switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "ERROR: Insert numbers only between 1 and 7.";
        };
    }

    public static void main(String[] args) {
        System.out.println(DayOfWeek(6));
        System.out.println(DayOfWeek(10));
    }
}
