package testing.es5;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Es5 {
    public static void main(String[] args) {
        //creo oggetto OffsetDateTime
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String data = myDate.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss", Locale.CANADA)); //localizzato CANADA per poi modificarlo in ITALY
        System.out.println("Data prima delle modifiche: " + data);

        //modifiche (aggiunta di 1 anno, diminuizione di 1 mese, aggiunta di 7 giorni, localizzato per l'Italia
        OffsetDateTime myDateModified = myDate.plusYears(1).minusMonths(1).plusDays(7);
        String dataModificata = myDateModified.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss", Locale.ITALY));
        System.out.println("Data dopo le modifiche: " + dataModificata);
    }

    //creo metodi su cui poter effettuare test
    public OffsetDateTime addYear(OffsetDateTime myDate, int years) {
        return myDate.plusYears(years);
    }

    public OffsetDateTime reduceMonth(OffsetDateTime myDate, int months) {
        return myDate.minusMonths(months);
    }

    public OffsetDateTime addDays(OffsetDateTime myDate, int days) {
        return myDate.plusDays(days);
    }

    public String dateItaly(OffsetDateTime myDate) {
        return myDate.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss", Locale.ITALY));
    }
}
