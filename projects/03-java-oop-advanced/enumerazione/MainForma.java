package enumerazione;

public class MainForma {
    public static void main(String[] args) {
        //stampo gli enum
        System.out.println("Ci sono le seguenti forme nell'enum Forma: ");
        for (Forma.EnumForma forma : Forma.EnumForma.values()) {
            System.out.println(forma);
        }
        System.out.println("__________________________________________");

        //creo un Rettangolo e un Triangolo e calcolo la loro area
        Rettangolo rettangolo = new Rettangolo(10.2,4.5);
        Triangolo triangolo = new Triangolo(10.2,4.5);
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
