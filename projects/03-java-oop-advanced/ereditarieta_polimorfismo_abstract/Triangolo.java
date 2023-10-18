package ereditarieta_polimorfismo_abstract;

class Triangolo extends Forma {
    //dichiaro attributi PRIVATE del Triangolo, in modo tale da renderli accessibili solo all'interno di questa classe
    private double base;
    private double altezza;

    //metodo costruttore
    public Triangolo(double base, double altezza) {
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

    //metodo calcolaArea() per il triangolo
    @Override
    public void calcolaArea() {
        System.out.println("L'area del triangolo è: " + (base * altezza)/2);
    }
}
