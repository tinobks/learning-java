package testing.es3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

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

    public String dateFormat(OffsetDateTime myDate) {
        if (myDate == null) {
            return null;
        } else {
            return myDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        }
    }
}
