package linkedlist;
//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

public class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    //metodo per ottenere informazioni riguardo il name
    public String getName() {
        return name;
    }
}
