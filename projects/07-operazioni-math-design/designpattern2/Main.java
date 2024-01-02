package designpattern2;
//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video

//onestamente non ho capito bene la consegna dell esercizio perche non e' in italiano correttissimo, quindi l ho fatta a modo mio
public class Main {
    public static void main(String[] args) {
        //creo  director
        Director director = new Director();

        //coi metodi di Builder e Director creo due oggetti Person
        Person persona1 = director.personBuilder(new Builder(), "Pippo", "Baudo", 50, "Via Ciao 1, Roma, Italia");
        Person persona2 = director.personBuilder(new Builder(), "Cristiano", "Ronaldo", 38, "Rio Ave, Portogallo");

        //stampo gli oggetti Person
        System.out.println(persona1);
        System.out.println(persona2);
    }
}
