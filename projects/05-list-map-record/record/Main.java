package record;
//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y

public class Main {
    public static void main(String[] args) {
        XY coordinateXY = new XY(7,9);

        System.out.println("Il nostro punto ha le seguenti coordinate x e y: ");
        System.out.println("coordinata x: " + coordinateXY.x());
        System.out.println("coordinata y: " + coordinateXY.y());
    }
}
