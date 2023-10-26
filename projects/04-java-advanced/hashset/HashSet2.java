package hashset;
//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> myHashSet = myHashSetCreator();
        System.out.println(myHashSet);

        //creo oggetto dello stesso tipo dentro l HashSet (String)
        String elementToAdd = "java";
        //aggiungo l elemento creato a myHashSet
        myHashSet.add(elementToAdd);

        //verifico se l'elemento che ho aggiunto e' effetivamente dentro l'HashSet e stampo
        if (myHashSet.contains(elementToAdd)) {
            System.out.println("Elemento '" + elementToAdd + "' aggiunto :");
            System.out.println(myHashSet);
        } else {
            System.out.println("Elemento '" + elementToAdd + "' non e' presente dentro l'HashSet");
        }
    }

    public static HashSet<String> myHashSetCreator() {
        HashSet<String> myFirstHashSet = new HashSet<>();
        myFirstHashSet.add("develhope");
        myFirstHashSet.add("studio");
        myFirstHashSet.add("collections");

        return myFirstHashSet;
    }
}
