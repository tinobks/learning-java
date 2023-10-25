package box;
//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing

import static java.lang.Integer.sum;

public class Boxing {
    public static void main(String[] args) {
        //primitivi
        int intPrimitive = 1;
        double doublePrimitive = 2.77;
        char charPrimitive = 't';

        //autoboxing dei primitivi
        //con i valori 'autoboxati' ho accesso a dei metodi a cui non posso accedere coi valori primitivi
        Integer myInteger = intPrimitive;
        Double myDouble = doublePrimitive;
        Character myCharacter = charPrimitive;

        //unboxing (faccio diventare di nuovo primitivi)
        int againPrimitiveInt = myInteger;
        double againPrimitiveDouble = myDouble;
        char againPrimitiveChar = myCharacter;

    }

    public static void intSum(int num1, int num2) {
        System.out.println(num1+num2);
    }

    public static void charPrint(char myChar) {
        System.out.println(myChar);
    }

    public static void myIntegerSum(Integer num1, Integer num2) {
        System.out.println(num1+num2);
    }

    public static void myCharacterPrint(Character myChar) {
        System.out.println(myChar);
    }
}
