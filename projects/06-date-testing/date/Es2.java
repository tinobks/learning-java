package date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
public class Es2 {
    public static void main(String[] args) {
        String stringToParse = "2023-03-01T13:00:00Z";
        //formatto per ottenere 01 marzo 2023
        System.out.println(dateFormat(stringToParse));
    }

    public static String dateFormat(String myDate) {
        OffsetDateTime datetime = OffsetDateTime.parse(myDate);
        return datetime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }
}

