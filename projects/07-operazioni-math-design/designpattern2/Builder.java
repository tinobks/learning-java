package designpattern2;
//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video

//onestamente non ho capito bene la consegna dell esercizio perche non e' in italiano correttissimo, quindi l ho fatta a modo mio

public class Builder {
    private Person person = new Person();

    public void buildName(String name) {
        person.setFirstName(name);
    }

    public void buildLastName(String lastName) {
        person.setLastName(lastName);
    }

    public void buildAge(int age) {
        person.setAge(age);
    }

    public void buildAddress(String address) {
        person.setAddress(address);
    }

    public Person getPerson() {
        return person;
    }
}
