package exceptions;
//Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
public class Exceptions2 {
    public static void isNumber(char myChar) {
        //Metodo isdigit () viene utilizzato per determinare se il carattere specificato è una cifra.
        if (Character.isDigit(myChar)) {
            System.out.println("The character '" + myChar + "' is a number");
        } else {
            //Questa exception indica che e' stato passato un argument inappropriato o illegale
            throw new IllegalArgumentException("The character '" + myChar + "' is NOT a number");
        }
    }

    public static void main(String[] args) {
        try {
            isNumber('a');
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR -> " + e);
        }
    }
}
