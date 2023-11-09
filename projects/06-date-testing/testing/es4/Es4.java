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

public class Es4 {
    /*public static void main(String[] args) {
        //creo oggetto OffsetDateTime
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(myDate);

        //ottengo e stampo anno, mese ecc. usando i metodi getYear ecc.
        //ho usato direttamente i metodi al posto di creare le variabili in quanto
        //i metodi hanno gia i nomi che fanno capire chiaramente cosa ottengo
        System.out.println("Year: " + myDate.getYear() + "\nMonth: " + myDate.getMonth() +
                "\nDay: " + myDate.getDayOfMonth() + "\nDay of Week: " + myDate.getDayOfWeek());*/


    //creo metodi con cui posso fare test
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
