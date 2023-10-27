package arraylist2;
//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//mettere in ordine la collezione e stampare il risultato

public class Student {
    private String name;
    private int age;

    //metodo costruttore
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //metodi per ottenere le informazioni
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
