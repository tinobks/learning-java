package testing.es2;
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class Es2 {
    /*public static void main(String[] args) {
        //creo oggetto OffsetDateTime
        OffsetDateTime myDate = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(myDate);

        //formattazione in FULL
        String dateFull = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Data FULL: " + dateFull);

        //formattazione in MEDIUM
        String dateMedium = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Data MEDIUM: " + dateMedium);

        //formattazione in SHORT
        String dateShort = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Data SHORT: " + dateShort);
    }*/

    //creo metodi per ogni formattazione per fare i test
    public String dateFull(String myDate) throws DateTimeParseException {
        try {
            if (myDate != null) {
                OffsetDateTime datetime = OffsetDateTime.parse(myDate);
                return datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

            } else {
                return "Cannot parse null";
            }
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Wrong String", myDate, e.getErrorIndex());
        }
    }

    public String dateMedium(String myDate) throws DateTimeParseException {
        try {
            if (myDate != null) {
                OffsetDateTime datetime = OffsetDateTime.parse(myDate);
                return datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

            } else {
                return "Cannot parse null";
            }
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Wrong String", myDate, e.getErrorIndex());
        }
    }

    public String dateShort(String myDate) throws DateTimeParseException {
        try {
            if (myDate != null) {
                OffsetDateTime datetime = OffsetDateTime.parse(myDate);
                return datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

            } else {
                return "Cannot parse null";
            }
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Wrong String", myDate, e.getErrorIndex());
        }
    }
}
