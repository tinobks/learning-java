/*primo e secondo esercizio Auto sono nello stesso file in quanto entrambi
li ho svolti facendo si che le variabili siano dichiarate come 'private',
per renderli accessibili solo attraverso i metodi get e set.*/

public class Auto {
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    //metodo costruttore
    public Auto(String marca,String modello, int cilindrata, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.targa = targa;
    }

    //getter e setter
    public int getCilindrata() {
        return cilindrata;
    }
    public String getTarga() {
        return targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
}