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
        String toParse = "2023-03-01T13:00:00Z";

        System.out.println("Data prima delle modifiche: " + toParse);

        //modifiche (aggiunta di 1 anno, diminuizione di 1 mese, aggiunta di 7 giorni, localizzato per l'Italia
        OffsetDateTime myDate = stringParser(toParse);
        OffsetDateTime dataModificata = addYear(myDate,1);
        dataModificata = reduceMonth(dataModificata, 1);
        dataModificata = addDays(dataModificata, 7);
        System.out.println("Data dopo le modifiche: " + dateItaly(dataModificata));
    }

    public static OffsetDateTime stringParser(String date) {
        return OffsetDateTime.parse(date);
    }

    public static OffsetDateTime addYear(OffsetDateTime myDate, int years) {
        return myDate.plusYears(years);
    }

    public static OffsetDateTime reduceMonth(OffsetDateTime myDate, int months) {
        return myDate.minusMonths(months);
    }

    public static OffsetDateTime addDays(OffsetDateTime myDate, int days) {
        return myDate.plusDays(days);
    }

    public static String dateItaly(OffsetDateTime myDate) {
        return myDate.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss", Locale.ITALY));
    }
}
