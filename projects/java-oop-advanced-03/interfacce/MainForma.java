package interfacce;

public class MainForma {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(13.1,5.2);
        Triangolo triangolo = new Triangolo(12.6,5.5);
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
