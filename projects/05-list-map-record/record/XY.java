package record;
//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y

public record XY (float x, float y) {

    //facendo il record, automaticamente genero il costruttore sottostante
    /*public XY (double x, double y) {
        this.x = x;
        this.y = y;
    }*/
    //inoltre genero automaticamente anche getter e setter
}
