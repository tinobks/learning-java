package date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

public class Es1 {
    public static void main(String[] args) {
        String dateToParse = "2002-03-01T13:00:00Z";

        //formattazione in FULL
        System.out.println("Data FULL: " + dateFull(dateToParse));

        //formattazione in MEDIUM
        System.out.println("Data MEDIUM: " + dateMedium(dateToParse));

        //formattazione in SHORT
        System.out.println("Data SHORT: " + dateShort(dateToParse));
    }

    public static String dateFull(String myDate) {
        OffsetDateTime datetime = OffsetDateTime.parse(myDate);
        return datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public static String dateMedium(String myDate) {
        OffsetDateTime datetime = OffsetDateTime.parse(myDate);
        return datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public static String dateShort(String myDate) {
        OffsetDateTime datetime = OffsetDateTime.parse(myDate);
        return datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}