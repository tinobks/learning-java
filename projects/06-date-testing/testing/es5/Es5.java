package testing.es5;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Es5 {

    //creo metodi su cui poter effettuare test
    public OffsetDateTime stringParser(String date) throws DateTimeParseException {
        try {
            if (date != null) {
                return OffsetDateTime.parse(date);
            } else {
                return null;
            }
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Can't parse, give a correct String", date, e.getErrorIndex());
        }
    }

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
