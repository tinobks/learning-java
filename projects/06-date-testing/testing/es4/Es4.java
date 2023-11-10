package testing.es4;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public class Es4 {

    public OffsetDateTime stringParser(String date) throws DateTimeParseException {
        try {
            if (date != null && !date.isEmpty()) {
                return OffsetDateTime.parse(date);
            } else {
                return null;
            }
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Can't parse, give a correct String", date, e.getErrorIndex());
        }
    }

    public int year(OffsetDateTime myDate) {
        return myDate.getYear();
    }

    public Month month(OffsetDateTime myDate) {
        return myDate.getMonth();
    }

    public int dayOfMonth(OffsetDateTime myDate) {
        return myDate.getDayOfMonth();
    }

    public DayOfWeek dayOfWeek(OffsetDateTime myDate) {
        return myDate.getDayOfWeek();
    }

}
