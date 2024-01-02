package Esercizio8;

import java.time.OffsetDateTime;

//Per ciascuna telefonata deve essere rappresentata la durata in minuti
//La classe SIM dovrà fornire le seguenti funzionalità:
//- un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle telefonate vuota
//- un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
//- una funzione per il calcolo dei minuti totali di conversazione.
//- una funzione per il calcolo delle telefonate effettuate verso un certo numero
//- una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.

public class Chiamata {
    private int numEntrata;
    private int numUscita;
    private OffsetDateTime data;
    private int durata;

    public Chiamata(int numEntrata, int numUscita, OffsetDateTime data, int durata) {
        this.numEntrata = numEntrata;
        this.numUscita = numUscita;
        this.data = data;
        this.durata = durata;
    }

    public int getNumEntrata() {
        return numEntrata;
    }

    public int getNumUscita() {
        return numUscita;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public int getDurata() {
        return durata;
    }

    public void setNumEntrata(int numEntrata) {
        this.numEntrata = numEntrata;
    }

    public void setNumUscita(int numUscita) {
        this.numUscita = numUscita;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "numEntrata=" + numEntrata +
                ", numUscita=" + numUscita +
                ", data=" + data +
                ", durata=" + durata +
                '}';
    }
}
