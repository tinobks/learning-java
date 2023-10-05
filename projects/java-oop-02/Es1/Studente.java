public class Studente {
    private String nome;
    private String cognome;
    private String identificativo;

    //metodo costruttore per la classe Studente
    public Studente(String nome,String cognome,String identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    //getter e setter
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getIdentificativo() {
        return identificativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }
}
