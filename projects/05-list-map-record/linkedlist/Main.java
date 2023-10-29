package linkedlist;
//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

import arraylist2.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //creo LinkedList e stampo
        LinkedList<Fruit> myFruits = new LinkedList<>();
        myFruits.add(new Fruit("Mela"));
        myFruits.add(new Fruit("Pera"));
        myFruits.add(new Fruit("Banana"));
        myFruits.add(new Fruit("Pesca"));
        System.out.println("Elementi della linked list prima di aggiungere elementi: ");
        printLinkedFruits(myFruits);
        System.out.println("---------------------------------------------------------");

        //aggiungo elemento al primo posto della lista e uno all ultimo e stampo
        myFruits.addFirst(new Fruit("Uva"));
        myFruits.addLast(new Fruit("Prugna"));
        System.out.println("Elementi della linked list dopo l' aggiunta di elementi al primo e all'ultimo posto: ");
        printLinkedFruits(myFruits);
    }

    //metodo per stampare linked list fruit
    public static void printLinkedFruits(LinkedList<Fruit> ll) {
        for (Fruit myFruit : ll) {
            System.out.println(myFruit.getName());
        }
    }

}
