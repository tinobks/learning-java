package arraylist2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//mettere in ordine la collezione e stampare il risultato

public class Main {
    public static void main(String[] args) {
        //Creo ArrayList
        ArrayList<Student> myStudents = new ArrayList<>();

        //aggiungo elementi Student all'ArrayList
        myStudents.add(new Student("Mario", 27));
        myStudents.add(new Student("Francesca", 29));
        myStudents.add(new Student("Johnny", 19));
        myStudents.add(new Student("Spippo", 24));
        myStudents.add(new Student("Elisa", 25));
        myStudents.add(new Student("Denzel", 40));
        myStudents.add(new Student("Jastin", 23));
        myStudents.add(new Student("Paolo", 30));
        myStudents.add(new Student("Sofia", 31));
        myStudents.add(new Student("Simone", 25));
        myStudents.add(new Student("Giovanni", 22));
        myStudents.add(new Student("Sara", 23));

        //stampo la collezione prima di metterlo in ordine
        System.out.println("Collezione di studenti non ordinato:");
        printStudent(myStudents);

        System.out.println("-------------------------------------------------");

        //sort in ordine alfabetico e stampo
        myStudents.sort(Comparator.comparing(Student::getName));
        System.out.println("Collezione di studenti ordinato alfabeticamente:");
        printStudent(myStudents);

        System.out.println("-------------------------------------------------");

        //sort in ordine di eta e stampo
        myStudents.sort(Comparator.comparing(Student::getAge));
        System.out.println("Collezione di studenti ordinato in base all'età:");
        printStudent(myStudents);
    }

    //funzione che stampa studenti (serve per non ripetere ogni volta la stampa)
    public static void printStudent(ArrayList<Student> myStudents) {
        for (Student studente : myStudents) {
            System.out.println(studente.getName()+ ", " + "età: " + studente.getAge());
        }
    }
}
