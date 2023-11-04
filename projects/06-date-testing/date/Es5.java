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
        //creo 2 date e le formatto
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        String data1format = data1.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
        String data2format = data2.format(DateTimeFormatter.ofPattern("dd/MM/yy"));

        //verifico che data1 e' prima di data2
        boolean date1Before = data1.isBefore(data2);
        System.out.println("Is " + data1format + " before " + data2format + " ? " + date1Before);

        //verifico che data2 e' dopo data1
        boolean date2After = data2.isAfter(data1);
        System.out.println("Is " + data2format + " after " + data1format + " ? " + date2After);

        //verifico se le due date sono uguali ad ora
        boolean dateEquals = data1.isEqual(data2);
        System.out.println("Is " + data2format + " equal to " + data1format + " ? " + dateEquals);
    }
}
