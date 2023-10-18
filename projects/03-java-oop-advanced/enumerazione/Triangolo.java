package enumerazione;

class Triangolo extends Forma {
    private double base;
    private double altezza;
    private EnumForma forma = EnumForma.Triangolo;

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
        System.out.println("L'area del " + forma + " è: " + (base * altezza)/2);
    }
}
