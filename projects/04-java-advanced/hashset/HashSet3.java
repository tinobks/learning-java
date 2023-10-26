package hashset;
//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        //creo l'HashSet e lo stampo
        HashSet<String> myHashSet = myHashSetCreator();
        System.out.println("HashSet : " + myHashSet);

        //creo oggetto dello stesso tipo e popolo l hashset e stampo
        String elementToAdd = "HashSetIsFun";
        myHashSet.add(elementToAdd);
        System.out.println("HashSet dopo aver aggiunto '" + elementToAdd + "' : " +myHashSet);

        //scorro hashset ed elimino l elemento da eliminare se presente
        String elementToRemove = "collections";
        removeFromHashSet(myHashSet, elementToRemove);
        System.out.println("HashSet dopo aver rimosso '" + elementToRemove + "' : " +myHashSet);

        //svuoto HashSet,verifico e stampo
        myHashSet.clear();
        checkHashSetClear(myHashSet);
    }

    //funzione che scorre il set e rimuove l oggetto da verificare (se e' presente)
    public static HashSet<String> removeFromHashSet(HashSet<String> myHashSet, String elementToRemove) {
        //intelliJ mi ha consigliato di usare questo al posto di for loop e mi e' piaciuto :P
        myHashSet.removeIf(elemento -> elemento.equals(elementToRemove));
        return myHashSet;
    }

    //funzione che fa il check se un hashset e' vuoto e stampa il risultato
    public static void checkHashSetClear(HashSet<String> myHashSet) {
        if (myHashSet.isEmpty()) {
            System.out.println("L'HashSet e' vuoto : " + myHashSet);
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
