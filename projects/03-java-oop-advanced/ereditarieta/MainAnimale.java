package ereditarieta;

public class MainAnimale {
    public static void main(String[] args) {
        Animale unknownAnimale = new Animale();
        Gatto gatto = new Gatto();
        //verso animale generico
        unknownAnimale.faiIlVerso();
        //verso del gatto
        gatto.faiIlVerso();
    }
}
