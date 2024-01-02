package contocorrente;
//Crea un programma per la gestione di un controcorrente
//Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire il saldo
//e di effettuare la lista degli ultimi 5 movimenti .

public class Main {
    public static void main(String[] args) {
        CC count1 = new CC("Antonio Buonanno", "IT562045451216450", 150.00, Valuta.EURO);
        CC count2 = new CC("Pietro di Giovanni", "IT5620484894069", 3.00, Valuta.EURO);
        CC count3 = new CC("Paola Ammaturo", "IT5120484625154014", 50.00, Valuta.EURO);
    }
}
