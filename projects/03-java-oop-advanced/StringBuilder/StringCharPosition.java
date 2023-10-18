package StringBuilder;

/*Scrivi un programma Java che abbia un metodo che prenda il carattere
in Unicode in un indice specifico all'interno di una stringa e lo stampi.
Il metodo dovrà avere nel costruttore una stringa ed una posizione
e dovrà resituire il carattere in unicode o una stringa di errore.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.*/

public class StringCharPosition {
    private String myString;
    private int charPosition;

    //metodo costruttore con una stringa e una posizione
    public StringCharPosition(String myString, int charPosition) {
        this.myString = myString;
        this.charPosition = charPosition;
    }

    //metodo che prende il carattere in Unicode di una stringa e lo stampa
    public String getUnicode() {
        //stringa di errore nel caso la posizione non esiste nella stringa
        if (charPosition < 0 || charPosition >= myString.length()) {
            return "ERROR: the position is out of range.";
        }

        //creo variabile del carattere da convertire in unicode
        char myChar = myString.charAt(charPosition);

        //creo StringBuilder e faccio append della frase intera da restituire
        StringBuilder myUnicode = new StringBuilder();
        myUnicode.append("Il carattere '").append(myChar).append("' convertito in Unicode diventa: ");
        //faccio append del carattere convertito in unicode
        myUnicode.append(String.format("%04x", (int) myChar));

        return myUnicode.toString();
    }

    public static void main(String[] args) {
        StringCharPosition testStr = new StringCharPosition("bl;)_@I*DQ_",7);
        System.out.println(testStr.getUnicode());
    }
}
