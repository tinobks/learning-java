/*Scrivi un programma che contenga un metodo che prende in ingresso un carattere
e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.*/

public class Switch2 {
    public static String operatorType(char myChar) {
        //avevo fatto il classico switch inizialmente,
        //poi intelliJ mi ha consigliato di usare questo tipo di switch e mi e' piaciuto di piu'
        return switch (myChar) {
            case '+' -> "Addition";
            case '-' -> "Subtraction";
            case '*' -> "Multiplication";
            case '/' -> "Division";
            default -> "ERROR: Insert only basic algebraic characters.";
        };
    }

    public static void main(String[] args) {
        System.out.println(operatorType('*'));
        System.out.println(operatorType('a'));
    }
}
