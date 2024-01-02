package veicoli;
//Si desidera sviluppare un'applicazione Java che gestisca il noleggio di veicoli.
//I veicoli possono essere di tre tipi: Auto, Biciclette, Barche.
//Entrambi i tipi di veicoli condividono alcune caratteristiche comuni, ma hanno anche attributi specifici.

public class Veicolo {
    private String marca;
    private String modello;
    private String carburante;
    private String colore;
    private int posti;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getCarburante() {
        return carburante;
    }

    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }
}
