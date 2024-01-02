package designpattern1;

//Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
//Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
//Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
//Stampa a video il risultato della funzione draw di ogni shape creata

public class Main {
    public static void main(String[] args) {
        //creo oggetti di Shape usando la classe Factory
        Shape cerchio = Factory.returnShape(Forma.CERCHIO);
        Shape rettangolo = Factory.returnShape(Forma.RETTANGOLO);
        Shape triangolo = Factory.returnShape(Forma.TRIANGOLO);

        //stampo il draw di ogni oggetto Shape creato
        System.out.println("Cerchio: \n");
        cerchio.draw();

        System.out.println("Rettangolo: \n");
        rettangolo.draw();

        System.out.println("Triangolo: \n");
        triangolo.draw();
    }
}
