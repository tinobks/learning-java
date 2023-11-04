package date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia

public class Es4 {
    public static void main(String[] args) {
        //creo oggetto OffsetDateTime
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String data = myDate.format(DateTimeFormatter.ofPattern("dd/MM/yy", Locale.CANADA)); //localizzato CANADA per poi modificarlo in ITALY
        System.out.println("Data prima delle modifiche: " + data);

        //modifiche (aggiunta di 1 anno, diminuizione di 1 mese, aggiunta di 7 giorni, localizzato per l'Italia
        OffsetDateTime myDateModified = myDate.plusYears(1).minusMonths(1).plusDays(7);
        String dataModificata = myDateModified.format(DateTimeFormatter.ofPattern("dd/MM/yy", Locale.ITALY));
        System.out.println("Data dopo le modifiche: " + dataModificata);
    }
}
