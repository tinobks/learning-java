package date;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

public class Es3 {
    public static void main(String[] args) {
        //creo stringa e faccio il parsing
        String stringToParse = "2023-03-01T13:00:00Z";
        OffsetDateTime myDate = stringParser(stringToParse);

        //ottengo e stampo anno, mese ecc.
        System.out.println("Year: " + year(myDate) + "\nMonth: " + month(myDate) +
                "\nDay: " + dayOfMonth(myDate) + "\nDay of Week: " + dayOfWeek(myDate));
    }

    public static OffsetDateTime stringParser(String date) {
        return OffsetDateTime.parse(date);
    }

    public static int year(OffsetDateTime myDate) {
        return myDate.getYear();
    }

    public static Month month(OffsetDateTime myDate) {
        return myDate.getMonth();
    }

    public static int dayOfMonth(OffsetDateTime myDate) {
        return myDate.getDayOfMonth();
    }

    public static DayOfWeek dayOfWeek(OffsetDateTime myDate) {
        return myDate.getDayOfWeek();
    }
}
