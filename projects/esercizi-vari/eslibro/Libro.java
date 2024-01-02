package eslibro;
//creare classe Libro
//sei attributi privati che rappresentano: il titolo del libro, l'autore, il numero di pagine,
// la versione del libro (cartacea o digitale), il prezzo di lancio ed il prezzo attuale;
//il metodo costruttore di default;
//il costruttore parametrizzato con tutti gli attributi;
//i metodi getter e setter per tutti gli attributi;
//il metodo applicaSconto10  che riduce il prezzo attuale del 10% rispetto al precedente valore di prezzo attuale;
//il metodo applicaSconto che ricevendo come parametro un valore intero rappresentante la percentuale di sconto,
// modifichi il valore del prezzo attuale riducendolo della percentuale indicata dal parametro;
//il metodo toString.
//Creare una classe Libreria che raccoglie dei libri

import java.math.BigDecimal;

public class Libro {
    enum Versione {CARTACEO, DIGITALE}
    private String titolo;
    private String autore;
    private int numPagine;
    Versione versione;
    private BigDecimal prezzoLancio;
    private BigDecimal prezzoAttuale;

    public Libro(String titolo, String autore, int numPagine, Versione versione, BigDecimal prezzoLancio, BigDecimal prezzoAttuale) {
        this.titolo = titolo;
        this.autore = autore;
        this.numPagine = numPagine;
        this.versione = versione;
        this.prezzoLancio = prezzoLancio;
        this.prezzoAttuale = prezzoAttuale;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    public Versione getVersione() {
        return versione;
    }

    public void setVersione(Versione versione) {
        this.versione = versione;
    }

    public BigDecimal getPrezzoLancio() {
        return prezzoLancio;
    }

    public void setPrezzoLancio(BigDecimal prezzoLancio) {
        this.prezzoLancio = prezzoLancio;
    }

    public BigDecimal getPrezzoAttuale() {
        return prezzoAttuale;
    }

    public void setPrezzoAttuale(BigDecimal prezzoAttuale) {
        this.prezzoAttuale = prezzoAttuale;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numPagine=" + numPagine +
                ", versione=" + versione +
                ", prezzoLancio=" + prezzoLancio +
                ", prezzoAttuale=" + prezzoAttuale +
                '}';
    }
}
