package Esercizio8;
//E' necessario scrivere una applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare.
//Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:
//- il numero di telefono
//- il credito disponibile in euro
//- la lista delle telefonate effettuate

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;

//Per ciascuna telefonata deve essere rappresentata la durata in minuti
//La classe SIM dovrà fornire le seguenti funzionalità:
//- un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle telefonate vuota
//- un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
//- una funzione per il calcolo dei minuti totali di conversazione.
//- una funzione per il calcolo delle telefonate effettuate verso un certo numero
//- una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.
public class Main {
    public static void main(String[] args) {

        Chiamata chiamata1 = new Chiamata(1234,4321, OffsetDateTime.now(), 15);
        Chiamata chiamata2 = new Chiamata(2222,3333, OffsetDateTime.now(), 40);
        Chiamata chiamata3 = new Chiamata(4321,1234, OffsetDateTime.now(), 60);

        ArrayList<Chiamata> listaChiamate1 = new ArrayList<>();
        listaChiamate1.add(chiamata1);
        listaChiamate1.add(chiamata2);
        listaChiamate1.add(chiamata3);

        Sim sim1 = new Sim(1234, BigDecimal.valueOf(0.1), listaChiamate1);


        System.out.println(sim1.getListaChiamate());
    }
}
