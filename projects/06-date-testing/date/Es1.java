package date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

public class Es1 {
    public static void main(String[] args) {
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
    }
}
