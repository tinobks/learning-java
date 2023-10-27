package arraylist1;
//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creo ArrayList
        ArrayList<Student> myStudents = new ArrayList<>();

        //aggiungo elementi Student all'ArrayList
        myStudents.add(new Student("Mario", 27));
        myStudents.add(new Student("Francesca", 29));
        myStudents.add(new Student("Johnny", 19));
        //stampo gli studenti dentro l array
        System.out.println("Lista Studenti prima dell'arrivo di nuovi studenti:");
        int counter = 1;
        studentPrintWithCounter(myStudents);

        //aggiungo 4 elementi e stampo di nuovo l arraylist di studenti aggiornato
        myStudents.add(new Student("Spippo", 24));
        myStudents.add(new Student("Elisa", 25));
        myStudents.add(new Student("Denzel", 40));
        myStudents.add(new Student("Jastin", 23));
        System.out.println("-----------------------------------------------");
        System.out.println("Lista Studenti dopo l'arrivo di nuovi studenti:");
        studentPrintWithCounter(myStudents);
    }

    //funzione che stampa una lista di student con un counter Studente x
    public static void studentPrintWithCounter(ArrayList<Student> myStudents) {
        int counter = 1;
        for (Student studente : myStudents) {
            System.out.println("Studente " + counter +": " + studente.getName() + ", età: " + studente.getAge());
            counter++;
        }
    }
}
