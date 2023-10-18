package exceptions;
/*Scrivere una funzione che controlli se un numero int è in un determinato range
Se lo è ritorna true se non lo è lancia un'eccezione*/
public class Exceptions1 {
    public static boolean isInRange(int numToCheck, int startRange, int finishRange) {
        if (numToCheck > startRange && numToCheck < finishRange) {
            return true;
        } else {
            //Questa exception indica che e' stato passato un argument inappropriato o illegale
            throw new IllegalArgumentException(numToCheck + " is not between " + startRange + " and " + finishRange);
        }
    }

    public static void main(String[] args) {
        int myNum = 43;
        int myStart = 2;
        int myFinish = 10;
        try {
            if (isInRange(myNum, myStart, myFinish)) {
                System.out.println(myNum + " is between " + myStart + " and " + myFinish);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR -> " + e);
        }
    }
}
