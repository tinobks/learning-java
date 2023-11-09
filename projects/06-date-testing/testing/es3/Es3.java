package testing.es3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Crea dei test per questo esercizio

public class Es3 {
    /*public static void main(String[] args) {
        //creo oggetto OffsetDateTime
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(myDate);

        //formatto per ottenere 01 marzo 2023
        String dataFormattata = myDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(dataFormattata);
    }*/

    //creo metodo per poter fare test
    public String dateFormat(String myDate) throws DateTimeParseException {
        try {
            if (myDate != null) {
                OffsetDateTime datetime = OffsetDateTime.parse(myDate);
                return datetime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
            } else {
                return "Can't parse null";
            }
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Can't parse, give a correct String", myDate, e.getErrorIndex());
        }
    }
}
