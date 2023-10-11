package interfacce;

class Triangolo implements Forma {
    private double base;
    private double altezza;

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

    @Override
    public void calcolaArea() {
        System.out.println("L'area del triangolo è: " + (base * altezza)/2);
    }
}
