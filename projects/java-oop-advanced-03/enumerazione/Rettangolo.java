package enumerazione;

class Rettangolo extends Forma{
    private double base;
    private double altezza;
    private EnumForma forma = EnumForma.Rettangolo;

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
        System.out.println("L'area del " + forma + " è: " + base * altezza);
    }
}
