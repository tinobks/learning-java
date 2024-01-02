package contocorrente;
//Crea un programma per la gestione di un controcorrente
//Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire il saldo
//e di effettuare la lista degli ultimi 5 movimenti .
public class CC {
    protected Valuta tipovaluta;
    private String intestatario;
    private String iban;
    private double saldo;

    public CC(String intestatario, String iban, double saldo, Valuta tipovaluta) {
        this.intestatario = intestatario;
        this.iban = iban;
        this.saldo = saldo;
        this.tipovaluta = tipovaluta;
    }

    public Valuta getTipovaluta() {
        return tipovaluta;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CC{" +
                "tipovaluta=" + tipovaluta +
                ", intestatario='" + intestatario + '\'' +
                ", iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    //versamento

}
