package designpattern1;

//Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.

public class Factory {
    public static Shape returnShape(Forma forma) {
        return switch (forma) {
            case CERCHIO -> new Cerchio();
            case RETTANGOLO -> new Rettangolo();
            case TRIANGOLO -> new Triangolo();
        };
    }
}
