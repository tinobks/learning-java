package ereditarieta_polimorfismo_abstract;

class Rettangolo extends Forma {
    //dichiaro attributi PRIVATE del Rettangolo, in modo tale da renderli accessibili solo all'interno di questa classe
    private double base;
    private double altezza;

    //metodo costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //getter e setter
    public double getBase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    //metodo calcolaArea() per il rettangolo
    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + base * altezza);
    }
}
