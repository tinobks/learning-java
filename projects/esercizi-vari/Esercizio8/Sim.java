package Esercizio8;
//E' necessario scrivere una applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare.
//Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:
//- il numero di telefono
//- il credito disponibile in euro
//- la lista delle telefonate effettuate

import java.math.BigDecimal;
import java.util.ArrayList;

//Per ciascuna telefonata deve essere rappresentata la durata in minuti
//La classe SIM dovrà fornire le seguenti funzionalità:
//- un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle telefonate vuota
//- un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
//- una funzione per il calcolo dei minuti totali di conversazione.
//- una funzione per il calcolo delle telefonate effettuate verso un certo numero
//- una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.
public class Sim {
    private final int numero;
    private BigDecimal credito;
    ArrayList<Chiamata> listaChiamate;

    public Sim(int numero, BigDecimal credito, ArrayList<Chiamata> listaChiamate) {
        this.numero = numero;
        this.credito = credito;
        this.listaChiamate = filtroListaChiamate(listaChiamate);
    }

    public int getNumero() {
        return numero;
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public ArrayList<Chiamata> getListaChiamate() {
        return listaChiamate;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }

    public void setListaChiamate(ArrayList<Chiamata> listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    public ArrayList<Chiamata> filtroListaChiamate(ArrayList<Chiamata> listaChiamate) {
        ArrayList<Chiamata> listaFiltrata = new ArrayList<>();
        for (Chiamata attuale : listaChiamate) {
            if (attuale.getNumEntrata() == this.numero || attuale.getNumUscita() == this.numero) {
                listaFiltrata.add(attuale);
            }
        }
        return listaFiltrata;
    }
}
