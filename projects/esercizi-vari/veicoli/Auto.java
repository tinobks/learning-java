package veicoli;

enum Segmento {
    CITYCAR,
    UTILITARIA,
    SW,
    SUV,
    SPORTIVA
}
public class Auto extends Veicolo {
    private Segmento segmento;
    private int cilindrata;
    private String targa;
    private int porte;

    public Auto(Segmento segmento, int cilindrata, String targa, int porte) {
        this.segmento = segmento;
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.porte = porte;
    }
}
