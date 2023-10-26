package hashset;
//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> myHashSet = myHashSetCreator();
        //stampo grandezza dell'hashset che ho creato con size()
        System.out.println("Grandezza dell' HashSet : " + myHashSet.size());

        //stampo elementi dell'hashset usando for loop
        System.out.println("Elementi all'interno dell' HashSet :");
        for (String elemento : myHashSet) {
            System.out.println(elemento);
        }

        System.out.println(myHashSet);
    }

    public static HashSet<String> myHashSetCreator() {
        HashSet<String> myFirstHashSet = new HashSet<>();
        myFirstHashSet.add("develhope");
        myFirstHashSet.add("studio");
        myFirstHashSet.add("collections");

        return myFirstHashSet;
    }
}
