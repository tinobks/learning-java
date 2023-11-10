package date;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Es5 {
    public static void main(String[] args) {
        //creo 2 stringhe e faccio parsing
        String data1toParse = "2023-03-01T13:00:00Z";
        String data2toParse = "2024-03-01T13:00:00Z";
        OffsetDateTime data1 = stringParser(data1toParse);
        OffsetDateTime data2 = stringParser(data2toParse);

        //verifico che data1 e' prima di data2
        System.out.println("Is " + data1 + " before " + data2 + " ? " + date1Before(data1,data2));

        //verifico che data2 e' dopo data1
        System.out.println("Is " + data2 + " after " + data1 + " ? " + date2After(data1,data2));

        //verifico se le due date sono uguali ad ora
        System.out.println("Is " + data2 + " equal to " + data1 + " ? " + dateEquals(data1,data2));
    }

    public static OffsetDateTime stringParser(String date) {
        return OffsetDateTime.parse(date);
    }

    public static boolean date1Before(OffsetDateTime date1, OffsetDateTime date2) {
        return date1.isBefore(date2);
    }

    public static boolean date2After(OffsetDateTime date1, OffsetDateTime date2) {
        return date2.isAfter(date1);
    }

    public static boolean dateEquals(OffsetDateTime date1, OffsetDateTime date2) {
        return date1.isEqual(date2);
    }
}
