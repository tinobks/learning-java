package date;

import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

public class Es3 {
    public static void main(String[] args) {
        //creo oggetto OffsetDateTime
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(myDate);

        //ottengo e stampo anno, mese ecc. usando i metodi getYear ecc.
        //ho usato direttamente i metodi al posto di creare le variabili in quanto
        //i metodi hanno gia i nomi che fanno capire chiaramente cosa ottengo
        System.out.println("Year: " + myDate.getYear() + "\nMonth: " + myDate.getMonth() +
                "\nDay: " + myDate.getDayOfMonth() + "\nDay of Week: " + myDate.getDayOfWeek());
    }
}
