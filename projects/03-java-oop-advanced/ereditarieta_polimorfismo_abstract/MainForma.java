//creato package per non avere conflitti con nomi delle classi
package ereditarieta_polimorfismo_abstract;

public class MainForma {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10.2,4.5);
        Triangolo triangolo = new Triangolo(10.2,4.5);
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
